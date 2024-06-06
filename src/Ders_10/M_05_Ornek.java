package Ders_10;

import java.util.Arrays;

public class M_05_Ornek {
    public static void main(String[] args) {


        // String türünde bir dizi oluşturma
        String[] sehirler = new String[5];

        // Dizinin öğelerini atama
        sehirler[0] = "İstanbul";
        sehirler[1] = "Ankara";
        sehirler[2] = "İzmir";
        sehirler[3] = "Bursa";
        sehirler[4] = "Adana";

        // Diziyi ekrana yazdırma
        System.out.println("Şehirler: " + Arrays.toString(sehirler));

        // Dizinin boyutunu alma
        int diziBoyutu = sehirler.length;
        System.out.println("Dizi boyutu: " + diziBoyutu);

        // Dizinin öğelerini for döngüsüyle gezip ekrana yazdırma
        System.out.println("Şehirler (for):");
        for (int i = 0; i < sehirler.length; i++) {
            System.out.println(sehirler[i]);
        }

        // Dizinin sıralanmış halini yazdırma
        Arrays.sort(sehirler);
        System.out.println("Sıralı şehirler: " + Arrays.toString(sehirler));

        // Dizide bir öğenin bulunup bulunmadığını kontrol etme
        String arananSehir = "İzmir";
        boolean varMi = false;
        for (int i = 0; i < sehirler.length; i++) {
            if (sehirler[i].equals(arananSehir)) {
                varMi = true;
                break;
            }
        }
        if (varMi) {
            System.out.println(arananSehir + " dizide bulunuyor.");
        } else {
            System.out.println(arananSehir + " dizide bulunmuyor.");
        }

    }
}
