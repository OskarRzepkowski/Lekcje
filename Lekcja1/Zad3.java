package com.company;

import java.util.Scanner;

public class Zad3
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę stopni");
        double stopnie =scan.nextDouble();

        double fahrenheit =((9.0/5.0)* stopnie)+32;
        System.out.println(fahrenheit);
    }
}

