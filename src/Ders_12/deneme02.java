package Ders_12;

import java.util.ArrayList;

public class deneme02 {

    public static ArrayList<ArrayList<Integer>> ogrNotListesi = new ArrayList<>();

    public static void main(String[] args) {

        ogrNotListesi.add(new ArrayList<>());
        ogrNotEkle(0, 10);
        ogrNotEkle(0, 30);
        ogrNotEkle(0, 25);

        ogrNotEkle(1, 90);
        ogrNotEkle(1, 100);
        ogrNotEkle(1, 70);

        ogrNotEkle(2, 50);
        ogrNotEkle(2, 80);
        ogrNotEkle(2, 95);

        for (int i = 0; i < ogrNotListesi.size(); i++) {
            System.out.println(ogrNotListesi.get(i));
        }
        System.out.println();

        double sinif0Ort = sinifNotOrt(0);
        double sinif1Ort = sinifNotOrt(1);
        double sinif2Ort = sinifNotOrt(2);
        System.out.println("Sınıf 0 ortalaması: " + sinif0Ort + "\nSınıf 1 ortalaması: " + sinif1Ort + "\nSınıf 2 ortalaması: " + sinif2Ort);

        System.out.println("Okul not ort: "+okulNotOrt(ogrNotListesi));
    }


    public static void ogrNotEkle(int sinifNo, int ogrNot) {

        if (sinifNo >= ogrNotListesi.size())
            ogrNotListesi.add(new ArrayList<>());
        ogrNotListesi.get(sinifNo).add(ogrNot);
    }


    public static double sinifNotOrt(int sinif) {
        double toplam = 0;

        for (int not : ogrNotListesi.get(sinif)) {
            toplam += not;
        }
        double sinifOrt = toplam / ogrNotListesi.get(sinif).size();
        return sinifOrt;
    }

    public static double okulNotOrt(ArrayList<ArrayList<Integer>> ogrNotListesi) {
        double toplam = 0;
        double okulOrt=0;

        for (int i = 0; i < ogrNotListesi.size(); i++) {
            toplam+=sinifNotOrt(i);
        }
        okulOrt=toplam/ogrNotListesi.size();
        return okulOrt;
    }
}
