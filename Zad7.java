package com.company;

import java.util.Scanner;
import static java.lang.Math.*;

public class Zad7
{
    public static void main(String[] args)
    {
        System.out.println("Podaj x1 i y1");
        Scanner scan = new Scanner(System.in);
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        System.out.println("Podaj x2 i y2");
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();

        double jd = sqrt(pow(x1-x2, 2)+pow(y1-y2, 2));
        System.out.println(jd);
    }
}
