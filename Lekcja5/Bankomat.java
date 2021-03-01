package com.company;

import java.util.Scanner;

public class Bankomat
{
    public Bankomat(){}

    public void menu(Konto[] tablcia)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj Id: ");
        int id = scan.nextInt();
        int a=-1;
        for (int i=0; i< tablcia.length; i++)
        {
            if(id==tablcia[i].id)
            {
                a=i;
            }
        }

        if(a==-1)
        {
            System.out.println("Nie ma takiego ID");
            menu(tablcia);   //rekurencja
        }
        else
        {
            wybor(tablcia, a);

        }
    }

    public void wybor(Konto[] tab,int a)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("MENU:");
        System.out.println("1: Status Konta");
        System.out.println("2: Wypłacanie");
        System.out.println("3: Wpłacenie");
        System.out.println("4: Wyjście");
        System.out.println("Wybierz Opcje: ");
        int tw = scan.nextInt();

        if (tw==1)
        {
            System.out.println("Twój status konta: "+tab[a].kasa);
            wybor(tab, a);
        }
        else if (tw==2)
        {
            System.out.println("Ile chcesz wypłacić?");
            int c= scan.nextInt();
            if (tab[a].kasa>c)
            {
                tab[a].kasa-=c;
                wybor(tab, a);
            }
            else
            {
                System.out.println("Nie posiadasz tylu pieniędzy");
                wybor(tab, a);
            }
        }
        else if (tw==3)
        {
            System.out.println("Ile chcesz wpłacić?");
            int c= scan.nextInt();
            tab[a].kasa+=c;
            wybor(tab, a);
        }
        else if (tw==4)
        {
            menu(tab);
        }
        else
        {
            System.out.println("Wybrano złą opcję!");
            wybor(tab, a);
        }
    }

}
