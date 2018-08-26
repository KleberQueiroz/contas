package contas;

import classes.Pessoa;

public class ContaPoupanca extends Conta {

	public ContaPoupanca() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContaPoupanca(int numero, Pessoa correntista, float saldo) {
		super(numero, correntista, saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean sacar(float valor) {
		if (this.getSaldo()>=valor) {
			this.setSaldo((this.getSaldo()-valor));
			return true;
		}			
		return false;

}}
