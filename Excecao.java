package familia28;

public class Excecao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = null,novaFrase=null;
		
		try 
		{
			novaFrase = frase.toUpperCase();
		}
		catch(NullPointerException e) //captura da poss�vel exce��o
		{
			System.out.println("\nA frase inicial est� nula, para solucionar "
			+"Tal problema, foi atribu�do um valor default...."		);
			frase = "Frase vazia";
			novaFrase = frase.toUpperCase();
		
		}
		
		System.out.println("\nFrase antiga : "+frase);
		System.out.println("\nNova Frase : "+novaFrase);
		
	}

}
