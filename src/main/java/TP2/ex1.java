/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2;
import java.util.Scanner;
/**
 *
 * @author lenovo
 */
public class ex1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nombre N : ");
        int N = scanner.nextInt();

        int somme = 0;
        int produit = 1;
        int i = 0;

        System.out.println("Entrez " + N + " nombres :");

        while (i < N) {
            int nombre = scanner.nextInt();
            somme += nombre;
            produit *= nombre;
            i++;
        }
        /*do {
            int nombre = scanner.nextInt();
            somme += nombre;
            produit *= nombre;
            i++;
        } while (i < N);
        */
        /*for (int i = 0; i < N; i++) {
            int nombre = scanner.nextInt();
            somme += nombre;
            produit *= nombre;
        }
        */
        double moyenne = (double) somme / N;

        System.out.println("La somme des nombres est : " + somme);
        System.out.println("Le produit des nombres est : " + produit);
        System.out.println("La moyenne des nombres est : " + moyenne);

        
    }
   
}

