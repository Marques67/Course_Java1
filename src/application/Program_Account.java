package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program_Account {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account = new Account();
		
		System.out.print("Digite o número da sua conta: ");
		int numConta = sc.nextInt();
		System.out.print("Digite sua senha: ");
		int senha = sc.nextInt();
		
		if(numConta == 6767) {
			System.out.println("Bem-vindo, Lucas, você é um cliente VIP!");
			System.out.print("Deseja realizar alguma operação? [S / N]");
			char operacao = sc.next().charAt(0);
			 if (operacao == 'S') {
				 System.out.println("Qual tipo de operação você deseja fazer? ");
				 System.out.println("1 - Saldo, 2 - Extrato, 3 - Saque, 4 - Depósito, 5 - Transferência, 6 - Solicitar visita do gerente,  7 - Trocar de usuário");
				 char resp = sc.next().charAt(0);
				 
				 /*
				 switch (resp) {
				 case 1:
					 Double saldo = account.getSaldo();
					 System.out.print("Seu saldo é: " + account.getSaldo());
					 break;
				 case 2:
					 System.out.println("Seu extrato: " + account.getExtrato());
					 break;
				 case 3:
					 System.out.print("Digite o valor do saque: ");
					 Double saque = sc.nextDouble();
					 account.setSaque(saque);
					 System.out.println("Saldo restante: " + account.getSaque());
					    if(saque > account.getSaldo()) {
					     }
					 break;
				 case 4:
					 System.out.print("Digite o valor do depósito:");
					 Double deposito = sc.nextDouble();
					 account.setDeposito(deposito);
					 System.out.println(account.getDeposito());
				     break;
				 case 5:
					 System.out.print("Digite o número da conta que irá receber o valor: ");
					 int contaTransferencia = sc.nextInt();
					 System.out.print("Digite o valor da transferência: ");
					 Double valor = sc.nextDouble();
					 account.setTransferencia(valor);
					 System.out.println(account.getTransferencia());
					 break;
				 case 6: 
					 System.out.print("Deseja receber uma visita do gerente? ");
					 char resp01 = sc.next().charAt(0);
					   if(resp01 == 'S') {
					   	 //Double saldo =- 50.00;
					   } else {
					   	 System.out.println("Tudo ok!");
					   }
				     break;
				 case 7:
					 System.out.println("Obrigado por utilizar nosso app!");
					 break;
				 } */
				 
				 
				  if (resp == '1') {
					   Double saldo = account.getSaldo();
					   System.out.print("Seu saldo é: " + account.getSaldo());
					   //account = new Account(saldo);
				   } else if (resp == '2') {
					   System.out.println("Seu extrato: " + account.getExtrato());
				   } else if (resp == '3') {
					   System.out.print("Digite o valor do saque: ");
					   Double saque = sc.nextDouble();
					   account.setSaque(saque);
					   System.out.println("Saldo restante: " + account.getSaque());
					     if(saque > account.getSaldo()) {
					    	Double saldo = account.getSaldo() * 0.1;
					     }
				   } else if (resp == '4') {
					   System.out.print("Digite o valor do depósito:");
					   Double deposito = sc.nextDouble();
					   account.setDeposito(deposito);
					   System.out.println(account.getDeposito());
				   } else if ( resp == '5') {
					   System.out.print("Digite o número da conta que irá receber o valor: ");
					   int contaTransferencia = sc.nextInt();
					   System.out.print("Digite o valor da transferência: ");
					   Double valor = sc.nextDouble();
					   account.setTransferencia(valor);
					   System.out.println(account.getTransferencia());
				   } else if (resp == '6') {
					   System.out.print("Deseja receber uma visita do gerente? ");
					   char resp01 = sc.next().charAt(0);
					     if(resp01 == 'S') {
					    	 Double saldo = account.getSaldo() - 50.00;
					    	 System.out.println("Você teve 50 reais descontado do seu saldo. Seu saldo atual é: " + saldo);
					     } else {
					    	 System.out.println("Tudo ok!");
					     }
				   } else if (resp == '7') {
					   System.out.println("Obrigado por utilizar nosso app!");
				   } else {
					   System.out.println("Digite um valor válido! ");
				   } 
			 }
		} else if (numConta == 1234) {
			System.out.println("Bem-vindo Joao, você é um cliente Normal!");
			System.out.print("Deseja realizar alguma operação? [S / N]");
			char operacao = sc.next().charAt(0);
			 if (operacao == 'S') {
				 System.out.println("Qual tipo de operação você deseja fazer? ");
				 System.out.println("1 - Saldo, 2 - Extrato, 3 - Saque, 4 - Depósito, 5 - Transferência, 6 - Trocar de usuário");
				 char resp = sc.next().charAt(0);
				   if (resp == '1') {
					   System.out.print("Seu saldo é: " + account.getSaldo());
				   } else if (resp == '2') {
					   System.out.println("Seu extrato: " + account.getExtrato());
				   } else if (resp == '3') {
					   System.out.print("Digite o valor do saque: ");
					   Double saque = sc.nextDouble();
					   account.setSaque(saque);
					     if(saque > account.getSaldo()) {
					    	System.out.print("Valor solicitado maior que o saldo!");
					     }
				   } else if (resp == '4') {
					   System.out.print("Digite o valor do depósito:");
					   Double deposito = sc.nextDouble();
					   account.setDeposito(deposito);
				   } else if ( resp == '5') {
					   System.out.print("Digite o número da conta que irá receber o valor: ");
					   int contaTransferencia = sc.nextInt();
					   System.out.print("Digite o valor da transferência: ");
					   Double valor = sc.nextDouble();
					     if(valor > 1000) {
					    	 System.out.println("Valor de transferência maior que o permitido!");
					    	 Double saldo =- 8.00;
					     }
				   } else if (resp == '6') {
					   System.out.println("Obrigado por utilizar nosso app!");
				   } else {
					   System.out.println("Digite um valor válido! ");
				   }
		}
		sc.close();

	}

	}
}
