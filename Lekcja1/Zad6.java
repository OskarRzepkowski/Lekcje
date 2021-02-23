package com.company;

import java.util.Scanner;
import static java.lang.Math.*;

public class Zad6
{
    public static void main(String[] args)
    {
        System.out.println("Podaj 3 liczby");
        Scanner scan = new Scanner(System.in);
        double a =scan.nextDouble();
        double b =scan.nextDouble();
        double c =scan.nextDouble();

        double maks = max (c, max(a, b));
        double mini = min (c, min(a, b));

        System.out.println(maks);

        double [] tablica={a,b,c};
        for (int i=0; i<tablica.length; i++)
        {
            if (tablica[i]!=maks && tablica[i]!=mini)
            {
                System.out.println(tablica [i]);
            }
        }
        System.out.println(mini);
    }
}
