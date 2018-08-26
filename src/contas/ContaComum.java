package contas;

import classes.Pessoa;

public class ContaComum extends Conta{

	public ContaComum() {
		
	}
	public ContaComum(int numero, Pessoa correntista, float saldo) {
		super( numero, correntista,saldo);
	}
	public boolean sacar(float valor) {
		if (this.getSaldo()>=valor) {
			this.setSaldo((this.getSaldo()-valor));
			return true;
		}			
		return false;
	}
}
