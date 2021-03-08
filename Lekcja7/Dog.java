package com.company;

public class Dog extends Animal{

    public Dog(String name_nor, String color_nor){
        super(name_nor, color_nor);
    }

    public void makeSound() {
        System.out.println(name_nor + " pies koloru " + color_nor + " wydaje dźwięk 'Hau'");
    }
}
