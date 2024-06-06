package Ders_09;

import java.util.Scanner;

public class M_03_Ornek {

    public static void main(String[] args) {

        //Soru :

        Scanner scanner = new Scanner(System.in);

        System.out.print("Başlangıç sayısını girin: ");
        int baslangic = scanner.nextInt();

        System.out.print("Bitiş sayısını girin: ");
        int bitis = scanner.nextInt();

        for (int sayi = baslangic; sayi <= bitis; sayi++) {
            boolean asalMi = true;

            if (sayi < 2)
                asalMi = false;

            for (int i = 2; i <= sayi / 2; i++) {
                if (sayi % i == 0) {
                    asalMi = false;
                    break;
                }
            }

            if (asalMi) {
                System.out.print("Asal Sayı: ");


            }
            System.out.println(sayi);
        }

    }
}
