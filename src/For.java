import java.util.Locale;
import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		
		/*
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int soma = 0;
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			soma = soma + x;
		}
		
		System.out.println(soma);
		
		sc.close();

       */
		
		/*  EXERCICIO 1 
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		
		if (X < 1 || X > 1000) {
			System.out.println("Digite um número válido!");
		}
		
		for (int i = 0; i <= X; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
		
		*/ 
		
		
		/*  EXERCICIO 2
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int contIn = 0;
		int contOut = 0;
		for (int i = 0; i < N; i++) {
			int X = sc.nextInt();
			 if (X >= 10 && X <= 20) {
				 contIn = contIn + 1;
			 }
			 else {
				 contOut = contOut + 1;
			 }
		}
		
		System.out.println(contIn + " in");
		System.out.println(contOut + " out");
		
		sc.close();
		
	    */
		
		
		/*  EXERCICIO 3
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			double valor1 = sc.nextDouble();
			double valor2 = sc.nextDouble();
			double valor3 = sc.nextDouble();
					
			double media = (valor1 * 2 + valor2 * 3 + valor3 * 5)/ 10;
			
			System.out.printf("%.1f\n ", media);
		}
		
		sc.close();
		
		*/
		
		/*  EXERCICIO 4
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			
			if(b == 0) {
				System.out.println("Divisão impossível");
			}
			else { 
				
				double divisao = (double) a / b;
				
				System.out.printf("%.1f\n", divisao);
			}
			
		}
		
		sc.close();
		
		*/
		
		/*  EXERCICIO 5
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int fat = 1;
		for (int i = 1; i <= N; i++) {
			 fat = fat * i; 

		}
		
		System.out.println(fat);
		
		sc.close();
		
		*/
		
		/*  EXERCICIO 6
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			 if (N % i == 0) {
				 System.out.println(i);
			 }

		}
				
		sc.close();
		
		*/
		
		//  EXERCICIO 7
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if (N <= 0) {
			System.out.println("Digite um número positivo");
		}
		
		for (int i = 1; i <= N; i++) {
			System.out.print(i + " ");
			System.out.print(i * i + " ");
			System.out.println(i * i * i);

		}
				
		sc.close();
		
	}
	
}
