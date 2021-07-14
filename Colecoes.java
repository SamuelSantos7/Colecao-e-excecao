package familia28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Colecoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//estou criando um collection do tipo List e estou criando um 
		//objeto minhaLista para iniciar com o ArrayList
		List<Integer> minhalista = new ArrayList<Integer>();
		
		minhalista.add(2); //posição 0// //add serve para adicionar um valor na posição 
		minhalista.add(1); //posição 1
		minhalista.add(2);
		minhalista.add(6);
		minhalista.add(1);
		
		for(Integer lista:minhalista) 
		{
			System.out.println(lista);
		}
		
		System.out.println("\nRemovendo um elemento da minha lista ");
		
		minhalista.remove(0); // remove um elemento da minha lista 
		
		for(Integer lista:minhalista) 
		{
			System.out.println(lista);
		}
		
		int primeiroElemento = minhalista.get(0);
		System.out.println("\nO primeiro elemento é : "+primeiroElemento);
		System.out.println();
		
		for(int i=0;i<minhalista.size();i++) //
		{
			System.out.println("\nElemento : "+minhalista.get(i));
		}
		
		Collections.sort(minhalista); // o método sort vai ordenar a minha ArrayList
		System.out.println("\nDepois de ordenado ... ");
		System.out.println(minhalista);
		
		System.out.println();
		
		Set<Integer> meuSet = new HashSet<Integer>(); //estou criando o Set apartir do método HashSet
		
		meuSet.add(2);
		meuSet.add(1);
		meuSet.add(2);
		meuSet.add(4);
		meuSet.add(3); //estou adicionando elementos ao meu HashSet
		
		Iterator<Integer> iMeuSet = meuSet.iterator(); // estou criando uma nova interface tipo Iterator
	
		while(iMeuSet.hasNext()) // hasNext vai percorrer todo meu collection da primeira posição até a última posição 
		{
			System.out.println(iMeuSet.next()); // vou imprimir cada posição indicando sempre a próxima posição através do meu método next
		}
	
		
	
	
	}

}
