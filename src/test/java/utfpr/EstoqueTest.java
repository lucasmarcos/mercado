package utfpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EstoqueTest {
	@Test
	void test() {
		Estoque estoque = new Estoque();

		Produto banana = new Produto("Banana", 10.00);

		estoque.adicionarProduto(banana, 124);

		assertEquals(estoque.qtdEmEstoque(banana), 124);

		assertTrue(estoque.conferirEstoque(banana, 123));
		assertTrue(estoque.conferirEstoque(banana, 124));
		assertFalse(estoque.conferirEstoque(banana, 125));

		estoque.atualizarProduto(banana, 320);
		assertEquals(estoque.qtdEmEstoque(banana), 320);

		estoque.removerProduto(banana);
		assertEquals(estoque.qtdEmEstoque(banana), 0);

		estoque.adicionarProduto(banana, 10);
		estoque.adicionarProduto(banana, 4);

		assertEquals(estoque.qtdEmEstoque(banana), 14);
	}

}


