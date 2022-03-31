package utfpr;

import java.util.HashMap;

public class Pedido {
	private HashMap<Produto, Integer> produtos;
	private Pagamento pagamento;

	public Pedido(Pagamento pagamento) {
		this.pagamento = pagamento;
		produtos = new HashMap<Produto, Integer>();
	}

	public HashMap<Produto, Integer> getProdutos() {
		return this.produtos;
	}

	public void adicionarProduto(Produto produto, Integer quantidade) {
		if (this.produtos.containsKey(produto)) {
			Integer qtdAnterior = this.produtos.get(produto);
			this.produtos.put(produto, quantidade + qtdAnterior);
		} else {
			produtos.put(produto, quantidade);
		}
	}

	public Double valorTotal() {
		Double total = 0.0;

		for (HashMap.Entry<Produto, Integer> par : this.produtos.entrySet()) {
			Double custo = par.getKey().getValor() * par.getValue();
			Double juros = (custo * pagamento.getJuros())/100.0;
			total += custo + juros;
		};

		return total;
	}
	
	public Integer qtd(Produto produto) {
		return produtos.get(produto);
	}
}
