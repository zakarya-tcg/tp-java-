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
public class ex1 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le premier entier : ");
        int a = sc.nextInt();
        System.out.print("Entrez le deuxième entier : ");
        int b = sc.nextInt();

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double quotient = (double) a / b;

        System.out.println("Somme : " + sum);
        System.out.println("Différence : " + difference);
        System.out.println("Produit : " + product);
        System.out.println("Quotient : " + quotient);
    }
}

