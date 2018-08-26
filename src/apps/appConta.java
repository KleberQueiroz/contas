package apps;

import bancos.Pessoa;
import contas.Conta;

public class appConta {

	public static void main(String[] args) {

		Pessoa p1 = new classes.Pessoa("Fulano", "fulano@gmail.com");
		Pessoa p2 = new Pessoa("Ciclano", "ciclano@gmail.com");
		Conta c1 = new Conta();
		
		c1.setCorrentista(p1);
		c1.setNumero(129845);
		c1.setSaldo(150.00f);
		
		Conta c2=new Conta (324124,p2, 41234.00f);
		
		System.out.println("O nome do correntista é :" +c1.getCorrentista().getNome());
		System.out.println("O numero da conta é :" +c1.getNumero());
		System.out.println("O valor inicial da conta é :" +c1.getSaldo());
		
		
		System.out.println("O nome do correntista é :" +c2.getCorrentista().getNome());
		System.out.println("O numero da conta é :" +c2.getNumero());
		System.out.println("O valor inicial da conta é :" +c2.getSaldo());
		
		
		if(c2.sacar(4.00f)) 
			System.out.println("Saque efetuado com sucesso");
		else
			System.out.println("Saque Não resalizado - Saldo Insuficiete");
		
		c2.depositar(1000909978.00f);
		System.out.println("Novo Saldo é : "+ c2.getSaldo());
	}
		
}
