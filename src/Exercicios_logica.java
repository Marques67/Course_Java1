import java.util.Locale;
import java.util.Scanner;

public class Exercicios_logica {
	
	public static void main(String[] args) {
	
	/*	EXERCICIO 1
		
		int x, y, soma;
				
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		soma = x + y;	
		
		System.out.println("Soma: " + soma);
		
		sc.close();
		
	*/
		
	/*  EXERCICIO 2	
		Locale.setDefault(Locale.US);
		
		
		double pi, raio, area;
		
		Scanner sc = new Scanner(System.in);
		
		pi = 3.14159;
		
		raio = sc.nextDouble();
		
		area = pi * Math.pow(raio, 2);
		
		System.out.printf("A = %.4f\n", area);
		
		sc.close();
		
	*/
		
	/* EXERCICIO 3	
		
		int A, B, C, D, diferenca;
		
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		diferenca = A * B - C * D;
		
		System.out.println("Diferença = " + diferenca);
		
		sc.close();
		
	*/
		
	/*  EXERCICIO 4	
		
		int numero, horas;
		double valor, salario;
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		numero = sc.nextInt();
		horas = sc.nextInt();
		valor = sc.nextDouble();
		
		salario = horas * valor;
		
	    System.out.println("Número: " + numero);
	    System.out.printf("Sálario = R$ %.2f\n", salario);
		
		sc.close();
		
	*/
		
	/*  EXERCICIO 5	
		
		int cod1, num1, cod2, num2;
		double preco1, preco2, total1, total2, total;
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		cod1 = sc.nextInt();
		num1 = sc.nextInt();
		preco1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		num2 = sc.nextInt();
		preco2 = sc.nextDouble();
		
		total1 = num1 * preco1;
		total2 = num2 * preco2;
		total = total1 + total2;
		
		System.out.printf("Valor a pagar: R$: %.2f\n", total);
		
		sc.close();
		
	*/
		
	// EXERCICIO 6	
		
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo, pi;
		
		pi = 3.14159;
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		  A = sc.nextDouble();
		  B = sc.nextDouble();
		  C = sc.nextDouble();
		  
		  triangulo = A * C / 2;
		  circulo = pi * Math.pow(C, 2);
		  trapezio = (A + B) * C / 2;
		  quadrado = Math.pow(B, 2);
		  retangulo = A * B;
		  
		  System.out.printf("Triângulo: %.3f\n", triangulo);
		  System.out.printf("Círculo: %.3f\n", circulo);
		  System.out.printf("Trapézio: %.3f\n", trapezio);
		  System.out.printf("Quadrado: %.3f\n", quadrado);
		  System.out.printf("Retângulo: %.3f\n", retangulo);
		  
		
		sc.close();
				
	}

}
