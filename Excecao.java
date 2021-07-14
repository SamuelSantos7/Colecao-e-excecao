package familia28;

public class Excecao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = null,novaFrase=null;
		
		try 
		{
			novaFrase = frase.toUpperCase();
		}
		catch(NullPointerException e) //captura da possível exceção
		{
			System.out.println("\nA frase inicial está nula, para solucionar "
			+"Tal problema, foi atribuído um valor default...."		);
			frase = "Frase vazia";
			novaFrase = frase.toUpperCase();
		
		}
		
		System.out.println("\nFrase antiga : "+frase);
		System.out.println("\nNova Frase : "+novaFrase);
		
	}

}
