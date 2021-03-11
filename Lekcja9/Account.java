package com.company;

public class Account {

    private final String nazwa;
    private double stan;
    public Account(String nazwa_konta, double stan) {
        this.nazwa = nazwa_konta;
        this.stan = stan;
    }

    public int wypłać(int kwota) throws InsufficientFundsException {
        if (stan >= kwota) {
            throw new InsufficientFundsException("Nie można wypłacić kwoty przekraczającej ilość dostępnych środków na koncie!");
        }
        return kwota;
    }

    public double getStan() {
        return stan;
    } }
