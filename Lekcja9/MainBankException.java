package com.company;
import java.util.Scanner;

public class MainBankException {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Czy chcesz stworzyc konto?");
        boolean doCreateAccount = taklubnie();
        if(!doCreateAccount) {
            koniec();
        }
        Account account = nowekonto();
        System.out.println("Czy chcesz wyplacic pieniadze?");
        boolean shouldWithdrawMoney = taklubnie();
        if(!shouldWithdrawMoney) {
            koniec();
        }
        while (true) {
            System.out.println("Ile chcesz wyplacic?");
            try {
                int amount = gotówka();
                try {
                    account.wypłać(amount);
                    break;
                }

                catch (NumberFormatException e) {
                    System.out.println("Podaj liczbę\n");
                } }
            catch (NumberFormatException e){
                System.out.println("Podaj liczbę\n");
            } }
        System.out.printf("Dziekujemy za korzystanie z serwisu. Stan konta wynosi: %.2f zł.", account.getStan());
    }

    private static Account nowekonto() {
        System.out.println("Jak masz na imie?");
        String name = scanner.nextLine();
        while (true) {
            System.out.println("Ile srodkow chcesz dodac do swojego konta?");
            try{
                int initialAmount = gotówka();
                return new Account(name, initialAmount);
            }catch (NumberFormatException e){
                System.out.println("Podaj liczbę");
            } } }

    private static void koniec() {
        System.out.println("Dziekujemy");
        System.exit(0);
    }
    private static int gotówka() {
        return Integer.parseInt(scanner.nextLine());
    }
    private static boolean taklubnie() {
        String userAnswer = scanner.nextLine();
        if(userAnswer.toLowerCase().contains("t")) {
            return true;
        }else if(userAnswer.toLowerCase().contains("n")) {
            return false;
        } else {
            System.out.println("Napisz tak lub nie");
            return taklubnie();
        } } }
