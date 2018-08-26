package contas;

import classes.Pessoa;

public final class ContaComum extends Conta implements Taxas{

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
	@Override
	public float getTaxaManutencao() {
	
		return 15.00f;
	}
	@Override
	public void descontarTaxaManuntecao() {
	
		this.setSaldo(this.getSaldo()-this.getTaxaManutencao());
		
	}
}
