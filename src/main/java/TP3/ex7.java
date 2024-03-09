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
public class ex7 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Veuillez saisir la taille du tableau : ");
        int taille = scanner.nextInt();
        
        int[] tableau = new int[taille];
        
        System.out.println("Veuillez saisir les éléments du tableau : ");
        for (int i = 0; i < taille; i++) {
            System.out.print("Élément " + (i + 1) + " : ");
            tableau[i] = scanner.nextInt();
        }
        
        int somme = 0;
        for (int i = 0; i < taille; i++) {
            somme += tableau[i];
        }
        System.out.println("La somme des éléments du tableau est : " + somme);
        
        double moyenne = (double) somme / taille;
        System.out.println("La moyenne des éléments du tableau est : " + moyenne);
        
        int[] tableau2 = new int[taille];
        for (int i = 0; i < taille; i++) {
            tableau2[i] = tableau[i];
        }
        System.out.print("Le tableau copié (T2) est : ");
        for (int i = 0; i < taille; i++) {
            System.out.print(tableau2[i] + " ");
        }
        System.out.println();
        
        for (int i = 0; i < taille - 1; i++) {
            for (int j = 0; j < taille - 1 - i; j++) {
                if (tableau[j] > tableau[j + 1]) {
                    int temp = tableau[j];
                    tableau[j] = tableau[j + 1];
                    tableau[j + 1] = temp;
                }
            }
        }
        
        System.out.print("Le tableau trié dans l'ordre croissant est : ");
        for (int i = 0; i < taille; i++) {
            System.out.print(tableau[i] + " ");
        }
    }
    
}
