package Ders_12;

import java.util.ArrayList;
import java.util.Scanner;

public class M_01_ArrayList {

   /* Kullanıcıya çeşitli stok yönetimi işlemlerini gerçekleştirebileceği bir program tasarlaması isteniyor.
   1- Bu program, kullanıcıya bir menü sunmalı ve kullanıcının seçimine göre ilgili işlemi gerçekleştirmelidir.
   2- İşlemler arasında yeni ürün ekleme, stok miktarını güncelleme ve stoktaki ürünleri listeleme gibi seçenekler olmalıdır.
   3- Yeni ürün ekleme işlemi, kullanıcıdan ürün adı ve stok miktarı bilgisi almalı ve bu bilgileri stok listesine eklemelidir.
   4- Stok miktarını güncelleme işlemi, kullanıcıdan güncellenmek istenen bir ürün adı ve yeni stok miktarı almalı ve ilgili ürünün stok miktarını güncellemelidir.
   5- Stoktaki ürünleri listeleme işlemi, stok listesindeki ürünleri ve stok miktarlarını kullanıcıya göstermelidir.
   6- Kullanıcı, istediği işlemi seçebilmeli ve programın sonlanması için çıkış seçeneğini seçebilmelidir. */

    public static ArrayList<String> urunler = new ArrayList<>();
    public static ArrayList<Integer> miktarlar = new ArrayList<>();


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean devam = true;

        while (devam) {
            System.out.println("\u001B[33m"+"*-*-*-*-*-*-*-*-*-*-*-*-*-*");
            System.out.println("1. Ürün Ekle");
            System.out.println("2. Stok Miktarını Güncelle");
            System.out.println("3. Ürünleri Listele");
            System.out.println("0. Çıkış");
            System.out.print("Tercih giriniz : "+"\u001B[0m");

            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    urunEkle(scanner);
                    break;
                case 2:
                    stokMiktariniGuncelle(scanner);
                    break;
                case 3:
                    urunleriListele();
                    break;
                case 0:
                    System.out.println("Çıkış yapılıyor...");
                    devam = false;
                    break;
//                    scanner.close();   //scanner.close(); komutu ile Scanner nesnesi kapatıldıktan sonra
//                    return;            //return; komutu ile main metodu sonlanır ve program tamamen sonlanır, çıkış yapılır.
                default:
                    System.out.println("\u001B[31m"+"Geçersiz seçim. Tekrar deneyin."+"\u001B[0m");
            }
        }
    }

    public static void urunEkle(Scanner scanner) {
        System.out.print("\u001B[34m"+"Ürün adını girin: "+"\u001B[0m");
        String urunAdi = scanner.next();
        System.out.print("\u001B[34m"+"Stok miktarını girin: "+"\u001B[0m");
        int miktar = scanner.nextInt();

        urunler.add(urunAdi);
        miktarlar.add(miktar);

        System.out.println("Ürün başarıyla eklendi.");
    }

    public static void stokMiktariniGuncelle(Scanner scanner) {
        System.out.print("\u001B[34m"+"Güncellemek istediğiniz ürün adını girin: "+"\u001B[0m");
        String urunAdi = scanner.next();

        int indeks = urunler.indexOf(urunAdi);

        if (indeks != -1) {
            System.out.print("\u001B[34m"+"Güncel stok miktarını girin: "+"\u001B[0m");
            int yeniMiktar = scanner.nextInt();
            miktarlar.set(indeks, yeniMiktar);
            System.out.println("Stok miktarı güncellendi.");
        } else {
            System.out.println("\u001B[31m"+"Ürün bulunamadı."+"\u001B[0m");
        }
    }

    public static void urunleriListele() {
        if (urunler.size() == 0) {
            System.out.println("\u001B[31m"+"Stokta ürün bulunmamaktadır."+"\u001B[0m");
        } else {
            System.out.println("\u001B[32m"+"Ürünler ve stok miktarları: "+"\u001B[0m");
            for (int i = 0; i < urunler.size(); i++) {
                System.out.println("\u001B[32m"+urunler.get(i) + " - " + miktarlar.get(i)+"\u001B[0m");
            }
        }
    }


}
