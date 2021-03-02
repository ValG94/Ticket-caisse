package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // On déclare un scanner pour lire les entrées de la console
        Scanner sc = new Scanner(System.in);

        // On affiche la date et l'heure du ticket


        // On affiche le nombre de couverts
        System.out.println("Nombre de couverts");
        int nombreCouvert = sc.nextInt ();
        sc.nextLine();

        // On affiche la quantité du plat commandé
        System.out.println("Quel est le nombre de plat");
        int quantitePlat = sc.nextInt ();
        sc.nextLine();

        //On affiche le type de plat consommé
        System.out.println("Entrez votre plat : ");
        sc.nextLine();

        // On affiche le prix unitaire pour chaque ligne
        System.out.println("Entrez le prix unitaire");
        float prixUnitaire = sc.nextFloat();
        sc.nextLine();

        // On affiche le prix global pour chaque ligne
        float montantTotal = (quantitePlat * prixUnitaire);
        System.out.println("Montant total à régler " + montantTotal);

        // On affiche un message de remerciement "Merci de votre visite & à bientôt"
        System.out.println("Merci de votre visite et à bientôt !");
        sc.nextLine();
        // On ferme le scanner
        sc.close();
    }
}
