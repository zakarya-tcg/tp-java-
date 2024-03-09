/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP12;
import java.util.Scanner;
/**
 *
 * @author lenovo
 */
public class ex2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Entrez l'heure : ");
        int h = s.nextInt();
        System.out.print("Entrez les minutes : ");
        int m = s.nextInt();
        m++;
        if (m >= 60) {
            h++;
            m = 0;
        }
        if (h >= 24) {
            h = 0;
        }
        System.out.println("L'heure suivante est : " + h + " heure(s) " + m);
    }
}
    

