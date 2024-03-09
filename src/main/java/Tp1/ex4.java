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
public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un réel x : ");
        double x = sc.nextDouble();
        System.out.print("Entrez un entier n : ");
        int n = sc.nextInt();

        double result = Math.pow(x, n);

        System.out.println(x + " à la puissance " + n + " = " + result);
    }  
}
