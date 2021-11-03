package com.company;

import java.util.Scanner;
import java.util.UUID;

public class UserInterface {
    public void UserInterface(){
    String choice;
    Scanner input = new Scanner(System.in);
    Menu menu = new Menu();
    OdreHandler odreHandler = new OdreHandler();

    boolean runProgram = true;

        while (runProgram) {
        choice = input.nextLine().toLowerCase();
        switch (choice) {
            case "menu","m" -> {
                System.out.println(menu.udskrivMenu());
            }
            case "ny bestilling","ny pizza","ny","pizza" -> {
                System.out.println("Indtast PizzaID");
                int PizzaID = input.nextInt();
                System.out.println("Indtast afleveringstidspunkt");
                int afleveringTid = input.nextInt();
                System.out.println("Indtast note");
                String note = input.nextLine();
                odreHandler.tilføjOdre(PizzaID, afleveringTid, note);

            }
            case "f","færdig","sælg" -> {
                System.out.println("Indtast pizza navn");
                String pizzaNavn = input.nextLine();
                odreHandler.sælgPizza(pizzaNavn);
            }
            case "slet","s" -> {

            }
            case "kø","bestillinger","odre" -> {
                odreHandler.hvisKØ();
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

