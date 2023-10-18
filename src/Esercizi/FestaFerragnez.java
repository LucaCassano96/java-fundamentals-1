package Esercizi;

import java.util.Scanner;

/** State lavorando col servizio di sicurezza dei Ferragnez e il vostro compito è di assicurarvi che accedano alla festa solo gli invitati presenti sulla lista (in fondo al post)
        Nel programma bisogna:
        creare e inizializzare l’array contenente i nomi degli invitati (trovate un esempio in fondo alla traccia)
        chiedere all’utente come si chiama
        verificare che il nome sia presente nella lista lasciarlo entrare o rispedirlo cortesemente da dove è venuto
        :puntare_a_destra:Attenzione: per verificare se due stringhe sono uguali non usare == ma il metodo equals()
        Bonus se avete usato il ciclo for per cercare il nome nella lista nella consegna base, implementare lo stesso programma usando il ciclo while, e viceversa
        Lista invitati: Dua Lipa, Paris Hilton, Manuel Agnelli, J-Ax, Francesco Totti, Ilary Blasi, Bebe Vio, Luis, Pardis Zarei, Martina Maccherone, Rachel Zeilic
        */

public class FestaFerragnez {

    public static void main(String[] args) {

        String[] invitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = scan.nextLine();

        boolean permesso = false;

        for (String invitato: invitati) {

            if (userName.equals(invitato) ){

                permesso = true;
            }
        }

        if (permesso == true) {

            System.out.println("puoi entrare");
        } else {

            System.out.println("Non puoi entrare");
        }

    }
}
