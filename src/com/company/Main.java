package com.company;

import java.text.DateFormat;
import java.util.Scanner;
import java.util.TimeZone;

public class Main {

    public static void main(String[] args) {
        // On déclare un scanner pour lire les entrées de la console
        Scanner sc = new Scanner(System.in);

        //On affiche le plat commandé
        System.out.println("Plat # : ");
        String typePlat = sc.nextLine();
        sc.nextLine();

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

        if (quantitePlat <= 0) {
            System.out.println("Pas de commande");
        } else ;
        {
            System.out.println(quantitePlat + " " +typePlat + " " + prixUnitaire + "€");
        }

        // On affiche un message de remerciement "Merci de votre visite & à bientôt"
        System.out.println("Merci de votre visite et à bientôt !");
        sc.nextLine();
        // On ferme le scanner
        sc.close();

    }
}

