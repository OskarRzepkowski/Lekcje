package com.company;

import java.util.Scanner;

public class Zad1
{
    public static void main(String[] args)
    {
        System.out.println("Wpisz liczbę");
        Scanner scan = new Scanner(System.in);
	    int a;
        a = scan.nextInt();

        System.out.println("Wpisz liczby");
        int[] tablica= new int [a];
        for(int i=0; i<a; i++)
        {
            tablica[i] = scan.nextInt();
        }
        System.out.println("Twoja tablica");
        for(int i=0; i<a; i++)
        {
            System.out.println(tablica[i]);
        }

    }
}
