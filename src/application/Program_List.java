package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program_List {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco"); // Adiciona o Marco na posi��o 2
		
		System.out.println(list.size()); // Tamanho da lista
		System.out.println("-------------------------");
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("-------------------------");
		list.remove("Anna"); // list.remove(4); tamb�m serve o LIST reconhece compara��es
		list.removeIf(x -> x.charAt(0) == 'M'); // pega um valor x e me retorna se X na posi��o 0 � igual a M // remove todo mundo que a primeira letra � M
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("-------------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("-------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); // converte pra stream, faz a opera��o lambda e depois retorna para lista
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("-------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null); //vai pegar o primeiro elemento da stream que atende o predicado (come�ar com A maiusculo), se o elemento nao existir, retorna nulo.
		System.out.println(name);
		
	}

}
