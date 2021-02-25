package com.company;

import java.util.Scanner;

public class Zad3
{
    public static int[] suma(int[] a, int[] b)
    {
        //rip tablica c [*] ;-;

        if(a.length==b.length)
        {
            for(int i=0; i<a.length; i++)
            {
                a[i]+=b[i];
            }
        }
        else
        {
            for(int i=0; i<a.length; i++)
            {
                a[i]=0;
            }
        }
        return a;
    }

    public static void main(String[] args)
    {
        System.out.println("Wpisz liczbę ");
        Scanner scan = new Scanner(System.in);
        int a;
        a = scan.nextInt();

        int[] tablicaA= new int [a];
        int[] tablicaB= new int [a];
        int[] tablicaC= new int [a];

        System.out.println("Wpisz liczby dla Tablicy A:");
        for(int i=0; i<a; i++)
        {
            tablicaA[i]=scan.nextInt();
        }

        System.out.println("Wpisz liczby dla Tablicy B:");
        for(int i=0; i<a; i++)
        {
            tablicaB[i]=scan.nextInt();
        }

        System.out.println("Twoja Tablica:");
        tablicaC=suma(tablicaA, tablicaB);
        for (int i=0; i<a; i++)
        {
            System.out.println(tablicaC[i]);
        }
    }
}
