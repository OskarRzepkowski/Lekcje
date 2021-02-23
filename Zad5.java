package com.company;

import java.util.Scanner;

public class Zad5
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int liczba =scan.nextInt();

        switch (liczba)
        {
            case 1:
                System.out.println("poniedziałek");
                break;
            case 2:
                System.out.println("wtorek");
                break;
            case 3:
                System.out.println("środa");
                break;
            case 4:
                System.out.println("czwartek");
                break;
            case 5:
                System.out.println("piątek");
                break;
            case 6:
                System.out.println("sobota");
                break;
            case 7:
                System.out.println("niedziela");
                break;
            default:
                System.out.println("NIE!");
                break;
        }
    }
}
