import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Primeiro parâmetro inteiro: ");
        int parametro1 = terminal.nextInt();

        System.out.println("Segundo parâmetro inteiro: ");
        int parametro2 = terminal.nextInt();

        try {
            //Chamado o método contendo a lógica;
            contar(parametro1, parametro2);

        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser Maior que Primeiro parametro");
        }
        int contagem = parametroDois - parametroUm;
        //realizar o for para imprimir os números com base na variável contagem

        for (int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o número: " + i);
        }
    }
}
