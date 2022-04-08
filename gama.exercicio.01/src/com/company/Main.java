package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int votA = 0, votB = 0, votC = 0, votD = 0, inval = 0;
        char aux;
        String can1, can2, can3, can4;

        //NESTE BLOCO DE CÓDIGO IREMOS SELECIONAR 4 NOMES PARA A ELEIÇÃO
        System.out.println("\n-----VOTAÇÃO INICIADA-----");
        System.out.println("Digite o nome do primeiro candidato");
        can1 = entrada.nextLine();

        System.out.println("Digite o nome do segundo candidato");
        can2 = entrada.nextLine();

        System.out.println("Digite o nome do terceiro candidato");
        can3 = entrada.nextLine();

        System.out.println("Digite o nome do quarto candidato");
        can4 = entrada.nextLine();

        //IMPRIMIREMOS EM TELA OS NOMES DOS CANDIDATOS
        System.out.println("Os candidatos sao: " + can1 + ", " + can2 + ", " + can3 + ", " + can4);

        //DEFINIREMOS AS CONDIÇÕES DA VOTAÇÃO
        System.out.println("\n-----ESCOLHA O SEU CANDIDATO-----\n");
        System.out.println("A - vote no PRIMEIRO candidato");
        System.out.println("B - vote no SEGUNDO candidato");
        System.out.println("C - vote no TERCEIRO candidato");
        System.out.println("D - vote no QUARTO candidato");
        System.out.println("0 - PARA ENCERRAR A VOTACAO!\n");


        //COMEÇAREMOS A ELEIÇÃO, SELECIONANDO UM CARACTERE EQUIVALENTE A POSIÇÃO DO CANDIDATO
        do {
            System.out.println("-----DIGITE O SEU VOTO-----\n");
            aux = entrada.next().charAt(0);

            switch (aux){

                case 'A':
                case 'a':
                    votA++;
                    break;

                case 'B':
                case 'b':
                    votB++;
                    break;

                case 'C':
                case 'c':
                    votC++;
                    break;

                case 'D':
                case 'd':
                    votD++;
                    break;

                case '0':
                    System.out.println("-----VOTAÇÃO FINALIZADA-----\n");

                default:
                    inval++;
            }
        } while (aux != '0');

        //NESSE BLOCO DE CÓDIGO IREMOS IMPRIMIR OS RESULTADOS
        System.out.println("-----DIVULGAÇÃO DOS VOTOS-----\n");
        System.out.println("Candidado " + can1 + " = " + votA + " votos.");
        System.out.println("Candidado " + can2 + " = " + votB + " votos.");
        System.out.println("Candidado " + can3 + " = " + votC + " votos.");
        System.out.println("Candidado " + can4 + " = " + votD + " votos.");
        System.out.println("Os votos invalidos: " + inval + " votos.\n");

        System.out.println("-----DIVULGAÇÃO DO VENCEDOR-----\n");
        //ESTRUTURA DE DECISÃO PARA IMPRIMIR O VENCEDOR DA ELEIÇÃO
        if ((votA > votB) && (votA > votC) && votA > votD){
            System.out.println("O candidato " + can1 + " venceu a eleicao!\n");
        } else if ((votB > votA) && (votB > votC) && votB > votD) {
            System.out.println("O candidato " + can2 + " venceu a eleicao!\n");
        } else if ((votC > votA) && (votC > votB) && votC > votD){
            System.out.println("O candidato " + can3 + " venceu a eleicao!\n");
        } else if ((votD > votA) && (votD > votB) && votD > votC){
            System.out.println("O candidato " + can4 + " venceu a eleicao!\n");
        } else {
            System.out.println("Houve um empate!");
            System.out.println("Candidado " + can1 + " = " + votA + " votos.");
            System.out.println("Candidado " + can2 + " = " + votB + " votos.");
            System.out.println("Candidado " + can3 + " = " + votC + " votos.");
            System.out.println("Candidado " + can4 + " = " + votD + " votos.\n");
        }
        //FIM
    }
}
