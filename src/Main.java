import Lab4.Autovehicul;

import java.awt.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        Autovehicul a = new Autovehicul("Nissan GTR", Color.blue,60f,3,300,6);
        Autovehicul a2 = new Autovehicul("BMW",Color.black,90f,4,250,5);
        a.setCuloare(Color.CYAN);
    }
}