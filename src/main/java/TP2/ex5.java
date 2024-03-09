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
public class ex5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez un nombre entier positif : ");
        int n = sc.nextInt();

        
        int f_w = 1;
        int i = 1;
        while (i <= n) {
            f_w *= i;
            i++;
        }

        
        int f_f = 1;
        for (int j = 1; j <= n; j++) {
            f_f *= j;
        }

        System.out.println(n + "! (factoriel) avec while : " + f_w);
        System.out.println(n + "! (factoriel) avec for : " + f_f);
    }
}


