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
public class ex6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;

        System.out.print("Veuillez saisir la taille du tableau : ");
        t = s.nextInt();

        int[] tab = new int[t];
        int[] TP = new int[t]; 
        int[] TN = new int[t]; 

        System.out.println("Veuillez saisir les éléments du tableau : ");
        for (int i = 0; i < t; i++) {
            System.out.print("Élément " + (i + 1) + " : ");
            tab[i] = s.nextInt();
        }

        int TPIndex = 0; 
        int TNIndex = 0; 

        for (int i = 0; i < t; i++) {
            if (tab[i] > 0) {
                TP[TPIndex++] = tab[i];
            } else if (tab[i] < 0) {
                TN[TNIndex++] = tab[i];
            }
        }

      
        System.out.print("Tableau des valeurs positives : ");
        for (int i = 0; i < TPIndex; i++) {
            System.out.print(TP[i] + " ");
        }
        System.out.println();

        
        System.out.print("Tableau des valeurs négatives : ");
        for (int i = 0; i < TNIndex; i++) {
            System.out.print(TN[i] + " ");
        }
    }
    
}
