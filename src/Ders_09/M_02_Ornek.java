package Ders_09;

import java.util.Scanner;

public class M_02_Ornek {
    public static void main(String[] args) {

        //Soru : Girilen metini tersten yazdıran programı yazınız.

        //NOT: + İNTEGERLARDA TOPLAMA STRİNGLERDE BİRLEŞTİRME YAPAR

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir metin giriniz : ");
        String metin = scanner.nextLine();

        String tersMetin = "";

        for (int i = metin.length() - 1; i >= 0; i--) {
            tersMetin += metin.charAt(i);
        }

        System.out.println("Metnin ters çevirilmiş hali: " + tersMetin);

    }
}
