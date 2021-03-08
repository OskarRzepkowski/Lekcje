package com.company;

public class Bakery extends Shop{
    private String[] products_nor = {"Tort", "Lasagna", "Bajaderka", "Babeczka"};

    Bakery(String address_nor, String size_nor) {
        super(address_nor, size_nor);
    }

    @Override
    public void get_info(){
        super.get_info();
        System.out.println("Dostępne jedzenie:");
        for (String i : products_nor){
            System.out.println(i);
        }
    }
}
