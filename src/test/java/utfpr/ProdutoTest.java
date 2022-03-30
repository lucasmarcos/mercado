package utfpr;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class ProdutoTest {
	private Produto produto;
	
	@BeforeEach
	void setup() {
		String nome = "Banana";
		Double valor = 10.00;
		this.produto = new Produto(nome, valor);
	}
	
	@Test
	void getNome() {
		assertEquals(produto.getNome(), "Banana");
	}
	
	@Test
	void getValor() {
		assertEquals(produto.getValor(), 10.00);
	}
}
