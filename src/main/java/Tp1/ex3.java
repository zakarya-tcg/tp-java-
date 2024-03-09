/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tp1;
import java.util.Scanner;
/**
 *
 * @author lenovo
 */
public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le premier entier : ");
        int a = sc.nextInt();
        System.out.print("Entrez le deuxième entier : ");
        int b = sc.nextInt();

        // Permutation des valeurs sans utiliser de variable temporaire
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Après permutation ");
        System.out.println("Premier entier : " + a);
        System.out.println("Deuxième entier : " + b);
    }

    
}
