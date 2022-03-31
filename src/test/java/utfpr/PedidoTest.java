package utfpr;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class PedidoTest {
	private Pagamento pix, cartao, cheque;
	private Produto banana;

	@BeforeEach
	void setup() {
		this.pix = new Pagamento("Pix", 0.0);
		this.cartao = new Pagamento("Cartão", 5.0);
		this.cheque = new Pagamento("Cheque", 5.0);
		this.banana = new Produto("Banana", 10.00);
	}

	@Test
	void semJuros() {
		Pedido pedido = new Pedido(this.pix);
		pedido.adicionarProduto(this.banana, 10);
		assertEquals(pedido.valorTotal(), 100.00);
	}
	
	@Test
	void comJuros() {
		Pedido pedido = new Pedido(this.cartao);
		pedido.adicionarProduto(this.banana, 1);
		assertEquals(pedido.valorTotal(), 10.5);
	}	

	@Test
	void atualizar() {
		Pedido pedido = new Pedido(this.cheque);
		pedido.adicionarProduto(banana, 1);
		pedido.adicionarProduto(banana, 1);
		pedido.adicionarProduto(banana, 1);
		assertEquals(pedido.qtd(banana), 3);
	}	
}
