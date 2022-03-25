package utfpr;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ProdutoTest {
	@Test
	public void prod() {
		String nome = "Banana";
		Double valor = 10.00;

		Produto p = new Produto(nome, valor);

		assertEquals(p.getNome(), "Banana");
		assertEquals(p.getValor(), 10.00);
	}
}
