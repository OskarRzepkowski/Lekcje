 package com.company;

public class Osoba {

    private String Imię, Nazwisko;
    private int Rok_urodzenia;

    public Osoba(String Imię, String Nazwisko, int Rok_urodzenia) throws Exception {
        this.Imię = Imię;
        this.Nazwisko = Nazwisko;
        this.Rok_urodzenia = Rok_urodzenia;
        informacje(Imię, Nazwisko, Rok_urodzenia);
    }

    private void informacje(String Imię, String Nazwisko, int Rok_urodzenia) throws Exception {

        if (Imię.isBlank())
            throw new Exception("Błędne imię");

        if (Nazwisko.isBlank())
            throw new Exception("Błędne nazwisko");
        if (Rok_urodzenia < 1900 || Rok_urodzenia > 2020)
            throw new Exception("Błędny rok urodzenia");


    }
    @Override
    public String toString() {
        return "Osoba\n" +
                "Imię: " + Imię + '\n' +
                "Nazwisko: " + Nazwisko + '\n' +
                "Rok urodzenia: " + Rok_urodzenia;
    }
}
