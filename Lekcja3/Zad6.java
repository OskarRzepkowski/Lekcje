package com.company;

import java.util.Scanner;

public class Zad6
{
    public static int uwu (int a,int b)
    {
        int n=0;
        int nwd=0;
        if(a==0)
        {
            return b;
        }
        if(b==0)
        {
            return a;
        }
        if(a>b)
        {
            n=a/2;
        }
        else if(a<b)
        {
            n=b/2;
        }
        else
        {
            return a;
        }
        for(int i=1; i<=n; i++)
        {
            if(a%i==0 && b%i==0)
            {
                nwd=i;
            }
        }
        return nwd;
    }


    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Wpisz Liczbę");
        a= scan.nextInt();
        System.out.println("Wpisz drugą liczbę");
        b= scan.nextInt();

        System.out.println(uwu(a,b));
    }
}
