package Ders_05;

import java.util.Scanner;

public class M_02_JavaScanner {
    public static void main(String[] args) {

        //Java'da Scanner sınıfını kullanarak kullanıcıdan girdi almayı amaçlar.
        //Scanner scanner = new Scanner(System.in); //diye nesne oluşturulur.
        //import java.util.Scanner; importu eklenir
        // Tam sayı girişi almak: .nextInt();
        // Ondalıklı sayı girişi almak: nextDouble();
        // Metin girişi almak: nextLine();
        // Verileri temizlemek için: close();
        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerStr = new Scanner(System.in);

        //Soru1: Kullanıcıdan bir kenar uzunluğu girişi alıp karenin alanını hesaplayan bir program yazınız.
        System.out.print("Karenin kenar uzunluğunu girin: ");
        double kenar = scannerInt.nextDouble();
        double alan = kenar * kenar;
        System.out.println("Karenin alanı: " + alan);

        //Soru2: Kullanıcıdan alınan bir metni ekrana yazdıran programı yazınız.
        System.out.print("Bir metin girin: ");
        String metin = scannerStr.nextLine();
        System.out.println("Girilen metin: " + metin);

        //soru3: Kullanıcıdan üç kenar uzunluğu girişi alıp üçgenin çevresini hesaplayan bir program yazınız.
        System.out.print("Birinci kenar uzunluğunu girin: ");
        int kenar1 = scannerInt.nextInt();
        System.out.print("İkinci kenar uzunluğunu girin: ");
        int kenar2 = scannerInt.nextInt();
        System.out.print("Üçüncü kenar uzunluğunu girin: ");
        int kenar3 = scannerInt.nextInt();
        int cevre = kenar1 + kenar2 + kenar3;
        System.out.println("Üçgenin çevresi: " + cevre);
        scannerInt.close();
        scannerStr.close();
    }
}
