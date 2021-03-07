package com.company;

abstract class Bank {
    abstract String getBalance();

    public void AcountState(String Bank){
        System.out.println(Bank + " Środki na koncie : " + getBalance());
    }
}
