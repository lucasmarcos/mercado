package utfpr;

public enum TIPO_PAGAMENTO {
	CARTAO, DINHEIRO, CHEQUE
};

public class Pagamento {
	private TIPO_PAGAMENTO tipo;
	private Double juros;

	public Pagamento(TIPO_PAGAMENTO tipo, Double juros) {
		this.tipo = tipo;
		this.juros = juros;
	}

	public Double getJuros() {
		return juros;
	}

	public TIPO_PAGAMENTO getTipo() {
		return tipo;
	}
}
