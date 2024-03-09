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
public class ex5 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Veuillez saisir la taille du tableau : ");
        n = sc.nextInt();

        int[] t = new int[n];

        System.out.println("Veuillez saisir les éléments du tableau : ");
        for (int i = 0; i < n; i++) {
            System.out.print("Élément " + (i + 1) + " : ");
            t[i] = sc.nextInt();
        }

        System.out.print("Le tableau avant l'inversion est : ");
        for (int i = 0; i < n; i++) {
            System.out.print(t[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < n / 2; i++) {
            int temp = t[i];
            t[i] = t[n - 1 - i];
            t[n - 1 - i] = temp;
        }

        System.out.print("Le tableau après l'inversion est : ");
        for (int i = 0; i < n; i++) {
            System.out.print(t[i] + " ");
        }
    }
    
}
