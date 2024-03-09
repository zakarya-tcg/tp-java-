/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tp1;
import java.util.Scanner;
/**
/**
 *
 * @author lenovo
 */
public class ex8 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le premier entier : ");
        int num1 = sc.nextInt();
        System.out.print("Entrez le deuxième entier : ");
        int num2 = sc.nextInt();

       

        
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }

        System.out.println("Le PGCD de ces deux entiers est : " + num1);
    }
}
