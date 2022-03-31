package utfpr;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class PagamentoTest {
	@Test
	void getters() {
		Pagamento p = new Pagamento("Cheque", 15.0);
		assertEquals(p.getTipo(), "Cheque");
		assertEquals(p.getJuros(), 15.0);
	}
}