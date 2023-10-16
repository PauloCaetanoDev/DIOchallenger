package ContaCriacao;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por favor digite seu nome");
		String nomeCliente = scanner.nextLine();
		
		System.out.println("Por favor digite a agencia");
		String agencia = scanner.nextLine();
		
		System.out.println("Por favor digite o numero da conta");
		int numero = scanner.nextInt();
		
		System.out.println("Por favor digite o numero da conta");
		double saldo = scanner.nextDouble();
		
		 
		System.out.println("Ola " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
				
		
		
		scanner.close();
	}

	
}
