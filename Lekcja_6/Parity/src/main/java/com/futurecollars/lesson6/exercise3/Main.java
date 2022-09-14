package com.futurecollars.lesson6.exercise3;
import static com.futurecollars.lesson6.exercise3.Parity.parityChecking;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wprowadź liczbę całkowitą");
        Scanner sc = new Scanner(System.in);
        int integer = sc.nextInt();
        parityChecking(integer);
    }
}
