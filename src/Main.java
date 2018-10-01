import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Main {

    //opis programu

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        boolean errorCheck = true;
        int x = 0;

        do {
            if (!errorCheck) {
                System.out.println("Źle podajesz kwotę\n");
            }
            System.out.println("Wpisz kwotę (zł [spacja] gr.: ");

            String n = reader.nextLine();


            String regexPattern = "^[0-9]+ [0-9]+$";
            Pattern p = Pattern.compile(regexPattern);
            Matcher m = p.matcher(n);
            boolean b = m.matches();

            if (!b) {
                errorCheck = false;
            } else {
                errorCheck = true;
                String stringWithoutSpace = n.trim();

            }
        } while (errorCheck != (true));
        errorCheck = true;

        System.out.println(x);

    }
}
