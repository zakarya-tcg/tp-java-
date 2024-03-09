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
public class ex2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez un nombre naturel X : ");
        int x = sc.nextInt();
        System.out.print("Entrez un nombre naturel N : ");
        int n = sc.nextInt();

        long result = 1; 

        for (int i = 0; i < n; i++) {
            result *= x;
        }

        System.out.println(x + "^" + n + " = " + result);
    }

    
}
