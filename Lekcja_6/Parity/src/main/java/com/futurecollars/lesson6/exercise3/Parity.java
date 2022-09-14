package com.futurecollars.lesson6.exercise3;

public class Parity {
    public static void parityChecking(int integer){
        if(integer%2==0){
            System.out.println("Parzysta");
        } else if (integer%2==1||integer%2==-1) {
            System.out.println("Nieparzysta");
        }
        else {
            System.out.println("Liczba nie jest całkowita");
        }
    }
}
