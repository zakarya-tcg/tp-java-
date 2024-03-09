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
public class ex5 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez un nombre entier : ");
        int n= sc.nextInt();

        if (n< 0) {
            System.out.println("Veuillez entrer un nombre positif ou nul.");
            return;
        }

        long factorial = 1; 

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Factorielle de " + n + " = " + factorial);
    }
    
}
