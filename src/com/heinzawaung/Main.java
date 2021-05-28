package com.heinzawaung;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static int input;
    public static void main(String[] args) {
        System.out.println("Guessing game with java");

        Random random = new Random();
        int number = random.nextInt(101);

        while (number != input){
            System.out.println("Enter your guess number");
            Scanner scanner = new Scanner(System.in);
            String inputData = scanner.next();

            try {
                input = Integer.parseInt(inputData);
            } catch (NumberFormatException e) {
                System.out.println("Enter only Integer Number");
                continue;
            }

            if (input > number){
                System.out.println("Too Big");
            }else if (input < number){
                System.out.println("Too small");
            }else {
                System.out.println("You Win");
            }
        }
    }
}
