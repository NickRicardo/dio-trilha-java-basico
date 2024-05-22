import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma opção");
        System.out.println("1. Deposito");
        System.out.println("2. Saque");
        System.out.println("3. Consultar Saldo");
        System.out.println("4. Encerrar");


        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1: {
                    System.out.println("Digite o valor a ser depositado");
                    double valorDeposito = scanner.nextDouble();
                    saldo += valorDeposito;
                    System.out.println("Saldo atual " + saldo);
                    break;
                }

                case 2: {
                    System.out.println("Digite o valor a ser sacado");
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque > saldo) {
                        System.out.println("Saldo insuficiente para o saque");
                    } else {
                        saldo -= valorSaque;
                        System.out.println("O valor de " + valorSaque + " foi sacado");
                        System.out.println("Saldo atual é de: " + saldo);
                    }
                    break;
                }

                case 3: {
                    System.out.println("O seu Saldo atual é de: " + saldo);
                    break;
                }

                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false; //Atualizar a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
