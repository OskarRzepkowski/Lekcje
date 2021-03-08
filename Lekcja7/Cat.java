package com.company;

public class Cat extends Animal{


    public Cat(String name_nor, String color_nor) {
        super(name_nor, color_nor);
    }

    public void makeSound() {
        System.out.println(name_nor + " kot koloru " + color_nor + " wydaje dźwięk 'Miau'");
    }
}
