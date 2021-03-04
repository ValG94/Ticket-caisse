package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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
        int quantitePlat =0;
        String typePlat = sc.nextLine();

        // Impression du ticket de caisse
        String ticketCaisse="";


        //Boucle
        for (int i = 1; i<=nombreConvive; i++) {

            //On affiche les plats commandés
            System.out.println("Plat #" + i);
            typePlat = sc.nextLine();

            // On affiche la quantité
            System.out.println("Quantité");
            quantitePlat = sc.nextInt();
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
            ticketCaisse = (quantitePlat + "x " + typePlat + "    "+prixUnitaire+"€") + "\n"+ ticketCaisse;
        }

        //Affiche la date et l'heure du ticket
        DateFormat format =new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss");
        Date date= new Date();
        System.out.println(format.format(date));

        System.out.println("____________________________Facture____________________");
        System.out.println("| PLATS                     |   TOTAL                  ");
        System.out.println("_______________________________________________________");
        System.out.printf(  "%30s\n", ticketCaisse);

        System.out.println("Montant total à régler : " + prixTotal + "€");
        // On affiche un message de remerciement "Merci de votre visite & à bientôt"
        System.out.println("Merci de votre visite et à bientôt !");
        System.out.println("_______________________BONNE JOURNEE___________________");
        // On ferme le scanner
        sc.close();

    }
}

