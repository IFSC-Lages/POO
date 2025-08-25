/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_2;

import java.util.Scanner;

/**
 *
 * @author Lidiane Visintin
 */
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[15];

        lerVetor(vetor, sc);
        contarPositivosNegativosZeros(vetor);
        exibirIndicesImpares(vetor);
        exibirMaiorNumero(vetor);

        sc.close();
    }

    public static void lerVetor(int[] vetor, Scanner sc) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            vetor[i] = sc.nextInt();
        }
    }

    public static void contarPositivosNegativosZeros(int[] vetor) {
        int positivos = 0, negativos = 0, zeros = 0;
        for (int n : vetor) {
            if (n > 0) positivos++;
            else if (n < 0) negativos++;
            else zeros++;
        }
        System.out.println("Positivos: " + positivos + ", Negativos: " + negativos + ", Zeros: " + zeros);
    }

    public static void exibirIndicesImpares(int[] vetor) {
        System.out.print("Números nos índices ímpares: ");
        for (int i = 1; i < vetor.length; i += 2) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    public static void exibirMaiorNumero(int[] vetor) {
        int maior = vetor[0], pos = 0;
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                pos = i;
            }
        }
        System.out.println("Maior número: " + maior + " na posição " + pos);
    }
}
