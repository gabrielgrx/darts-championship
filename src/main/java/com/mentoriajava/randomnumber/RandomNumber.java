package com.mentoriajava.randomnumber;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int limit = 7;
        int num_random = random.nextInt(limit);
        boolean validation = true;

        do {
            System.out.println("Guess the random number between 0 and 7:");
            int guess = scanner.nextInt();
            if (guess == num_random) {
                System.out.println("Conglatulations! You got the right number!!");
                validation = false;
            } else {
                System.out.println("Wrong! Try another number:");
            }
        } while (validation);
    }
}
