package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String choice;
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();

        boolean runProgram = true;

        while (runProgram) {
            choice = input.nextLine().trim().toLowerCase();
            switch (choice) {
                case "menu" -> {
                    System.out.println(menu.udskrivMenu());
                }
                case "ny bestilling","ny pizza","ny","pizza" -> {
                    int number = input.nextInt();
                    int tid = input.nextInt();
                    String note = input.nextLine();

                }
                case "fjern","slet" -> {

                }
                case "kø","bestillinger" -> {

                }
                case "afslut program" -> {
                    runProgram = false;
                }
                default -> {
                    System.out.println("Lades til der skete en fejl, prøv igen.");
                }

            }
        }

    }}
