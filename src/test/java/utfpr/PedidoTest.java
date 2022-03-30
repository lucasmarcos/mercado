package utfpr;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PedidoTest {
	@Test
	public void pedidos() {
		Pagamento pix = new Pagamento("Pix", 0.0);
		Pagamento cartao = new Pagamento("Cartão", 5.0);

		Produto banana = new Produto("Banana", 10.00);

		Pedido pedido = new Pedido(pix);

		pedido.adicionarProduto(banana, 10);

		assertEquals(pedido.valorTotal(), 100.00);

		Pedido pedido2 = new Pedido(cartao);
		pedido2.adicionarProduto(banana, 1);

		assertEquals(pedido2.valorTotal(), 10.5);
	}
}
