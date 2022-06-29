package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> listaMercado = new ArrayList<>();

		listaMercado.add("Macarrão");
		listaMercado.add("feijão");
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
			System.out.println("Posição do sal: " + posSal); // Mostra no Array em qual posição o item se encontra!
			
			int posFarinha = listaMercado.indexOf("Farinha");
			System.out.println("Pasição da farinha: " + posFarinha); // Toda vez que ele não encontrar  a posição na lista. O retorno será -1.

		}
	}

}
