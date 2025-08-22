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

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine().toUpperCase();

        for (int i = 1; i <= nome.length(); i++) {
            System.out.println(nome.substring(0, i));
        }
        sc.close();
    }
}
