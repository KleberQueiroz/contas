package bancos;

public class Conta {

	private int mumero;
	private String correntista;
	private float valor;
	
	public Conta() {
		
	}

	public int getMumero() {
		return mumero;
	}

	public void setMumero(int mumero) {
		this.mumero = mumero;
	}

	public String getCorrentista() {
		return correntista;
	}

	public void setCorrentista(String correntista) {
		this.correntista = correntista;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
}
