package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class OrdreDatabase {

    private ArrayList<Ordre> ordreliste = new ArrayList<>();



    public void saveToFile() throws FileNotFoundException {
        File file = new File("ordrehistorik.txt");
        PrintStream ps = new PrintStream(file);

        for (Ordre ordre : ordreliste) {
            ps.println(ordre);
        }

        System.out.println("Beers have been saved to Beer base in a file - Have a great day!");
    }

}
