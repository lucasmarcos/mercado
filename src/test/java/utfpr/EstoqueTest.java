package utfpr;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class EstoqueTest {
	private Estoque estoque;
	private Produto banana;

	@BeforeEach
	void setup() {
		this.estoque = new Estoque();
		this.banana = new Produto("Banana", 10.00);
	}

	@Test
	void qtdEmEstoque() {
		estoque.adicionarProduto(banana, 124);
		assertEquals(estoque.qtdEmEstoque(banana), 124);
	}

	@Test
	void limiar() {
		estoque.adicionarProduto(banana, 124);
		assertTrue(estoque.conferirEstoque(banana, 123));
		assertTrue(estoque.conferirEstoque(banana, 124));
		assertFalse(estoque.conferirEstoque(banana, 125));
	}

	@Test
	void atualizar() {
		estoque.adicionarProduto(banana, 124);
		estoque.atualizarProduto(banana, 320);
		assertEquals(estoque.qtdEmEstoque(banana), 320);
	}

	@Test
	void remover() {
		estoque.adicionarProduto(banana, 124);
		estoque.removerProduto(banana);
		assertEquals(estoque.qtdEmEstoque(banana), 0);
	}

	@Test
	void somar() {
		estoque.adicionarProduto(banana, 10);
		estoque.adicionarProduto(banana, 4);
		assertEquals(estoque.qtdEmEstoque(banana), 14);
	}
}