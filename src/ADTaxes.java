import java.util.Scanner;


public class ADTaxes {

    //program do obliczania podatku od wysokosci rocznego dochodu

    public void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Podaj swoje dochody: ");
        double dochod = reader.nextInt();
        reader.close();
        double podatek;
        double nadwyzka;
        if (dochod <= 85528) {
            podatek = ((dochod / 100) * 18) - 556.02;

        } else {
            nadwyzka = dochod - 85528;
            podatek = ((nadwyzka / 100) * 32) + 14839.02;
        }
        Math.round(podatek);

        if (podatek <= 0) {
            System.out.println("Wez zarob wiecej, bo nie musisz placic zadnego podatku, a to niezdrowe");

        } else {
            System.out.println("Twoj podatek to " + podatek);
        }


    }
}



