/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula_2;

import java.util.Scanner;

/**
 *
 * @author Lidiane Visintin
 */
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        lerNumeros(numeros, sc);
        System.out.println("Soma dos elementos: " + somaElementos(numeros));
        exibirMultiplosDe3(numeros);
        exibirMediaMultiplosDe3(numeros);

        sc.close();
    }

    public static void lerNumeros(int[] vetor, Scanner sc) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            vetor[i] = sc.nextInt();
        }
    }

    public static int somaElementos(int[] vetor) {
        int soma = 0;
        for (int n : vetor) {
            soma += n;
        }
        return soma;
    }

    public static void exibirMultiplosDe3(int[] vetor) {
        System.out.print("Números múltiplos de 3: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 3 == 0) {
                System.out.print(vetor[i] + " ");
            }
        }
        System.out.println();
    }

    public static void exibirMediaMultiplosDe3(int[] vetor) {
        int soma = 0, cont = 0;
        for (int n : vetor) {
            if (n % 3 == 0) {
                soma += n;
                cont++;
            }
        }
        if (cont > 0) {
            System.out.println("Média dos múltiplos de 3: " + (soma / (double) cont));
        } else {
            System.out.println("Não há múltiplos de 3 no vetor.");
        }
    }
}
    
