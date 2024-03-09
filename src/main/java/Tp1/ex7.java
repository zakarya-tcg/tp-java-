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
public class ex7 {
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez la valeur de a : ");
        double a = sc.nextDouble();
        System.out.print("Entrez la valeur de b : ");
        double b = sc.nextDouble();
        System.out.print("Entrez la valeur de c : ");
        double c = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("L'équation a une infinité de solutions.");
            } else {
                double r = -c / b;
                System.out.println("L'équation a une solution unique : x = " + r);
            }
        } else {
            double discriminant = b * b - 4 * a * c;
            if (discriminant > 0) {
                double r1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double r2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("Les racines sont réelles et distinctes :");
                System.out.println("Racine 1 = " + r1);
                System.out.println("Racine 2 = " + r2);
            } else if (discriminant == 0) {
                double r = -b / (2 * a);
                System.out.println("L'équation a une racine réelle et unique :");
                System.out.println("Racine = " + r);
            } else {
                System.out.println("L'équation n'a pas de racines réelles.");
            }
        }
    }
}
    

