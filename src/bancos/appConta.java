package bancos;

public class appConta {

	public static void main(String[] args) {

		Conta c1 = new Conta();
		
		c1.setCorrentista("Fulano");
		c1.setMumero(129845);
		c1.setValor(150.00f);
		
		System.out.println("O nome do correntista é :" +c1.getCorrentista());
		System.out.println("O numero da conta é :" +c1.getMumero());
		System.out.println("O valor inicial da conta é :" +c1.getValor());
		
	}

}
