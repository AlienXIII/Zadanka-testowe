import java.util.Scanner;

public class DBszyfrCezara {

    //szyfr cezara

    public void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Podaj słowo: ");
        String slowo = reader.nextLine();
        slowo = slowo.trim();
        System.out.println("podaj przesunięcie: ");
        int s = reader.nextInt();

        System.out.println("zaszyfrowany tekst: " + encrypt(slowo, s));

    }

    public static StringBuffer encrypt(String slowo, int s) {
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < slowo.length(); i++) {
            if (Character.isUpperCase(slowo.charAt(i))) {
                char ch = (char) (((int) slowo.charAt(i) +
                        s - 65) % 26 + 65);
                result.append(ch);
            } else {
                char ch = (char) (((int) slowo.charAt(i) +
                        s - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }


}
