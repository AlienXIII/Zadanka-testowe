import java.util.Scanner;


public class LiczenieRat {

    //program do liczenia rat

    public void main(String[] args) {

        System.out.println("Hello World!");
        Scanner reader = new Scanner(System.in);

        int cena = 0;
        int iloscRat = 0;
        double oprocento = 0;
        double rata = 0;

        System.out.println("Podaj cene produktu:\n(od 100 do 10tys) ");
        cena = reader.nextInt();

        while ((cena > 10000 || cena < 100)) {
            System.out.println("Zła cena!");
            System.out.println();
            System.out.println();
            System.out.println("Podaj cene produktu:\n(od 100 do 10tys) ");
            cena = reader.nextInt();
        }
        do {
            System.out.println("Podaj ilosc rat:\n(od 6 do 48) ");
            iloscRat = reader.nextInt();
        } while (iloscRat < 6 || iloscRat > 48);
        reader.close();

        rata = cena / iloscRat;

        if (iloscRat >= 6 && iloscRat <= 12) {
            oprocento = (rata / 100) * 2.5;
        } else if (iloscRat > 12 && iloscRat < 25) {
            oprocento = (rata / 100) * 5;
        } else if (iloscRat > 24 && iloscRat < 49) {
            oprocento = (rata / 100) * 10;
        }

        rata = rata + oprocento;

        System.out.println("za towar warty " + cena);
        System.out.println("z iloscia rat " + iloscRat);
        System.out.println("kazda rata bedzie wynosic " + rata);

    }
}