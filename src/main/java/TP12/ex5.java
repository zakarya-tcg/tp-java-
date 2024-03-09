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
public class ex5 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        int[] butsParJoueur = new int[22];
        int numeroButeur = 0;
        int totalButs = 0;
        int joueursSansButs = 0;

        for (int i = 0; i < 22; i++) {
            System.out.print("Entrez le nombre de buts inscrits par le joueur " + (i + 1) + " : ");
            butsParJoueur[i] = scanner.nextInt();
            totalButs += butsParJoueur[i];
            if (butsParJoueur[i] > butsParJoueur[numeroButeur]) {
                numeroButeur = i;
            }
            if (butsParJoueur[i] == 0) {
                joueursSansButs++;
            }
        }

        System.out.println("Le buteur de l'équipe est le joueur numéro " + (numeroButeur + 1));
        System.out.println("Le nombre total de buts inscrits par l'équipe est : " + totalButs);
        System.out.println("Le nombre de joueurs n'ayant pas marqué de but est : " + joueursSansButs);

      
        butsParJoueur[8] += 2;

        scanner.close();
    }
}
