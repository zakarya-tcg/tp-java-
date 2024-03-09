/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package TP12;
import java.util.Scanner;
/**
 *
 * @author lenovo
 */
public class ex1 {

    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
        System.out.print("Entrez un entier positif : ");
        int n = s.nextInt();
        System.out.print("Les diviseurs de " + n + " sont :   ");
        int d = 0;
        int somme = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                d++;
                somme += i;
            }
        }
        System.out.println();
        System.out.println("Le nombre de diviseurs de " + n + " est : " + d);
        System.out.println("La somme des diviseurs de " + n + " est : " + somme);
    }
}
    

