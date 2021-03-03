package com.company;

import java.text.DateFormat;
import java.util.Scanner;
import java.util.TimeZone;

public class Main {

    public static void main(String[] args) {
        // On déclare un scanner pour lire les entrées de la console
        Scanner sc = new Scanner(System.in);

        //Nombre de convives
        System.out.println("Nombre de convives");
        int nombreConvive = sc.nextInt();
        sc.nextLine();
        // Montant total de l'addition
        float prixTotal=0;

        //Boucle
        for (int i = 1; i<=nombreConvive; i++) {

            //On affiche les plats commandés
            System.out.println("Plat #" + i);
            String typePlat = sc.nextLine();

            // On affiche la quantité
            System.out.println("Quantité");
            int quantitePlat = sc.nextInt();
            sc.nextLine();

            // On affiche le prix unitaire de chaque plat
            System.out.println("Prix unitaire");
            float prixUnitaire = sc.nextFloat();
            sc.nextLine();

            // On affiche le prix global pour chaque ligne
            float montantTotal = (quantitePlat * prixUnitaire);
            System.out.println("Total = " + montantTotal + "€");

            // On affiche le montant total de la facture
            prixTotal= prixTotal + montantTotal;

        }
        System.out.println("Prix à régler :" + prixTotal + "€");
        // On affiche un message de remerciement "Merci de votre visite & à bientôt"
        System.out.println("Merci de votre visite et à bientôt !");
        // On ferme le scanner
        sc.close();

    }
}

