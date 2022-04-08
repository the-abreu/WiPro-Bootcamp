package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] produtos = {"Arroz", "Feijão", "Leite", "Ovos", "Queijo", "Cereal", "Azeite", "Açucar", "Carne", "Sabão"};
        int[] codigo = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] quantidade = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        double[] valores = new double[100];
        valores[0] = 04.50;
        valores[1] = 05.00;
        valores[2] = 03.50;
        valores[3] = 10.00;
        valores[4] = 15.20;
        valores[5] = 08.25;
        valores[6] = 07.50;
        valores[7] = 06.20;
        valores[8] = 25.70;
        valores[9] = 04.20;

        //valores[0] = {04.50, 05.00, 03.50, 10.00, 15.20, 08.25, 07.50, 06.20, 25.70, 04.20};
        String[] salvarProdutos = new String[100];
        int[] salvarQuantidade = new int[100];
        double[] salvarValores = new double[100];
        double[] salvarValorF = new double[100];


        int aux;
        int num = 0;
        int numCodigo;
        int numQuantidade;
        int indice = 0;


        do {
            System.out.println("\n==========================WIPRO STORE===============================");
            System.out.println("\nCODIGO:\t\t\t" + "PRODUTO:\t\t" + "QUANDITIDADE:\t\t" + " VALOR:\t\t");
            for (int i = 0; i < 10; i++) {
                System.out.println(codigo[i] + "\t\t\t\t" + produtos[i] + "\t\t\t\t" + quantidade[i] + "\t\t\t\t R$ " + valores[i]);
            }

            System.out.println("\nDIGITE O CÓDIGO DO PRODUTO:");
            numCodigo = entrada.nextInt();
            System.out.println("Você selecionou " + produtos[numCodigo] + " como produto");
            System.out.println("Digite a quantidade desejada do produto");
            numQuantidade = entrada.nextInt();
            System.out.println(numQuantidade + " Un. de " + produtos[numCodigo] + " foi adicionado ao carrinho");
            System.out.println("DESEJA CONTINUAR SUA COMPRA? [1/0]");
            System.out.println("(DIGITE 1 PARA SIM OU 0 PARA NÃO)");
            aux = entrada.nextInt();

            salvarProdutos[indice] = produtos[numCodigo];
            salvarQuantidade[indice] = numQuantidade;
            salvarValores[indice] = valores[numCodigo];

            if (aux != 0) {
                indice++;
            }

        } while (aux != 0);

        System.out.println("\nITENS DO CARRINHO: ");

        double soma = 0;
        for (indice = 0; indice < salvarProdutos.length; indice++) {
            //double valorF = valores[numCodigo] * numQuantidade;
            //salvarValorF[indice] = valorF;

            if (salvarProdutos[indice] != null) {
                double valorF = salvarValores[indice] * salvarQuantidade[indice];
                salvarValorF[indice] = valorF;
                System.out.println(
                        "Produto: " + salvarProdutos[indice] +
                                "\nQuantidade: " + salvarQuantidade[indice] +
                                "\nValor unitário: " + salvarValores[indice] +
                                "\nValor Total: " + valorF + "\n");

                soma = 0;
                for (int i = 0; i < salvarValorF[indice]; i++) {
                    soma += salvarValorF[i];
                }
                System.out.println("Total do carrinho: " + soma + "\n");

            }
        }

        double juros = (double) ((soma*9)/100);
        double somaComImposto = juros + soma;

        System.out.println("VALOR TOTAL DO CARRINHO MAIS 9% DE IMPOSTO: R$ " + somaComImposto);
        System.out.println("OPÇÕES DE PAGAMENTO: \n");

        System.out.println("\t[1] À VISTA EM DINHEIRO OU CARTÃO MASTERCARD, RECEBE 20% DE DESCONTO.\n");
        System.out.println("\t[2] À VISTA NO CARTÃO DE CRÉDITO, RECEBE 15% DE DESCONTO.\n");
        System.out.println("\t[3] EM DUAS VEZES, PREÇO NORMAL DE ETIQUETA SEM JUROS.\n");
        System.out.println("\t[3] EM TRÊS VEZES, PREÇO NORMAL DE ETIQUETA COM JUROS DE 10%\n");

        System.out.println("QUAL SERIA A FORMA DE PAGAMENTO? DIGITE UM NÚMERO CORRESPONDENTE AS OPÇÕES ACIMA: ");
        num = entrada.nextInt();

        if (num == 1){
            double vinteDesconto = (double) ((somaComImposto*20)/100);
            System.out.println("Como 20% de desconto o valor total da sua compra ficou: R$ " + ((vinteDesconto - somaComImposto)*-1) + "\n");
        } else if (num == 2){
            double quinzeDesconto = (double) ((somaComImposto*15)/100);
            System.out.println("Como 15% de desconto o valor total da sua compra ficou: R$ " + (quinzeDesconto - somaComImposto)*-1 + "\n");
        } else if (num == 3){
            double duasSemJuros = somaComImposto / 2;
            System.out.println("Parcelado em duas vezes sem juros: R$ " + duasSemJuros + "\n");
        }else  if (num == 4) {
            double tresComJuros = (double) ((soma*10)/100);
            double tresComJurosF = (tresComJuros + somaComImposto)/3;
            System.out.println("Parcelado em três vezes com 10% de juros: R$ " + tresComJurosF + "\n");
        }

        System.out.println("AGRADECEMOS PELA PREFERÊNCIA! VOLTE SEMPRE!\n");


        //System.out.println(soma);
    }
}