package utfpr;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class MercadoTest {
	@Test
	void vender() {
		Mercado mercado = new Mercado();
		Cliente cliente = new Cliente("Cliente A");
		Produto cafe = new Produto("Café", 2.99);
		Pagamento dinheiro = new Pagamento("Dinheiro", 0.0);
		Pedido pedido = new Pedido(dinheiro);
		
		mercado.getEstoque().adicionarProduto(cafe, 1024);
		pedido.adicionarProduto(cafe, 512);
		
		boolean resultado = mercado.efetuarPedido(pedido, cliente);
		
		assertTrue(resultado);
	}
} 
