import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class WydawanieReszty {

    //Program pokazuje ile wydac reszty w monetach zaleznie od podanej mu liczby

    public void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        boolean errorCheck = true;
        int x = 0;

        do {
            if (!errorCheck) {
                System.out.println("Źle podajesz kwotę\n");
            }
            System.out.println("Wpisz kwotę (zł [spacja] gr.: ");

            String n = reader.nextLine();


            String regexPattern = "^[0-9]+ [0-9]+$";                         //wyrazenie regularne sprawdzajace stringa
            Pattern p = Pattern.compile(regexPattern);
            Matcher m = p.matcher(n);
            boolean b = m.matches();

            if (!b) {
                errorCheck = false;
            } else {
                errorCheck = true;

                String stringWithoutSpace = n.replace(" ", "");     //usuwanie spacji
                x = Integer.parseInt(stringWithoutSpace);                              //zmiana stringa na int


            }
        } while (errorCheck != (true));

        //obliczenia

        int gr1, gr2, gr5, gr10, gr20, gr50, zl1, zl2, zl5;

        zl5 = x / 500;
        x = x - (500 * zl5);
        zl2 = x / 200;
        x = x - (200 * zl2);
        zl1 = x / 100;
        x = x - (100 * zl1);
        gr50 = x / 50;
        x = x - (50 * gr50);
        gr20 = x / 20;
        x = x - (20 * gr20);
        gr10 = x / 10;
        x = x - (10 * gr10);
        gr5 = x / 5;
        x = x - (5 * gr5);
        gr2 = x / 2;
        x = x - (2 * gr2);
        gr1 = x / 1;
        x = x - (1 * gr1);

        if (zl5 > 0) {
            System.out.println(zl5 + " x 5 zl");
        }
        if (zl2 > 0) {
            System.out.println(zl2 + " x 2 zl");
        }
        if (zl1 > 0) {
            System.out.println(zl1 + " x 1 zl");
        }
        if (gr50 > 0) {
            System.out.println(gr50 + " x 50 gr");
        }
        if (gr20 > 0) {
            System.out.println(gr20 + " x 20 gr");
        }
        if (gr10 > 0) {
            System.out.println(gr10 + " x 10 gr");
        }
        if (gr5 > 0) {
            System.out.println(gr5 + " x 5 gr");
        }
        if (gr2 > 0) {
            System.out.println(gr2 + " x 2 gr");
        }
        if (gr1 > 0) {
            System.out.println(gr1 + " x 1 gr");
        } else {
            System.out.println("Nie masz pieniedzy! Wez idz cos zarob biedaku robaku!");
        }

    }
}
