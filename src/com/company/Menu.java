package com.company;

public class Menu {

    Pizza nummer1 = new Pizza("Vesuvio","tomatsauce, ost, skinke og oregano",57,1);
    Pizza nummer2 = new Pizza("Amerikaner","tomatsauce, ost, oksefars og oregano",53,2);
    Pizza nummer3 = new Pizza("Cacciatore","tomatsauce, ost, pepperoni og oregano",57,3);
    Pizza nummer4 = new Pizza("Cabonara","tomatsauce, ost, kødsauce, spaghetti, cocktailpølser og oregano",63,4);
    Pizza nummer5 = new Pizza("Dennis","tomatsauce, ost, skinke, pepperoni, cocktailpølser og oregano",65,5);
    Pizza nummer6 = new Pizza("Bertil","tomatsauce, ost, Bacon og oregano",57,6);
    Pizza nummer7 = new Pizza("Silvia","tomatsauce, ost, pepperoni, rød peber, løg, oliven og oregano",61,7);
    Pizza nummer8 = new Pizza("Victoria","tomatsauce, ost, skinke, ananas, champignon og oregano",61,8);
    Pizza nummer9 = new Pizza("Toronfo","tomatsauce, ost, skinke, Bacon, Kebab, chili og oregano",61,9);
    Pizza nummer10 = new Pizza("Capricciosa","tomatsauce, ost, skinke, champignon og oregano",61,10);
    Pizza nummer11 = new Pizza("Hawai","tomatsauce, ost, skinke, ananas og oregano",61,11);
    Pizza nummer12 = new Pizza("Le Blissola","tomatsauce, ost, skinke, rejer og oregano",61,12);
    Pizza nummer13 = new Pizza("Venezia","tomatsauce, ost, skinke, bacon og oregano",61,13);
    Pizza nummer14 = new Pizza("Mafia","tomatsauce, ost, skinke, pepperoni, bacon, løg og oregano",61,14);
    Pizza nummer15 = new Pizza("Salat Pizza","tomatsauce, ost, kebab, salat, creme fraiche og oregano",61,15);
    Pizza nummer16 = new Pizza("name","toppings",61,16);
    Pizza nummer17 = new Pizza("Charlie","tomatsauce, ost, gorgonzola,  spaghetti, kylling, rejer og oregano",63,17);
    Pizza nummer18 = new Pizza("name","toppings",61,18);
    Pizza nummer19 = new Pizza("name","toppings",61,19);
    Pizza nummer20 = new Pizza("name","toppings",61,20);
    Pizza nummer21 = new Pizza("Pratt","tomatsauce, ost, kylling, pepperoni, kødsauce, bacon og oregano",63,21);
    Pizza nummer22 = new Pizza("name","toppings",61,22);
    Pizza nummer23 = new Pizza("name","toppings",61,23);
    Pizza nummer24 = new Pizza("name","toppings",61,24);
    Pizza nummer25 = new Pizza("name","toppings",61,25);
    Pizza nummer26 = new Pizza("name","toppings",61,26);
    Pizza nummer27 = new Pizza("name","toppings",61,27);
    Pizza nummer28 = new Pizza("name","toppings",61,28);
    Pizza nummer29 = new Pizza("name","toppings",61,29);
    Pizza nummer30 = new Pizza("name","toppings",61,30);

    public String udskrivMenu(){
    return "1. Vesuvio:.......tomatsauce, ost, skinke og oregano.....................................................................57 kr.\n" +
            "2. Amerikaner:....tomatsauce, ost, oksefars og oregano...................................................................53 kr.\n" +
            "3. Cacciatore:....tomatsauce, ost, pepperoni og oregano..................................................................57 kr.\n" +
            "4. Cabonara:......tomatsauce, ost, kødsauce, spaghetti, cocktailpølser og oregano........................................63 kr.\n" +
            "5. Dennis:........tomatsauce, ost, skinke, pepperoni, cocktailpølser og oregano..........................................65 kr.\n" +
            "6. Bertil:........tomatsauce, ost, bacon og oregano......................................................................57 kr.\n" +
            "7. Silvia:........tomatsauce, ost, pepperoni, rød peber, løg, oliven og oregano..........................................61 kr.\n" +
            "8. Victoria:......tomatsauce, ost, skinke, ananas, champignon og oregano.................................................61 kr.\n" +
            "9. Toronfo:.......tomatsauce, ost, skinke, bacon, kebab, chili og oregano................................................61 kr.\n" +
            "10. Capricciosa:..tomatsauce, ost, skinke, champignon og oregano.........................................................61 kr.\n" +
            "11. Hawai:........tomatsauce, ost, skinke, ananas og oregano.............................................................61 kr.\n" +
            "12. Le Blissola:..tomatsauce, ost, skinke, rejer og oregano..............................................................61 kr.\n" +
            "13. Venezia:......tomatsauce, ost, skinke, bacon og oregano..............................................................61 kr.\n" +
            "14. Mafia:........tomatsauce, ost, skinke, pepperoni, bacon, løg og oregano..............................................61 kr.\n" +
            "15. Salat Pizza:..tomatsauce, ost, kebab, salat, creme fraiche og oregano................................................61 kr.\n" +
            "16. Marco Polo:...tomatsauce, ost, kylling, grøn peber, jalapenos og oregano.............................................61 kr.\n" +
            "17. Charlie:......tomatsauce, mozzarella, gorgonzola, parmesan, cheddar, spaghetti, kylling, rejer og oregano............65 kr.\n" +
            "18. Mexicano:.....tomatsauce, ost, kødsauce, jalapenos, løg og oregano...................................................63 kr.\n" +
            "19. Roma:.........tomatsauce, ost, pepperoni, ananas, salat og oregano...................................................61 kr.\n" +
            "20. Neptun:.......tomatsauce, ost, pepperoni, kødsauce, champignon, rejer og oregano.....................................63 kr.\n" +
            "21. Pratt:........tomatsauce, ost, kylling, pepperoni, kødsauce, bacon og oregano........................................63 kr.\n" +
            "22. Chicken:......tomatsauce, ost, kylling, jalapenos og oregano.........................................................61 kr.\n" +
            "23. Margherita:...tomatsauce, ost og oregano.............................................................................53 kr.\n" +
            "24. Yankee:.......tomatsauce, ost, pepperoni, grøn peber og oregano......................................................61 kr.\n" +
            "25. Sicily:.......tomatsauce, ost, spaghetti, ansjoser og oregano........................................................61 kr.\n" +
            "26. DK:...........tomatsauce, ost, kødsauce, banan, ananas og oregano....................................................61 kr.\n" +
            "27. Vegetariana:..tomatsauce, ananas salat, champignon, løg og oregano...................................................61 kr.\n" +
            "28. Bodil:........tomatsauce, ost, pepperoni, creme fraiche og oregano...................................................57 kr.\n" +
            "29. Bowser:.......tomatsauce, ost, gorgonzola, kebab, løg, rød peber, jalapenos og oregano...............................63 kr.\n" +
            "30. Mamma Mia:....tomatsauce, ost, skinke, bacon, pepperoni, kylling, kebab, cocktailpølser, kødsauce og oregano.........69 kr.\n";

    }

}
