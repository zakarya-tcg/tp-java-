/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP3;
import java.util.Scanner;
/**
 *
 * @author lenovo
 */
public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int taille;
        do {
            System.out.print("Veuillez saisir la taille du tableau (entre 10 et 50) : ");
            taille = scanner.nextInt();
        } while (taille < 10 || taille > 50);
        int[] tableau = new int[taille];
        System.out.println("Veuillez saisir les éléments du tableau : ");
        for (int i = 0; i < taille; i++) {
            System.out.print("Élément " + (i + 1) + " : ");
            tableau[i] = scanner.nextInt();
        }
         System.out.print("Le tableau que vous avez saisi est : ");
        for (int i = 0; i < taille; i++) {
            System.out.print(tableau[i] + " ");
        }
    }
}
