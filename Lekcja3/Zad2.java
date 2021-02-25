package com.company;

import java.util.Scanner;

public class Zad2
{
    public static int najmniejszy(int[] tablica)
    {
        int n=999999999;
        for(int i=0; i<tablica.length;i++)
        {
            if(tablica[i]<n)
            {
                n=tablica[i];
            }
        }
        return n;
    }

    public static int najwiekszy(int[] tablica)
    {
        int n=0;
        for(int i=0; i<tablica.length;i++)
        {
            if(tablica[i]>n)
            {
                n=tablica[i];
            }
        }
        return n;
    }

    public static int suma(int[] tablica)
    {
        int n=0;
        for(int i=0; i<tablica.length;i++)
        {
            n+=tablica[i];
        }
        return n;
    }

    public static double srednia(int[] tablica)
    {
        return Double.valueOf(suma(tablica))/Double.valueOf(tablica.length);
    }

    public static double mediana(int[] tablica)
    {
        if(tablica.length%2==0)
        {
            return Double.valueOf(tablica[tablica.length/2]+tablica[(tablica.length/2)-1])/Double.valueOf(2);
        }
        else
        {
              return (tablica[tablica.length/2]);
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Wpisz liczbę");
        Scanner scan = new Scanner(System.in);
        int a;
        a = scan.nextInt();

        System.out.println("Wpisz liczbę");
        int[] tablica= new int [a];
        tablica[0] = scan.nextInt();

        if(tablica[0]%2==0)
        {
            tablica[1]=tablica[0]+2;
        }
        else
        {
            tablica[1]=tablica[0]+1;
        }

        for(int i=2; i<a; i++)
        {
            tablica[i]=tablica[i-1]+2;
        }
        System.out.println("Twoja tablica");
        for(int i=0; i<a; i++)
        {
            System.out.println(tablica[i]);
        }

        System.out.println("min: " + najmniejszy(tablica));
        System.out.println("max: " + najwiekszy(tablica));
        System.out.println("suma: " + suma(tablica));
        System.out.println("średnia: " + srednia(tablica));
        System.out.println("mediana: " + mediana(tablica));
    }
}


