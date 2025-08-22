/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fontes;

/**
 *
 * @author Lidiane Visintin
 */
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario, somaSalario = 0, maiorSalario = 0;
        int filhos, somaFilhos = 0, ate1500 = 0;
        final int TOTAL_PESSOAS = 4;

        for (int i = 1; i <= TOTAL_PESSOAS; i++) {
            System.out.print("Informe o salário da pessoa " + i + ": ");
            salario = sc.nextDouble();
            System.out.print("Informe o número de filhos da pessoa " + i + ": ");
            filhos = sc.nextInt();

            somaSalario += salario;
            somaFilhos += filhos;

            if (salario > maiorSalario)
                maiorSalario = salario;

            if (salario <= 1500)
                ate1500++;
        }

        System.out.printf("Média de salário: %.2f%n", (double) somaFilhos / TOTAL_PESSOAS);
        System.out.printf("Maior salário: %.2f%n", maiorSalario);
        System.out.printf("Percentual com salário até R$ 1500,00: %.2f%%%n", (ate1500 * 100.0) / TOTAL_PESSOAS);
        sc.close();
    }
}
