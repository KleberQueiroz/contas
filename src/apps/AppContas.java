package apps;

import classes.Pessoa;
import contas.Conta;
import contas.ContaComum;
import contas.ContaEspecial;

public class AppContas {
public static void main(String[] args) {

	Pessoa p1 = new Pessoa("Fulano", "fulano@gmail.com");
	Pessoa p2 = new Pessoa("Ciclano", "ciclano@gmail.com");
	Conta c1 = new ContaComum(124567,p1,150.00f);
	
	System.out.println(" Número de contas criadas: "+ c1.getNumeroContas());
	
	ContaEspecial e1 = new ContaEspecial(123456, p2,2500.00f,5500.00f );
	
	System.out.println(" Número de contas criadas: "+ e1.getNumeroContas());
	
	
	if(c1.movimentar(151.00f, Conta.SACAR))
		System.out.println("Saque Realizado com Sucesso");
	else
		System.out.println("Impossivel realizar o saque");
}
}
