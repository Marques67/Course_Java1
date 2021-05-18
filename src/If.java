import java.util.Locale;
import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
	
		/*
		Scanner sc = new Scanner(System.in);
		int hora;
		
		System.out.println("Quantas horas?");
		hora = sc.nextInt();
		
		if (hora < 12) {
			System.out.println("Bom dia!");	
		} 
		else if (hora >=12 && hora < 18) {
		    System.out.println("Boa tarde!");
		}		 
		else {
			System.out.println("Boa noite!");
			}
				
		sc.close();
		
		*/
		
		/*  EXERCICIO 1
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um número:");
		num = sc.nextInt();
		
		if (num >= 0) {
			System.out.println("Não negativo!");
		}
		else {
			System.out.println("Negativo!");
		}
		
		sc.close();
		
		*/
		
		/*  EXERCICIO 2
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um número:");
		num = sc.nextInt();
		
		if (num % 2 != 0) {
			System.out.println("Ímpar");
		}
		else {
			System.out.println("Par");
		}
		
		sc.close();
		
        */
		
		/*  EXERCICIO 3
		Scanner sc = new Scanner(System.in);
		int A, B;
		
		System.out.println("Digite dois valores: ");
		A = sc.nextInt();
		B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("São múltiplos");
		}
		else {
			System.out.println("Não são múltiplos");
		}
		
		sc.close();
		
		*/
		
		/*  EXERCICIO 4
		
		Scanner sc = new Scanner(System.in);
		int horaInicial, horaFinal, duracao, y;
		
		System.out.println("Digite a hora inicial e final da partida: ");
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		
		if (horaInicial >= horaFinal) {
			duracao = 24 - horaInicial;
			y = duracao + horaFinal;
			System.out.println("O jogo durou " + y + " hora(s)");
		}
		else {
			duracao = horaFinal - horaInicial;
			System.out.println("O jogo durou " + duracao + " hora(s)");
		}
		
		sc.close();
		
		*/
		
		/*  EXERCICIO 5
		Scanner sc = new Scanner(System.in);;
		int codigo, qtde;
		double total;
		
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite o código e a quantidade: ");
		codigo = sc.nextInt();
		qtde = sc.nextInt();
		
		if (codigo == 1) {
			total = qtde * 4.00;
			System.out.printf("Total; R$ %.2f\n", total);
		}
		else if (codigo == 2) {
			total = qtde * 4.50;
			System.out.printf("Total; R$ %.2f\n", total);
		}
		else if (codigo == 3) {
			total = qtde * 5.00;
			System.out.printf("Total; R$ %.2f\n", total);
		}
		else if (codigo == 4) {
			total = qtde * 2.00;
			System.out.printf("Total; R$ %.2f\n", total);
		}
		else {
			total = qtde * 1.50;
			System.out.printf("Total: R$ %.2f\n", total);
		}
		
		sc.close();
		
		*/
		
		/*  EXERCICIO 6
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double numero;
		
		System.out.println("Digite um número: ");
		numero = sc.nextDouble();
		
		if (numero > 0 && numero <= 25) {
			System.out.println("Intervalo (0, 25)");
		}
		else if (numero > 25 && numero <= 50) {
			System.out.println("Intervalo (25, 50)");
		}
		else if (numero > 50 && numero <= 75) {
			System.out.println("Intervalo (50, 75)");
		}
		else if (numero > 75 && numero <= 100) {
			System.out.println("Intervalo (75, 100)");
		}
		else {
			System.out.println("Fora do intervalo");
		}
		
		sc.close();
		
		*/
		
		/*
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x, y;
		
		System.out.println("Digite dois valores:");
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if (x > 0 && y > 0) {
			System.out.println("Q1");
		}
		else if (x < 0 && y > 0) {
			System.out.println("Q2");
		}
		else if (x < 0 && y < 0) {
			System.out.println("Q3");
		}
		else if (x > 0 && y < 0) {
			System.out.println("Q4");
		}
		else {
			System.out.println("Origem");
		}
		
		sc.close();
		
		*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();
		
		double imposto;
		if (salario <= 2000.0) {
			imposto = 0.0;
		}
		else if (salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
		}
		else if (salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		if (imposto == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}
		
		sc.close();
	}

}
