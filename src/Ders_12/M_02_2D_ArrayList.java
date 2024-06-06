package Ders_12;

import java.util.ArrayList;

public class M_02_2D_ArrayList {

    /*Bir okul sistemi oluşturmanız isteniyor.
    Sistem, sınıflara göre öğrencilerin notlarını tutacak ve not ortalamalarını hesaplayacaktır.
    Bu amaçla, 2D ArrayList kullanmanız gerekmektedir.

    İstenen işlemler şunlardır:

    1- "ogrenciNotuEkle" metodunu kullanarak, belirli bir sınıfa ait bir öğrencinin notunu eklemek.
    2- "sinifOrtalamasi" metodunu kullanarak, belirli bir sınıfın not ortalamasını hesaplamak.
    3- "okulOrtalamasi" metodunu kullanarak, tüm sınıfların not ortalamasının okul genelindeki ortalamasını hesaplamak.
    Bu program ile, öğrenci notlarını ekleyebilmek, sınıf ortalamalarını ve okul ortalamasını hesaplayabilmek isteniyor.*/

    private static ArrayList<ArrayList<Integer>> notlar = new ArrayList<>();

    public static void ogrenciNotuEkle(int sinifIndeks, int not) {
        if (sinifIndeks >= notlar.size()) {
            // Sınıf daha önce oluşturulmadıysa yeni bir sınıf ekle
            notlar.add(new ArrayList<>());
        }

        // İlgili sınıfa notu ekle
        notlar.get(sinifIndeks).add(not);
    }

    public static double sinifOrtalamasi(int sinifIndeks) {
        if (sinifIndeks >= notlar.size()) {
            // Geçersiz sınıf indeksi
            return 0.0;
        }

        ArrayList<Integer> sinifNotlari = notlar.get(sinifIndeks);
        if (sinifNotlari.isEmpty()) {
            // Sınıfın hiç notu yok
            return 0.0;
        }

        int toplam = 0;
        for (int not : sinifNotlari) {
            toplam += not;
        }

        // Sınıfın not ortalamasını hesapla
        return (double) toplam / sinifNotlari.size();
    }

    public static double okulOrtalamasi() {
        if (notlar.isEmpty()) {
            // Henüz sınıf bulunmuyor
            return 0.0;
        }

        int toplam = 0;
        int toplamOgrenciSayisi = 0;

        for (ArrayList<Integer> sinifNotlari : notlar) {
            for (int not : sinifNotlari) {
                toplam += not;
                toplamOgrenciSayisi++;
            }
        }

        // Okulun not ortalamasını hesapla
        return (double) toplam / toplamOgrenciSayisi;
    }

    public static void main(String[] args) {
        // Öğrenci notlarını ekleyin
        ogrenciNotuEkle(0, 85);
        ogrenciNotuEkle(0, 90);
        ogrenciNotuEkle(0, 95);

        ogrenciNotuEkle(1, 75);
        ogrenciNotuEkle(1, 80);
        ogrenciNotuEkle(1, 85);

        // Sınıf ortalamalarını hesaplayın
        double sinif1Ortalamasi = sinifOrtalamasi(0);
        double sinif2Ortalamasi = sinifOrtalamasi(1);

        // Okul ortalamasını hesaplayın
        double okulOrtalamasi = okulOrtalamasi();

        System.out.println("Sınıf 1 Ortalaması: " + sinif1Ortalamasi);
        System.out.println("Sınıf 2 Ortalaması: " + sinif2Ortalamasi);
        System.out.println("Okul Ortalaması: " + okulOrtalamasi);
    }

}
