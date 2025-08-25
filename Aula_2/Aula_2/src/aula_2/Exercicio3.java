/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_2;

/**
 *
 * @author Lidiane Visintin
 */
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        lerMatriz(matriz, sc);
        exibirMatriz(matriz);
        encontrarMaiorValor(matriz);
        System.out.println("Soma da diagonal principal: " + somaDiagonalPrincipal(matriz));

        sc.close();
    }

    public static void lerMatriz(int[][] matriz, Scanner sc) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor para posição ["+i+"]["+j+"]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
    }

    public static void exibirMatriz(int[][] matriz) {
        System.out.println("Valores da matriz:");
        for (int[] linha : matriz) {
            for (int valor : linha) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    public static void encontrarMaiorValor(int[][] matriz) {
        int maior = matriz[0][0];
        int linha = 0, coluna = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }
        System.out.println("Maior valor: " + maior + " na posição [" + linha + "][" + coluna + "]");
    }

    public static int somaDiagonalPrincipal(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][i];
        }
        return soma;
    }
}
