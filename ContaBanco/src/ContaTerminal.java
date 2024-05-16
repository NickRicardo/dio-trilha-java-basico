import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuário

        //obter peka scanner os calores digitados no terminal

        //Exibir a mensagem da conta criada

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu Nome");
        String nome = scanner.next();

        System.out.println(" ");
        System.out.println("Agora, o número da conta.");
        int numero = scanner.nextInt();

        System.out.println(" ");
        System.out.println("Neste momento, digite o número da sua agência!");
        String agencia = scanner.next();

        System.out.println(" ");
        System.out.println("Por fim digite o valor que você depositará na sua conta.");
        double saldo = scanner.nextDouble();

        System.out.println(" ");
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
