package com.company;

public class Zad2 {

    public static void main(String[] args) {

        BankA banka = new BankA();
        banka.getBalance();
        banka.AcountState("mBank");

        BankB bankb = new BankB();
        bankb.getBalance();
        bankb.AcountState("Santander");

        BankC bankc = new BankC();
        bankc.getBalance();
        bankc.AcountState("Millenium");
    }
}
