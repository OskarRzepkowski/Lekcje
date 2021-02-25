package com.company;

import java.util.Scanner;

public class Zad4
{
    public static void wyswietlacz(int[][] a)
    {
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[0].length; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a;
        int b;

        System.out.println("Podaj liczbę rzędów");
        a=scan.nextInt();
        System.out.println("Podaj liczbę kolumn");
        b=scan.nextInt();

        int[][] tablica =new int[a][b];
        System.out.println("Podaj liczby do tablicy");
        for(int i=0; i<a; i++)
        {
            for(int j=0; j<b; j++)
            {
                System.out.println("rząd: "+i+" ");
                System.out.println("kolumna: "+j+" " );
                tablica[i][j]=scan.nextInt();
            }
        }
        wyswietlacz(tablica);
    }
}
