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
public class ex8 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Veuillez saisir la taille du tableau : ");
        int t = sc.nextInt();
        int[] a = new int[t];
        System.out.println("Veuillez saisir les éléments du tableau : ");
        for (int i = 0; i < t; i++) {
            System.out.print("Élément " + (i + 1) + " : ");
            a[i] = sc.nextInt();
        }
        int maxEcart = 0;
        for (int i = 0; i < t - 1; i++) {
            for (int j = i + 1; j < t; j++) {
                int ecart = Math.abs(a[i] - a[j]);
                if (ecart > maxEcart) {
                    maxEcart = ecart;
                }
            }
        }
        System.out.println("Le plus grand écart dans le tableau est : " + maxEcart);
    }   
}
