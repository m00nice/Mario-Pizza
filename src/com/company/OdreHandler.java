package com.company;

import java.util.ArrayList;
import java.util.Random;


public class OdreHandler {
    private ArrayList<Odre> KØ = new ArrayList<>();
    private ArrayList<Odre> Arkiv = new ArrayList<>();
    private int konto = 0;
    private Random random = new Random();

    public void hvisKØ() {
        for (int i = 0; i < KØ.size(); i++) {
            System.out.println("OdreID: " + KØ.get(i).getOdreID() + "\nPizzaID: " + KØ.get(i).getPizzaID() + "\nAfleveringstid: " + KØ.get(i).getafleveringsTid() + "\nNote: " + KØ.get(i).getNote() + "\n");
        }
    }


    public void tilføjOdre(int PizzaID, int afleveringTid, String note){
        String OdreID = "pizza"+PizzaID+" "+random.nextInt(10)+random.nextInt(10)+random.nextInt(10);
        Odre odre = new Odre(PizzaID, afleveringTid, OdreID, note);
        odre.setPris(PizzaID);
        KØ.add(odre);
        System.out.println(OdreID+" er nu tilføjet\n" +
                            "PizzaID: "+PizzaID+"\n" +
                            "Afleveringstid: "+afleveringTid+"\n" +
                            "Note: "+note);
    }



    public void sælgPizza(String OdreID){
        for (int i=0; i < KØ.size(); i++){
            if (KØ.get(i).getOdreID().equals(OdreID))
                konto = konto + KØ.get(i).getPris();
            Arkiv.add(KØ.get(i));
            KØ.remove(i);
        }

    }
    public void sletPizza(String OdreID){
        for (int i=0; i < KØ.size(); i++){
            if (KØ.get(i).getOdreID().equals(OdreID))
                KØ.remove(i);
        }

    }
}
