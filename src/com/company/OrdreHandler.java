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
            System.out.println("OdreID: " + kø.get(i).getOrdreID() + "\nPizzaID: " + kø.get(i).getPizzaID() + "\nAfleveringstid: " + kø.get(i).getafleveringsTid() + "\nNote: " + kø.get(i).getNote() + "\n");
        }
    }


    public void tilføjOrdre(int PizzaID, String afleveringTid, String note){
        String OrdreID = "pizza "+PizzaID+" "+random.nextInt(10)+random.nextInt(10)+random.nextInt(10);
        Ordre ordre = new Ordre(PizzaID, afleveringTid, OrdreID, note);
        ordre.setPris(PizzaID);
        ordre.setNavn(PizzaID);
        kø.add(ordre);
        odb.ordreliste.add(ordre);
        System.out.println("OrdreID: "+OrdreID+"\nPizzaID: "+PizzaID+"\nPizza: "+ordre.getNavn()+"\nNote: "+note+"\nAfleveringstid: "+afleveringTid);
    }



    public boolean sælgPizza(String OdreID){
        for (int i = 0; i < kø.size(); i++){
            if (kø.get(i).getOrdreID().equals(OdreID))
                odb.ordreliste.add(kø.get(i));
            kø.remove(i);

            return true;
        }
        return false;

    }
    public void sletPizza(String OdreID){
        for (int i = 0; i < kø.size(); i++){
            if (kø.get(i).getOrdreID().equals(OdreID))
                kø.remove(i);
        }

    }
    public void gemTilFil() throws FileNotFoundException {
        odb.gemFil();
    }
}
