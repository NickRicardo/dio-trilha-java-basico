package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        String[] candidatos = {"Felipe", "Nícolas", "Keilla", "Laura", "Naomi"};
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("Contato Realizado com Sucesso");

        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu)
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa");
        else
            System.out.println("Não conseguimos contato com " + candidato + ", número maximo de tentativas " + tentativasRealizadas + " realizada");
    }

    //metodo auxiliar
    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados() {
        String[] candidatos = {"FELIPE", "Nicolas", "Duda", "Bela", "Perci"};

        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");
        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O Candidato de nº " + (indice + 1) + " é o" + candidatos[indice]);
        }

        System.out.println("Forma abreviada de interação For Each");

        for (String candidato : candidatos) {
            System.out.println("O Candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidato() {
        String[] candidatos = {"FELIPE", "Nicolas", "Duda", "Bela", "Perci", "Daniboy", "Gobbi"};

        int candidatoSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatoSelecionados < 5) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("o Candidato " + candidato + " solicitou este valor de salario " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O Candidato " + candidato + " foi selecionado para a vaga ");
                candidatoSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com a contra proposta");
        } else {
            System.out.println("Aguardando resultado dos demais Candidatos");
        }
    }
}