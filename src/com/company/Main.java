package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int userData = input.nextInt();

        if (userData % 5 == 0 && userData % 3 == 0) {
            System.out.println("FizzBuzz");
        }
        else if (userData % 3 == 0) {
            System.out.println("Buzz");
        }
        else if (userData % 5 == 0) {
            System.out.println("Fizz");
        }
        else {
            System.out.println(userData);
        }
    }
}
