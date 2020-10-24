package app;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Primeira Questão
        // imprimeCombinacoes();

        // Segunda Questão
        // verificarSoma();

        // ME
        // Primeira ME
        verificarPosicao();

        // Segunda ME
        calcularMaiorValorResultante();

        // Terceira ME
        numeroEncontraseNaMatriz();

    }

    public static void imprimeCombinacoes() {
        int[] lista = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40};
        ArrayList<ArrayList> combinacoesGerais = new ArrayList();
        
        for (int i = 0; i < lista.length; i++) {
            ArrayList combinacoes = new ArrayList();
            System.out.println("Combinações para: " + lista[i] + "\n");

            for (int j = 0; j < lista.length; j++) {
                if (j != i) {
                    int[] combinacao = {lista[i], lista[j]};
                    combinacoes.add(combinacao);
                    System.out.println("[" + lista[i] + "," + lista[j]  + "]");
                }
            }
            combinacoesGerais.add(combinacoes);
        }

        System.out.println("\n\n");
    }
    
    public static void verificarSoma() {
        int valorX = 21;
        int[] valores = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int somasEncontradas = 0;

        for (int i = 0; i < valores.length; i++) {
            int valorAtual = valores[i];
            System.out.print("Buscando soma para: " + valorAtual + "\n");

            for (int j = 0; j < valores.length; j++) {
                int elementoSomar = valores[j];
                int soma = valorAtual + elementoSomar;
               
                if (soma == valorX) {
                    System.out.print("Encontrado: " + valorAtual + " + " + elementoSomar + " = " + soma + "\n");
                    somasEncontradas++;
                }
            }

            System.out.println("\n\n");
        }

        System.out.print("Somas encontradas: " + somasEncontradas);
    }

    public static void verificarPosicao() {
        int[] dados = {1,2,3,4,5};
        int procurando = 2;

        for (int i = 0; i < dados.length; i++) {
            if (dados[i] == procurando) {
                System.out.print("Número " + procurando + " encontrado na posição " + i);
                break;
            }
        }
    }

    public static void calcularMaiorValorResultante() {
        int[] dados = {1,2,3,-4,5,-1,2};
        int valorMaximo = -1;

        for (int i = 0; i < dados.length; i++) {
            int valor = dados[i];
            boolean temPosicoes = (i + 3) <= dados.length;

            if (temPosicoes) {
                int soma = valor + dados[i + 1] + dados[i + 2];

                if (soma > valorMaximo) {
                    valorMaximo = soma;
                }
            }
        }

        System.out.println("Valor máximo da soma de três números: " + valorMaximo);
    } 

    public static void numeroEncontraseNaMatriz() {
        int[][] matriz = {{4,10,21,34,39,40,57,62}, {9,17,28,35,41,42,58,72}, {19,20,30,47,49,49,65,73}, {27,39,40,48,52,60,66,79}, {33,43,44,58,59,61,77,81}, {46,46,60,63,69,71,79,88}, {56,61,62,68,72,76,87,88}, {64,67,69,73,83,89,90,91}};
        int valorBuscado = 49;
        ArrayList<Integer> primeiraPosicao = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> posicoesEncontradas = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == valorBuscado) {
                    primeiraPosicao.add(i);
                    primeiraPosicao.add(j);
                    break;
                }
            }
        }

        System.out.print("Parando na primeira vez encontrado: Posições: [" + primeiraPosicao.get(0) + "," + primeiraPosicao.get(1) + "]");
        System.out.print("\n");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == valorBuscado) {
                    ArrayList<Integer> posicoes = new ArrayList<Integer>();
                    posicoes.add(i);
                    posicoes.add(j);
                    posicoesEncontradas.add(posicoes);
                }
            }
        }

        String posicoesString = "";

        for (ArrayList listaPosicoes : posicoesEncontradas) {
            posicoesString += "  " + listaPosicoes.toString();
        }

        System.out.println("Valor " + valorBuscado + " encontrado nas seguintes posições: " + posicoesString);
        
    }
}