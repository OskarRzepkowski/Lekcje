package com.company;

import java.util.Scanner;

public class Zad1 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj Bok");
        Kwadrat kwadrat= new Kwadrat(scan.nextInt());
        System.out.println("Pole: "+kwadrat.pole());
        System.out.println("Obwód: "+kwadrat.obwod());
    }
}
