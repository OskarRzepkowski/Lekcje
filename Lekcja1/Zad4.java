package com.company;

import java.util.Scanner;
import static java.lang.Math.*;

public class Zad4
{
    public static void main(String[] args)
    {
        System.out.println("Podaj Boki");
        Scanner scan1 = new Scanner(System.in);
        double a =scan1.nextDouble();
        double b =scan1.nextDouble();
        double c =scan1.nextDouble();

        if (pow(a, 2)+pow(b,2)==pow(c,2))
        {
            System.out.println("tak");
        }
        else
            {
                System.out.println("nie");
            }
    }    //nie wiem czym jest trójkąt prawidłowy wieć zrobiłem dla pitagorejskiego
}
