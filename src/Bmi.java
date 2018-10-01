import java.util.Scanner;

public class Bmi {

    //podajesz wage i wzrost a program podaje ci BMI


    public void main(String[] args) {

        double waga, wzrost;

        Scanner reader = new Scanner(System.in);
        System.out.println("Podaj wage: ");
        waga = reader.nextInt();
        System.out.println("Podaj wzrost: ");
        wzrost = reader.nextInt();
        reader.close();
        double bmi = waga / (wzrost * 2);
        System.out.println("Bazujac na podanych danych uwazam, ze twoj stan to:");

        if (bmi < 18.5) {
            System.out.print("Niedowaga");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.print("waga normalna");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.print("Nadwaga");
        } else if (bmi >= 30) {
            System.out.print("TLUSZCZYCA!!!");
        }


    }
}