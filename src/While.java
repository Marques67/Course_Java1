import java.util.Scanner;

public class While {

	public static void main(String[] args) {
	
		/*
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int soma = 0;
		while (x != 0) {
			soma = soma + x;
			x = sc.nextInt();
		}
		
		System.out.println(soma);
		
		sc.close();
		
		*/
		
		/*  EXERCICIO 1
		
		Scanner sc = new Scanner(System.in);
		
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha inválida!");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido!");
		
		sc.close();
		
		*/
		
		/* EXERCICIO 2
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x != 0 || y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			}
			else if (x > 0 && y < 0) {
				System.out.println("quarto");
			}
			else if (x < 0 && y > 0) {
				System.out.println("segundo");
			}
			else {
				System.out.println("terceiro");
			}
			
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();
		
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int alcool, gasolina, diesel;
		
		alcool = 0;
		gasolina = 0;
		diesel = 0;
		while (num != 4) {
			if (num < 1 || num > 4) {
				System.out.println("Código inválido. Digite um novo código!");
				num = sc.nextInt();
			}
			if (num == 1) {
				alcool = alcool + 1;
			}
			else if (num == 2) {
				gasolina = gasolina + 1;
			}
			else if ( num == 3) {
				diesel = diesel + 1;
			}
			else {
				System.out.println("Muito obrigado!");
			}
			
			num = sc.nextInt();
		}
		
		System.out.println("Álcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();

	}

}
