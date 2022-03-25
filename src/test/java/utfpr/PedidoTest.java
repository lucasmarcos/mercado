package utfpr;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PedidoTest {
	@Test
	public void pedidos() {
		Pedido pedido = new Pedido("Cartão");
		Produto p1 = new Produto("Banana", 10.00);

		pedido.adicionarProduto(p1, 10);

		assertEquals(pedido.valorTotal(), 100.00);
	}
}
