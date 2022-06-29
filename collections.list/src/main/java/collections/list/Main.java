package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> listaMercado = new ArrayList<>();

		listaMercado.add("Macarr�o");
		listaMercado.add("feij�o");
		listaMercado.add("ovo");
		listaMercado.add("sal");
		
		Collections.sort(listaMercado);// Ordenar elementos

		System.out.println(listaMercado);

		for (String item : listaMercado) {
			System.out.println("Item: " + item); // Intera todos os elementos  da lista.

			/*
			 * for (int i = 0; i < listaMercado.size(); i++) { String item1 =
			 * listaMercado.get(i); System.out.println("Item => " + item1); }
			 */

			listaMercado.remove(0);
			System.out.println(listaMercado);// Remove o item pelo indice do vetor.

			listaMercado.remove("ovo");
			System.out.println(listaMercado);// Remove o item pelo nome.
			
			System.out.println(listaMercado.contains("sal")); // Faz a busca se existe o item na lista. E traz a resposta como true or false!
			
			int posSal = listaMercado.indexOf("sal");
			System.out.println("Posi��o do sal: " + posSal); // Mostra no Array em qual posi��o o item se encontra!
			
			int posFarinha = listaMercado.indexOf("Farinha");
			System.out.println("Pasi��o da farinha: " + posFarinha); // Toda vez que ele n�o encontrar  a posi��o na lista. O retorno ser� -1.

		}
	}

}
