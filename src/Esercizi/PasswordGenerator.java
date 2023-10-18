package Esercizi;


import java.util.Scanner;

/**    - Aggiungete un package org.lessons.java.security
        - Aggiungete una classe PasswordGenerator che contiene un metodo main
        Il programma deve fare quanto segue:
        salvare in opportune variabili il nome, cognome, colore preferito e data di nascita di un utente suddivisa in giorno, mese e anno in numero
        generare (e stampare a video) una password  concatenando nome, cognome, colore preferito e somma di giorno, mese e anno di nascita, separate dal carattere -
        Esempio: ho un utente che si chiama Pinco Pallo, nato il 12/05/1994, il cui colore preferito è il magenta
        La sua password sarà Pinco-Pallo-magenta-2011*/

public class PasswordGenerator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("come ti chiami");
        String nome = scan.next();

        System.out.println("qual è il tuo cognome");
        String cognome = scan.next();

        System.out.println("qual è il tuo colore preferito?");
        String colore = scan.next();

        System.out.println("Che giorno sei nato?");
        int giornonascita = scan.nextInt();

        System.out.println("Che mese sei nato?");
        int meseDinascita = scan.nextInt();

        System.out.println("Che anno sei nato?");
        int annoDinascita = scan.nextInt();

        int sommaNascita = giornonascita + meseDinascita + annoDinascita;

        String password = nome + "-" + cognome + "-" + colore + "-" + sommaNascita;

        System.out.println(password);

    }
}
