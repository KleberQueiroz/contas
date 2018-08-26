package apps;

import classes.Pessoa;
import contas.ContaEspecial;

public class AppContaEspecial {

	public static void main(String[] args) {

		ContaEspecial e1 ;
		Pessoa p1 = new Pessoa ("Fulanos", "fulanos@gmail.com");
		e1=new ContaEspecial(1234,p1,0.00f, -1000.00f);
		
		System.out.println("Saldo inicial da conta : "+ e1.getSaldo());
		System.out.println("O limite da conta � de : "+e1.getLimite());
		
		if (e1.sacar(1001.00f)) {
		System.out.println("Opera��o de sacar realizado com sucesso !!");
		}else
		System.out.println("Limite isuficiente para realiza��o do saque.");
		
		System.out.println("Saldo da conta : "+ e1.getSaldo());
		
		e1.descontarTaxaManuntecao();
		
		System.out.println("Saldo ap�s descontar a taxa de manuten��o " + e1.getSaldo());
		

}

}
