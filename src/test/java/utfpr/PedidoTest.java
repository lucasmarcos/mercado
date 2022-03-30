package utfpr;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class PedidoTest {
	@Test
	void semJuros() {
		Pagamento pix = new Pagamento("Pix", 0.0);
		Produto banana = new Produto("Banana", 10.00);
		Pedido pedido = new Pedido(pix);
		pedido.adicionarProduto(banana, 10);
		assertEquals(pedido.valorTotal(), 100.00);
	}
	
	@Test
	void comJuros() {
		Pagamento cartao = new Pagamento("Cartão", 5.0);
		Produto banana = new Produto("Banana", 10.00);
		Pedido pedido = new Pedido(cartao);
		pedido.adicionarProduto(banana, 1);
		assertEquals(pedido.valorTotal(), 10.5);
	}	
}
