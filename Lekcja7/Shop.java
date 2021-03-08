package com.company;

public class Shop {
    protected String address_nor;
    protected String size_nor;

    Shop(String address_nor, String size_nor){
        this.address_nor = address_nor;
        this.size_nor = size_nor;
    }

    public void get_info(){
        System.out.println("Adres sklepu:  "+ address_nor + " Wielkość sklepu: "+ size_nor + " wielkości");
    }
}
