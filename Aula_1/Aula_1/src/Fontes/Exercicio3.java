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

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine().toUpperCase();

        String invertido = "";
        for (int i = nome.length() - 1; i >= 0; i--) {
            invertido += nome.charAt(i);
        }

        System.out.println("Nome invertido: " + invertido);
        sc.close();
    }
}
