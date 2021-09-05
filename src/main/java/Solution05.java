/*
 *  UCF COP3330 Fall 2021 Assignment 1 Exercise 5
 *  Copyright 2021 Matthew  Trump
 *
 *  This program will print a line asking for a number
 *  Then it will take input from the user and assign it as a string
 *  Next, the program will ask for a second number
 *  Then it will take that input from the user and assign it to another string
 *  Next, I'll have to find a command that converts the string to an int for both
 *  Finally, it will print the addition, subtraction, multiplication, and division
 *  equations and solutions using one println command.
 *  Within that println command it will solve each solution
 *  ex. a + b and after calculation it will show the output
 */

import java.util.Scanner;

public class Solution05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the first number? ");
        String first = input.nextLine();
        System.out.println("What is the second number? ");
        String second = input.nextLine();

        int a = Integer.parseInt(first);
        int b = Integer.parseInt(second);

        System.out.println(first + " + " + second + " = " + (a + b) + "\n" +
                           first + " - " + second + " = " + (a - b) + "\n" +
                           first + " * " + second + " = " + (a * b) + "\n" +
                           first + " / " + second + " = " + (a / b));
        //Note to grader: I wanted to make the println command neater hence
        // the new line for each equation. I hope that is acceptable.
    }
}
