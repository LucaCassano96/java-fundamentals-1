package Esercizi;

import java.util.Scanner;

/**Il programma dovrà chiedere all’utente il numero di chilometri che vuole percorrere e l’età del passeggero.
        Sulla base di queste informazioni dovrà calcolare il prezzo totale del viaggio, secondo queste regole: il prezzo
         del biglietto è definito in base ai km (0.21 € al km) va applicato uno sconto del 20% per i minorenni va applicato uno sconto del 40% per gli over 65.*/

public class Treno {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("quanti km vuoi percorrere?");
        double userKm = scan.nextDouble();

        System.out.println("quanti anni hai?");
        int age = scan.nextInt();

        double costKm = 0.21;

        double costoViaggio = userKm * costKm;

        if (age <= 18) {

            double sconto = costoViaggio * 100 / 20;
            System.out.println("il prezzo del tuo biglietto è: " + sconto);

        } else if (age >= 65) {

            double sconto = costoViaggio * 100 / 40;
            System.out.println("il prezzo del tuo biglietto è: " + sconto);
        }
        else {
            System.out.println("il prezzo del tuo biglietto è: " + costoViaggio);
        }
        scan.close();
    }
}
