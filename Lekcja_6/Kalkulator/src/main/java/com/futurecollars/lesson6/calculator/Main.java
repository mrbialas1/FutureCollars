package com.futurecollars.lesson6.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj dwie liczby do obliczeń:");
        Scanner sc = new Scanner(System.in);
        double number1 = sc.nextInt();
        double number2 = sc.nextInt();
        double[] table = new double[4];
        for (int i = 0; i < 4; i++) {
            table[i] = Calculator.sum(number1, number2);
            i++;
            table[i] = Calculator.sub(number1, number2);
            i++;
            table[i] = Calculator.mul(number1, number2);
            i++;
            table[i] = Calculator.div(number1, number2);
        }
        System.out.println("Wyniki: dodawanie - "+table[0]+", odejmowanie - "+table[1]+", mnożenie - "+table[2]+" i dzielenie - " +table[3]);
    }
}
