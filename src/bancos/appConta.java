package bancos;

public class appConta {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Fulano", "fulano@gmail.com");
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
		
	}

}
