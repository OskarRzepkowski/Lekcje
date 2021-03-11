package com.company;
import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Podaj imię: ");
            String Imię = scanner.nextLine();
            System.out.println("Podaj nazwisko: ");
            String Nazwisko = scanner.nextLine();
            System.out.println("Podaj rok urodzenia: ");
            int Rok_urodzenia = scanner.nextInt();
            Osoba osoba = new Osoba(Imię, Nazwisko, Rok_urodzenia);
            System.out.println(osoba);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            main(new String[0]);
        }
    }

}
