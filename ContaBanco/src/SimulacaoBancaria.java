import java.util.Scanner;

/**
 * Esse foi o corrigido pelo sistema.
 */

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1: {
                    // Solicitar o valor a ser depositado e atualizar o saldo
                    double valorDeposito = scanner.nextDouble();
                    saldo += valorDeposito;
                    // Imprimir saldo atual com a formatação correta
                    System.out.printf("Saldo atual: %.1f%n", saldo);
                    break;
                }

                case 2: {
                    // Solicitar o valor a ser sacado e verificar se há saldo suficiente
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= valorSaque;
                        // Imprimir saldo atual com a formatação correta
                        System.out.printf("Saldo atual: %.1f%n", saldo);
                    }
                    break;
                }

                case 3: {
                    // Exibir o saldo atual com a formatação correta
                    System.out.printf("Saldo atual: %.1f%n", saldo);
                    break;
                }

                case 0:
                    // Encerrar o programa
                    System.out.println("Programa encerrado.");
                    continuar = false;
                    break;

                default:
                    // Caso o usuário insira uma opção inválida
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
