package utfpr;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class ClienteTest {
	@Test
	void getNome() {
		String nome = "Cliente A";
		Cliente cliente = new Cliente(nome);
		assertEquals(cliente.getNome(), nome);
	}    
}