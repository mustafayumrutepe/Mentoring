package Ders_12;

import java.util.ArrayList;
import java.util.Scanner;

public class deneme01 {
    /* Kullanıcıya çeşitli stok yönetimi işlemlerini gerçekleştirebileceği bir program tasarlaması isteniyor.
   1- Bu program, kullanıcıya bir menü sunmalı ve kullanıcının seçimine göre ilgili işlemi gerçekleştirmelidir.
   2- İşlemler arasında yeni ürün ekleme, stok miktarını güncelleme ve stoktaki ürünleri listeleme gibi seçenekler olmalıdır.
   3- Yeni ürün ekleme işlemi, kullanıcıdan ürün adı ve stok miktarı bilgisi almalı ve bu bilgileri stok listesine eklemelidir.
   4- Stok miktarını güncelleme işlemi, kullanıcıdan güncellenmek istenen bir ürün adı ve yeni stok miktarı almalı ve ilgili ürünün stok miktarını güncellemelidir.
   5- Stoktaki ürünleri listeleme işlemi, stok listesindeki ürünleri ve stok miktarlarını kullanıcıya göstermelidir.
   6- Kullanıcı, istediği işlemi seçebilmeli ve programın sonlanması için çıkış seçeneğini seçebilmelidir. */

    public static ArrayList<String> urunler = new ArrayList<>();
    public static ArrayList<Integer> miktar = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean devam=true;

        while (devam){
        System.out.println("\n\n1-Yeni ürün ekleme");
        System.out.println("2-Stok miktarını güncelleme");
        System.out.println("3-Stoktaki ürünleri listele");
        System.out.println("0-Çıkış");
        System.out.print("Bir tercih yapınız: ");
        int secim = scanner.nextInt();
        switch (secim) {
            case 1:
                urunEkle(scanner);
                break;
            case 2:
                miktarGuncelle(scanner);
                break;
            case 3:
                listele();
                break;
            case 0:
                System.out.println("\u001B[31m"+"\n\t"+"Çıkış yapılıyor");
                return;
            default:
                System.out.println("\n\t"+"Geçersiz deger girdiniz. Lütfen tekrar deneyiniz");
        }
    }
    }


    public static void urunEkle(Scanner scanner) {
        System.out.print("Eklemek istediğiniz ürün adı: ");
        String urunAd = scanner.next();
        System.out.print(urunAd+ " stok miktarı: ");
        int urunMiktar = scanner.nextInt();

        urunler.add(urunAd);
        miktar.add(urunMiktar);
        System.out.println("\n\t"+"Ürün eklendi");
    }

    public static void miktarGuncelle(Scanner scanner) {
        System.out.print("Güncellemek istediğiniz ürün adı: ");
        String guncelUrun = scanner.next();
        int index = urunler.indexOf(guncelUrun);

        if (index != -1) {
            System.out.print(guncelUrun+" güncel  stok miktarı: ");
            int guncelMiktar = scanner.nextInt();
            miktar.set(index, guncelMiktar);
            System.out.println("\n\t"+"Stok miktarı güncellendi.");
        }
        else {
            System.out.println("\n\t"+guncelUrun+" adında bir ürün bulunamadı");
        }
    }

    public static void listele() {
        if (urunler.size() == 0) {
            System.out.println("\n\t"+"Stokta hiç ürün yok");
        } else {
            System.out.println("\n"+"Bütün ürünler ve stok miktarları: ");
            for (int i = 0; i < urunler.size(); i++) {
                System.out.println("\u001B[33m" + urunler.get(i) + " = " + miktar.get(i) + "\u001B[0m");
            }
        }
    }
}
