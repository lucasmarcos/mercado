package utfpr;

import java.util.HashMap;
import java.util.Map;

public class Pedido {
	private HashMap<Produto, Integer> produtos;
	private String metedoPagamento;

	public Pedido(String metodoPagamento) {
		this.metedoPagamento = metodoPagamento;
		produtos = new HashMap<Produto, Integer>();
	}

	public void adicionarProduto(Produto produto, Integer quantidade) {
		produtos.put(produto, quantidade);
	}

	public Double valorTotal() {
		Double total = 0.0;

		for (Map.Entry<Produto, Integer> par : this.produtos.entrySet()) {
			total += par.getKey().getValor() * par.getValue();
		};

		return total;
	}
}
