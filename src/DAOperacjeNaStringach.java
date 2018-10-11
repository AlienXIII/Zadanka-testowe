import java.util.Scanner;


public class DAOperacjeNaStringach {

    //Rozne operacje na slowach

    public void main(String[] args) {


        int ile = 0;
        char slowaWspak;
        String wspak = " ";
        char znak_z_napisu;
        boolean palindrom = false;
        int num = 0;


        Scanner reader = new Scanner(System.in);
        System.out.println("Podaj słowo: ");
        String slowo = reader.nextLine();
        slowo = slowo.trim();


        //wyszukiwanie w stringu liczb?


        int liczba;
        for (int i = slowo.length() - 1; i >= 0; i--) {
            if (Character.isDigit(slowo.charAt(i))) {
                liczba = Integer.parseInt(String.valueOf(slowo.charAt(i)));
                num += liczba;
            }
        }


        char last = slowo.charAt(slowo.length() - 1);

        for (int i = 0; i < slowo.length(); i++) {
            znak_z_napisu = slowo.charAt(i);
            if (znak_z_napisu == last) {
                ile++; //
            }
        }
        System.out.println("Ostatnia litera (czyli " + last + " )pojawia sie: " + ile + " razy");


        for (int i = 0; i < slowo.length(); i++) {

            slowaWspak = slowo.charAt((slowo.length() - 1) - i);
            wspak = new StringBuilder(wspak).append(slowaWspak).toString();
        }
        System.out.println("Twoje slowo od tylu brzmi glupio: " + wspak);
        System.out.println();

        for (int i = 0; i < slowo.length() - 1; i++) {
            char x = slowo.charAt((slowo.length()) - 1 - i);
            char y = slowo.charAt(i);
            if (x == y) palindrom = true;
            else palindrom = false;
        }

        System.out.print("To co wpisales to ");
        if (palindrom == true) System.out.print("PALINDROM! Gratz mon!");
        else System.out.print("nie palindrom. Byles blisko kolezko");
        System.out.println();


        System.out.println("Suma cyfr w tekscie to: " + num);


    }
}
