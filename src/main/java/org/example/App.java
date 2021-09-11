package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Esteban Leyte-Vidal
 */

public class App
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a noun: ");
        String noun = scanner.nextLine();

        System.out.print("Enter a verb: ");
        String verb = scanner.next();

        System.out.print("Enter an adjective: ");
        String adj = scanner.next();

        System.out.print("Enter an adverb: ");
        String adverb = scanner.next();

        System.out.println("Do you "+ verb +" your "+ adj +" "+ noun +" "+ adverb +"? That's hilarious!");
    }


}
