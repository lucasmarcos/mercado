package utfpr;

import java.util.HashMap;

public class Estoque {
	private HashMap<Produto, Integer> produtos;

	public Estoque() {
		this.produtos = new HashMap<Produto, Integer>();
	}

	public void adicionarProduto(Produto produto, Integer quantidade) {
		produtos.put(produto, quantidade);
	}

	public void removerProduto(Produto produto) {

	}

	public void atualizarProduto(Produto produto, Integer quantidade) {

	}

	public Integer qtdEmEstoque(Produto produto) {
		return 0;
	}

	public boolean conferirEstoque(Produto produto, Integer quantidade) {
		return true;
	}
}
