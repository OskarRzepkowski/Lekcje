package com.company;

public class Bookshop extends Shop{
    private String[] products_nor = {"Poradnik jak zostać informatykiem", "Jak zarabiać na graniu w gry?", "Nauka Javy w 10 minut!", "Ciekawostki ze świata programistów"};

    Bookshop(String address_nor, String size_nor) {
        super(address_nor, size_nor);
    }

    @Override
    public void get_info(){
        super.get_info();
        System.out.println("Dostępne książki:");
        for (String i : products_nor){
            System.out.println(i);
        }
    }
}
