package Main;

import java.util.Scanner;

public class SimulacaoContaBancaria {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o nome do titular da conta: ");
		String titular = scanner.nextLine();

		
		ContaBancaria conta = new ContaBancaria(titular);

		boolean sair = false;

		while (!sair) {
			System.out.println("\nEscolha uma opção:");
			System.out.println("1. Depositar");
			System.out.println("2. Sacar");
			System.out.println("3. Ver Saldo");
			System.out.println("4. Sair");

			int opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("Digite o valor do depósito: ");
				double deposito = scanner.nextDouble();
				conta.depositar(deposito);
				break;

			case 2:
				System.out.print("Digite o valor do saque: ");
				double saque = scanner.nextDouble();
				conta.sacar(saque);
				break;

			case 3:
				conta.exibirSaldo();
				break;

			case 4:
				System.out.println("Saindo...");
				sair = true;
				break;

			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		}

		scanner.close();
	}
}
