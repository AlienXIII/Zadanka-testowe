import java.util.Scanner;

public class Main {

    //funkcje na stringach

    public static void main(String[] args) {


        Scanner reader = new Scanner(System.in);
        System.out.println("Podaj zdanie: ");
        String slowo = reader.nextLine();
        System.out.println("Jakiej litery szukac: ");
        Scanner sc = new Scanner(System.in);
        char litera = sc.next().charAt(0);

        if (strPos(slowo, litera)) {
            System.out.println("w twoim zdaniu jest znak " + litera);
        } else {
            System.out.println("w twoim zdaniu nie ma znaku " + litera);
        }

        System.out.println("Patrz jak twoje zdanie smiesznie wyglada: ");
        System.out.println(flipCase(slowo));
        System.out.println("W twoim zdaniu jest " + wordCount(slowo) + " liter");

        System.out.println("Twoje zdanie podzielone spacjami to: ");

        for (String s : splitWords(slowo))
            System.out.println(s);

        System.out.println("A teraz podaj jakich słów szukac w twoim  zdaniu");
        String szukane = reader.nextLine();
        System.out.println();

        System.out.print("slowo: " + szukane + " ");
        if ((strFindAndCount(slowo, szukane)) < 1) {
            System.out.print("nie wystepuje w zdaniu");
        } else
            System.out.print("pojawia się " + (strFindAndCount(slowo, szukane)) + " razy");
        System.out.println();
        System.out.println("Ile liter wyciac?");
        int ileWyciac = reader.nextInt();

        int skadWyciac = slowo.length() + 1;
        do {
            System.out.println("Z ktorego miejsca w zdaniu?");
            skadWyciac = reader.nextInt();
        } while (skadWyciac > slowo.length());
        System.out.println(skadWyciac);
        System.out.println(slowo);


        System.out.println("Twoje wyciete slowo to: " + strcut(slowo, skadWyciac, ileWyciac));

    }


    //funkcje

    public static boolean strPos(String text, char z) {
        if (text.indexOf(z) != -1) {
            return true;
        } else {
            return false;
        }
        //return text.indexOf(z)!= -1;
        //moznaby tak ladnie wszystko skrocic
    }

    public static String flipCase(String text) {
        char[] chars = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);
    }

    public static int wordCount(String text) {
        int wordCount = 1;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ' && text.charAt(i + 1) != ' ') {
                wordCount++;
            }
        }
        return wordCount;
    }


    public static String[] splitWords(String text) {

        String[] arraySplit = text.split(" ");
        return arraySplit;
    }

    public static int strFindAndCount(String text, String co) {

        int count = (text.split(co, -1).length) - 1;
        return count;
    }

    public static String strcut(String str, int start, int ile) {


        String wycinanka = str.substring(start - 1, start + ile - 1);// (slowo, poz1, poz 2)
        return wycinanka;
    }


}



