import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		Locale.setDefault(Locale.US);	
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
		//Casting -> convers�o expl�cita de tipos de dados		
		
		int a, b;
		double resultado;
		
		a = 5;
		b = 2;
		
		resultado = (double) a / b;
		
		System.out.println(resultado);
		
		
		//Entrada de dados
		
		Scanner sc = new Scanner(System.in);
		
		  int x;
		  x = sc.nextInt(); // L� inteiros
		//x = sc.next(); l� string
		//x = sc.nextDouble(); l� double
		//x = sc.next().charAt(0); l� a primeira letra, por isso come�a com 0 
		//x = sc.nextLine(); L� tudo que est� na linha  
		  
		  System.out.println("Voc� digitou: " + x);
		
		sc.close();
		
		//A = Math.sqrt(x); -> A recebe a raiz quadrada de x
		//A = Math.pow(x, y); -> A recebe o resultado de x elevado a y
		//A = Math.abs(x); -> A recebe o valor absoluto de x

	}	

}
