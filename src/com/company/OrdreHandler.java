package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;


public class OrdreHandler {
    private ArrayList<Ordre> kø = new ArrayList<>();


    private Random random = new Random();
    private OrdreDatabase odb = new OrdreDatabase();



    public void visKø() {
        for (int i = 0; i < kø.size(); i++) {
            System.out.println("OrdreID: " + kø.get(i).getOrdreID() + "\nPizzaID: " + kø.get(i).getPizzaID() + "\nPizza: " + kø.get(i).getNavn() + "\nAfleveringstid: " + kø.get(i).getafleveringsTid() + "\nNote: " + kø.get(i).getNote() + "\n");
        }
    }


    public void tilføjOrdre(int PizzaID, String afleveringTid, String note){
        String OrdreID = "pizza"+PizzaID+random.nextInt(10)+random.nextInt(10)+random.nextInt(10)+random.nextInt(10)+random.nextInt(10);
        Ordre ordre = new Ordre(PizzaID, afleveringTid, OrdreID, note);
        ordre.setPris(PizzaID);
        ordre.setNavn(PizzaID);
        if(PizzaID <= 30 && PizzaID >= 1){
        kø.add(ordre);
        System.out.println("Ordre tilføjet\nOrdreID: "+OrdreID+"\nPizzaID: "+PizzaID+"\nPizza: "+ordre.getNavn()+"\nNote: "+note+"\nAfleveringstid: "+afleveringTid);}
        else {
            System.out.println("Der skete en fejl med oprettelse af ordre");
        }
    }



    public boolean sælgPizza(String OrdreID){
        for (int i = 0; i < kø.size(); i++){
            if (kø.get(i).getOrdreID().equals(OrdreID)) {
                odb.ordreliste.add(kø.get(i));
                System.out.println(kø.get(i).getOrdreID()+" er solgt");
                kø.remove(i);
                return true;
            }

        }
        return false;

    }
    public boolean sletPizza(String OrdreID){
        for (int i = 0; i < kø.size(); i++){
            if (kø.get(i).getOrdreID().equals(OrdreID))
                System.out.println(kø.get(i).getOrdreID()+" er slettet");
                kø.remove(i);
            return true;
        }
return false;

    }
    public void gemTilFil() throws FileNotFoundException {
        odb.gemFil();
    }
}
