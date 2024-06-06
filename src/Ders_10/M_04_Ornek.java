package Ders_10;

import java.util.Scanner;

public class M_04_Ornek {

    public static void main(String[] args) {

        //Soru: Bir Java programı yazmanız isteniyor. Bu program, kullanıcıdan 5 adet sayı girişi alacak,
        // bu sayıları bir diziye yerleştirecek ve dizideki en büyük sayıyı ekrana yazdıracak.
        // Dizilerde yer alan hazır metotları kullanmadan bu işlemi gerçekleştiren bir Java kodu yazınız.

        Scanner scanner = new Scanner(System.in);

        int[] sayilar = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + ". sayıyı girin: ");
            sayilar[i] = scanner.nextInt();
        }

        int enBuyukSayi = sayilar[0];

        for (int i = 1; i < 5; i++) {
            if (sayilar[i] > enBuyukSayi) {
                enBuyukSayi = sayilar[i];
            }
        }

        System.out.println("En büyük sayı: " + enBuyukSayi);

    }
}
