package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String choice;
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();
        Produktion produktion = new Produktion();

        boolean runProgram = true;

        while (runProgram) {
            choice = input.nextLine().trim().toLowerCase();
            switch (choice) {
                case "menu","m" -> {
                    System.out.println(menu.udskrivMenu());
                }
                case "ny bestilling","ny pizza","ny","pizza" -> {
                    System.out.println("Indtast pizza nummer");
                    int nummer = input.nextInt();
                    System.out.println("Indtast afleverings tidspunkt");
                    int tid = input.nextInt();
                    System.out.println("Indtast note");
                    String note = input.next();
                    System.out.println("Indtast et unikt navn");
                    String name = input.next();
                    produktion.addPizza(nummer,tid,note,name);
                    System.out.println( "Pizza nr."+nummer+" er tilføjet\n" +
                                        "Aflevringstid: "+tid+"\n" +
                                        "Note: "+note+"\n" +
                                        "Navn: "+name);

                }
                case "f","færdig","sælg" -> {
                    System.out.println("Indtast pizza navn");
                    String pizzaNavn = input.nextLine();
                    produktion.sælgPizza(pizzaNavn);
                }
                case "slet","s" -> {

                }
                case "kø","bestillinger" -> {
                    produktion.hvisKø();
                }
                case "x","afslut program" -> {
                    runProgram = false;
                }
                default -> {
                    System.out.println("Lades til der skete en fejl, prøv igen.");
                }

            }
        }

    }}
