package utfpr;

public class Mercado {
	private Estoque estoque;

	public Mercado() {
		this.estoque = new Estoque();
	}
	
	public Estoque getEstoque() {
		return this.estoque;
	}

	public boolean efetuarPedido(Pedido pedido, Cliente cliente) {
		Double total = pedido.valorTotal();
		return (estoque.vender(pedido));
	}
}
