package Draft;


import Draft.NPSNameOreAge.NPSHuman;

import java.util.ArrayList;

class Draft {
    public static void main(String[] args) {

       ArrayList<String> text = new ArrayList<>();

       text.add("Первая строка");
       text.add("Первая строка");
       text.add(" вторая строка");
       text.add(" вторая строка");
       text.add(" третья строка");
       text.add(" третья строка");
       text.add(" четвертая строка");
       text.add(" четвертая строка");

        System.out.println(text);

        text.addAll(text);
        System.out.println(text);

        ArrayList<String> text2 = new ArrayList<>();






    }


}
