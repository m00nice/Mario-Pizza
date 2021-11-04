package com.company;

import java.io.FileNotFoundException;
import java.util.Scanner;


public class UserInterface {
    public void UserInterface() throws FileNotFoundException {
    String choice;
    Scanner input = new Scanner(System.in);
    Menu menu = new Menu();
    OrdreHandler odreHandler = new OrdreHandler();

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
                odreHandler.tilføjOrdre(PizzaID, afleveringTid, note);

            }
            case "f","færdig" -> {
                odreHandler.visKø();
                System.out.println("Indtast OdreID for at færdiggøre odre");
                String OdreID = input.nextLine();
                odreHandler.sælgPizza(OdreID);
            }
            case "s","slet" -> {
                odreHandler.visKø();
                System.out.println("Indtast OdreID for at slette odre");
                String OdreID = input.nextLine();
                odreHandler.sletPizza(OdreID);
            }
            case "k","kø","bestillinger","odre" -> {
                odreHandler.visKø();
            }
            case "x","afslut program" -> {
                odreHandler.gemTilFil();
                runProgram = false;
            }
            case "konto" -> {
                odreHandler.getKonto();
            }
            default -> {
                System.out.println("Lades til der skete en fejl, prøv igen.");
            }

        }
    }

}}

