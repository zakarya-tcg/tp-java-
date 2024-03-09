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
public class ex3 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez la valeur de N : ");
        int N = sc.nextInt();

        double s = 0.0;

        for (int i = 1; i <= N; i++) {
            s += 1.0 / i;
        }

        System.out.println("La somme des " + N + " premiers termes de la série harmonique est : " + s);
    }
    } 