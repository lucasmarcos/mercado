package utfpr;

import java.util.HashMap;

public class Estoque {
	private HashMap<Produto, Integer> produtos;

	public Estoque() {
		this.produtos = new HashMap<Produto, Integer>();
	}

	public void adicionarProduto(Produto produto, Integer quantidade) {
		if (this.produtos.containsKey(produto)) {
			Integer qtdAnterior = this.produtos.get(produto);
			this.produtos.put(produto, quantidade + qtdAnterior);
		} else {
			this.produtos.put(produto, quantidade);
		}
	}

	public void removerProduto(Produto produto) {
		this.produtos.remove(produto);
	}

	public boolean atualizarProduto(Produto produto, Integer quantidade) {
		if (this.produtos.containsKey(produto)) {
			this.produtos.remove(produto);
			adicionarProduto(produto, quantidade);
			return true;
		} else {
			return false;
		}
	}

	public Integer qtdEmEstoque(Produto produto) {
		if (this.produtos.containsKey(produto)) {
			return this.produtos.get(produto);
		} else {
			return 0;
		}
	}

	public boolean conferirEstoque(Produto produto, Integer quantidade) {
		Integer qtdExistente = this.produtos.get(produto);
		return (quantidade <= qtdExistente);
	}

	public boolean vender(Pedido pedido) {
		for (HashMap.Entry<Produto, Integer> par : pedido.getProdutos().entrySet()) {
			if (!this.conferirEstoque(par.getKey(), par.getValue())) {
				return false;
			}
		}

		for (HashMap.Entry<Produto, Integer> par : pedido.getProdutos().entrySet()) {
			Integer anterior = qtdEmEstoque(par.getKey());
			atualizarProduto(par.getKey(), anterior - par.getValue());
		}

		return true;
	}
}
