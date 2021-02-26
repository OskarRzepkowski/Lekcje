package com.company;

import java.util.Scanner;

public class Zad2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pdoaj x i y");
        Punkcik punkt =new Punkcik(scan.nextInt(), scan.nextInt());
        Punkcik punkt2= new Punkcik();

        System.out.println(punkt.odleglosc2(punkt2));
        System.out.println(punkt2.odleglosc(3,4));
    }
}
