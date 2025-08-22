package Fontes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lidiane Visintin
 */
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, pares = 0, impares = 0;

        do {
            System.out.print("Digite um número (0 para sair): ");
            numero = sc.nextInt();
            if (numero != 0) {
                if (numero % 2 == 0)
                    pares++;
                else
                    impares++;
            }
        } while (numero != 0);

        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
        sc.close();
    }
}
