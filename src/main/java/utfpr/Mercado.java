package utfpr;

public class Mercado {
	private Estoque estoque;

	public Mercado() {
		this.estoque = new Estoque();
	}

	public void efetuarPedido(Pedido pedido, Cliente cliente) {
		Double total = pedido.valorTotal();
		estoque.vender(pedido);
	}
}
