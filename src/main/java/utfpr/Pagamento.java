package utfpr;

// public enum TIPO_PAGAMENTO {
// 	CARTAO, DINHEIRO, CHEQUE
// };

public class Pagamento {
	private String tipo;
	private Double juros;

	public Pagamento(String tipo, Double juros) {
		this.tipo = tipo;
		this.juros = juros;
	}

	public Double getJuros() {
		return juros;
	}

	public String getTipo() {
		return tipo;
	}
}
