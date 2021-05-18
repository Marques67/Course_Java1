import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		Locale.setDefault(Locale.US);	
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
		//Casting -> conversão explícita de tipos de dados		
		
		int a, b;
		double resultado;
		
		a = 5;
		b = 2;
		
		resultado = (double) a / b;
		
		System.out.println(resultado);
		
		
		//Entrada de dados
		
		Scanner sc = new Scanner(System.in);
		
		  int x;
		  x = sc.nextInt(); // Lê inteiros
		//x = sc.next(); lê string
		//x = sc.nextDouble(); lê double
		//x = sc.next().charAt(0); lê a primeira letra, por isso começa com 0 
		//x = sc.nextLine(); Lê tudo que está na linha  
		  
		  System.out.println("Você digitou: " + x);
		
		sc.close();
		
		//A = Math.sqrt(x); -> A recebe a raiz quadrada de x
		//A = Math.pow(x, y); -> A recebe o resultado de x elevado a y
		//A = Math.abs(x); -> A recebe o valor absoluto de x

	}	

}
