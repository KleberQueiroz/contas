package contas;

import java.lang.invoke.SwitchPoint;

import classes.Pessoa;

public abstract class Conta {

	private int numero;
	private Pessoa correntista;
	private float saldo;
	private static int numeroContas;
	
	public final static int SACAR = 0;
	public final static int DEPOSITAR =1;	
	

	public Conta() {
		incrementaContas();
	}

	public Conta(int numero, Pessoa correntista, float saldo) {
		this();
		this.setNumero(numero);
		this.setCorrentista(correntista);
		this.setSaldo(saldo);

	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Pessoa getCorrentista() {
		return correntista;
	}

	public void setCorrentista(Pessoa correntista) {
		this.correntista = correntista;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public int getNumeroContas() {
		return Conta.numeroContas;
	}
	
	public final void depositar(float valor) {
		this.setSaldo(this.getSaldo() + valor);
	}

	public abstract boolean sacar(float valor);

	public boolean movimentar(float valor, int operacao) {
		boolean retorno = true;
		switch(operacao){
			case DEPOSITAR:
				this.depositar(valor);
				break;
			case SACAR:
				retorno = this.sacar(valor);
				break;
			default : 
				return false;
		}
		return retorno;
		
	}
	
	private static void incrementaContas() {
		++numeroContas;
	}

}
