package com.company;

import java.io.FileNotFoundException;
import java.util.Scanner;


public class UserInterface {
    public void UserInterface() throws FileNotFoundException {
    String choice;
    Scanner input = new Scanner(System.in);
    Menu menu = new Menu();
    OrdreHandler ordreHandler = new OrdreHandler();

    boolean runProgram = true;
        System.out.println("Velkommen til Marios Pizza App Version 1.0");

        while (runProgram) {
        choice = input.nextLine().toLowerCase();
        switch (choice) {
            case "menu","m" -> {
                System.out.println(menu.udskrivMenu());
            }
            case "n","ny" -> {
                System.out.println("Indtast PizzaID");
                int PizzaID = input.nextInt();
                System.out.println("Indtast afleveringstidspunkt");
                String afleveringTid = input.next();
                System.out.println("Indtast note");
                String note = input.next();
                ordreHandler.tilføjOrdre(PizzaID, afleveringTid, note);

            }
            case "f","færdig" -> {
                ordreHandler.visKø();
                System.out.println("Indtast OrdreID for at færdiggøre ordre");
                String OrdreID = input.nextLine();
                ordreHandler.sælgPizza(OrdreID);
            }
            case "s","slet" -> {
                ordreHandler.visKø();
                System.out.println("Indtast OrdreID for at slette ordre");
                String OrdreID = input.nextLine();
                ordreHandler.sletPizza(OrdreID);
            }
            case "k","kø","bestillinger","odre" -> {
                ordreHandler.visKø();
            }
            case "x","afslut program" -> {
                ordreHandler.gemTilFil();
                runProgram = false;
            }

            default -> {
                System.out.println("Lades til der skete en fejl, prøv igen.");
            }

        }
    }

}}

