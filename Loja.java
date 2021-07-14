package familia28;

import java.util.ArrayList;
import java.util.Scanner;

public class Loja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int op;
	        
	        Scanner leia = new Scanner(System.in);
	        
	        ArrayList<String> estoque = new ArrayList();
	        
	        do {
	            System.out.println("\n(1) Deseja armazenar produtos: "+"\n"+"(2) Remover produto: "+"\n"+"(3) Atualizar produto"+"\n"+"(4) Apresentar: "+"\n(0) Encerrar o programa");
	            System.out.println("\n*****************************************");
	            System.out.println("\n\t\tDigite a op��o desejada: ");
	            System.out.println("\n*****************************************");
	            op = leia.nextInt();
	            
	            switch(op)
	            {
	            case 1:
	                leia.nextLine();
	                System.out.println("\nDigite o produto para armazenar ao estoque: ");
	                String produto = leia.nextLine();//ler uma vari�vel do tipo String
	                estoque.add(produto);//adicionar um produto no meu ArrayList
	                break;
	            case 2:
	                leia.nextLine();
	                System.out.println("\nDigite o produto que deseja remover do estoque: ");
	                String produto1 = leia.nextLine();
	                if(estoque.contains(produto1))
	                {
	                    estoque.remove(produto1);
	                }
	                else
	                {
	                    System.out.println("\nProduto n�o existe no estoque...");
	                }
	                System.out.println(estoque);
	                break;
	            case 3:
	                leia.nextLine();
	                System.out.println("\nDigite o produto que quer atualizar: ");
	                String verifica = leia.nextLine();
	                System.out.println("\nDigite o nome do produto que entrar� no lugar de "+verifica+" : ");
	                String novo = leia.nextLine();
	                
	                if(estoque.contains(verifica))
	                {
	                    estoque.remove(verifica);
	                    estoque.add(novo);
	                }
	                else
	                {
	                    System.out.println("\nProduto n�o existente...");
	                }
	                System.out.println(estoque);
	                break;
	            case 4:
	                System.out.println("\nOs produtos do estoque s�o: ");
	                System.out.println(estoque);
	                break;
	                default:
	                    System.out.println("\nFinalizou o programa... Volte sempre...");    
	        }
	    }
	            while(op!=0);
	    }

	
	}


