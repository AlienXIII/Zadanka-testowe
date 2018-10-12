import java.util.Scanner;

public class TranslatorRGB {

    //Translator RGB

    public static void main(String[] args) {

        String code;
        do {
            Scanner reader = new Scanner(System.in);
            System.out.println("Podaj color code #RRGGBB: ");
            code = reader.nextLine();
        } while (code.length() != 7 || code.charAt(0) != '#' || !sprawdzanieInputu(code));

        System.out.println("Wynikiem dla " + code + " jest ");
        for (int i = 0; i < 3; i++) {
            System.out.print(HTMLColor2RGB(code)[i]);
            System.out.print(" ");
        }
    }

    static boolean sprawdzanieInputu(String input) {

        int ascii;
        boolean wynik = false;
        for (int i = 1; i < (input.length()) - 1; i++) {
            ascii = input.charAt(i);

            if (ascii > 64 && ascii < 71)
                wynik = true;

            else if (ascii > 47 && ascii < 58)
                wynik = true;
            else {
                wynik = false;
                break;
            }
        }
        return wynik;
    }

    static int[] HTMLColor2RGB(String color) {

        int liczba = 0;
        int a = -1;
        int[] array = new int[3];

        for (int i = 1; i < 6; i += 2) {

            int x = color.charAt(i);
            int y = color.charAt(i + 1);
            a++;

            if (x > 64 && x < 71) { //pierwsza liczba to A-F
                liczba = 16 * (10 + (x - 65));
            }
            if (x > 47 && x < 58) { //pierwsza liczba to 0-9
                liczba = 16 * (x - 48);
            }
            if (y > 64 && y < 71) { //druga liczba to A-F
                liczba += 10 + (y - 65);
            }
            if (y > 47 && y < 58) { //druga liczba to 0-9
                liczba += y - 48;
            }
            array[a] = liczba;
        }
        return array;
    }
}
