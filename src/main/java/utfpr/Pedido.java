package utfpr;

import java.util.HashMap;
import java.util.Map;

public class Pedido {
	private HashMap<Produto, Integer> produtos;
	private Pagamento pagamento;

	public Pedido(Pagamento pagamento) {
		this.pagamento = pagamento;
		produtos = new HashMap<Produto, Integer>();
	}

	public void adicionarProduto(Produto produto, Integer quantidade) {
		produtos.put(produto, quantidade);
	}

	public Double valorTotal() {
		Double total = 0.0;

		for (Map.Entry<Produto, Integer> par : this.produtos.entrySet()) {
			Double custo = par.getKey().getValor() * par.getValue();
			total += custo + custo * pagamento.getJuros();
		};

		return total;
	}
}
