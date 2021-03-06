package contas;

import classes.Pessoa;

public final class ContaEspecial extends Conta implements Taxas {

	private float limite;
	
	public ContaEspecial() {
		
	}
	public ContaEspecial(int numero, Pessoa correntista, float saldo, float limite) {
		super( numero, correntista,saldo);
		this.setLimite(limite);
	
	}
	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}
	@Override	
	public boolean sacar (float valor) {
		if (this.getSaldo()-valor >= this.getLimite()){
			this.setSaldo(getSaldo()-valor);
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
