package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Exercices {
    private static void exo1(Scanner sc){
        // On demande le Prénom et le Nom
        System.out.println("Prénom : ");
        String firstName = sc.nextLine();
        System.out.println("Nom : ");
        String name = sc.nextLine();

        // On demande l'age
        System.out.println("Age : ");
        int age = sc.nextInt();
        sc.nextLine();

        // On demande la taille
        System.out.println("Quelle est votre taille : ");
        float size=sc.nextFloat();
        sc.nextLine();

        // Quelques lignes pour expliquer pourquoi on fait la formation
        System.out.println("Pourquoi faites vous cette formation ?");
        String formation[] = new String[15];
        sc.nextLine();

        // On affiche le résultat
        System.out.println("Bonjour " + firstName + " " + name + '\n' + "Vous avez " + age + " ans");
    }

    private static void exo2(Scanner sc){

        // Déclarer un prix HT
        System.out.println("Entrez le prix HT");
        double priceHt= sc.nextDouble();
        sc.nextLine();

        //Déclarer taux de TVA
        System.out.println("Taux TVA");
        double tva= sc.nextDouble();
        sc.nextLine();

        // Calcul du prix TTC
        double priceTTC =(priceHt * (1+ tva/100));
        System.out.println("Le prix TTC est de : " + String.format("%.2f€",priceTTC));
    }

    private static void exo3(Scanner sc){
        // Calculer la factorielle d'un nombre
        int i, f=1;
        // le nombre dont on veut calculer la factorielle
        System.out.println("Quel nombre voulez-vous calculer ?");
        int number=sc.nextInt();
        sc.nextLine();
        for(i=1; i<=number; i++){
            f = f*i;
        }
        System.out.println("La factorielle de " + number + " "+ "est" +" " + f );
    }

    private static boolean isLeapYear(int year) {

        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            return true;
        } else {
            return false;
        }
    }

    private static void exo4(Scanner sc){
        // Définir si une année est bisextille ou pas
        System.out.println("Veuillez saisir votre année");

    }


    public static void main(String[] exercices) {
        // On déclare un scanner pour lire les entrées de la console
        Scanner sc = new Scanner(System.in);

        // Affichage du menu de mes exercices
        System.out.println("----------------Menu des exercices-------------");
        System.out.println("1. Présentez-vous" + '\n' + "2. Calculer un prix TTC" + '\n'+ "3. Calculer la factorielle d'un nombre");
        System.out.println("------------------------------------------------");
        System.out.println("Faites votre choix : ");
        int n=sc.nextInt();

        //Utilisation de l'instruction SWITCH
          switch (n){
            case 1:{exo1(sc); break;}
            case 2:{exo2(sc); break;}
            case 3:{exo3(sc); break;}
              default:{System.out.println("Il faut rentrer une valeur");}
        };
        // On ferme le scanner
        sc.close();
    }
}
