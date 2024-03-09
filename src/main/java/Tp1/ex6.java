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
public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez la valeur de a : ");
        double a = sc.nextDouble();
        System.out.print("Entrez la valeur de b : ");
        double b = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("L'équation a une infinité de solutions.");
            } else {
                System.out.println("L'équation n'a pas de solution.");
            }
        } else {
            double solution = -b / a;
            System.out.println("L'équation a une solution unique : x = " + solution);
        }
    }
}
    

