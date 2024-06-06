package Ders_13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class deneme02 {
    //    Talep: Restoran uygulaması geliştirme
//
//    Restoran, kullanıcıların menüden sipariş verebileceği bir uygulama geliştirmek istiyor.
//    Aşağıdaki gereksinimlere uygun bir Java programı yazmanız gerekmektedir:
//
//    1- Restoranın menüsü, yemek adları ve fiyatlarından oluşan bir HashMap veri yapısı kullanılarak tanımlanmalıdır.
//    2- Kullanıcıya menüdeki yemekleri ve fiyatlarını gösteren bir liste sunulmalıdır.
//    3- Kullanıcı, sipariş listesini girmek için programdan bir giriş istemelidir. Siparişler virgülle
//            ayrılmış olarak girilmelidir.
//    4- Program, kullanıcının girdiği siparişlerin toplam fiyatını hesaplamalı ve ekrana yazdırmalıdır.
//    5- Program, kullanıcının girdiği siparişlerin indirim tutarını hesaplamalı ve ekrana yazdırmalıdır.
//            İndirimler, özel tekliflerin bulunduğu bir HashMap veri yapısı kullanılarak tanımlanmalıdır.
//    6- Program, toplam tutarı hesaplayarak ekrana yazdırmalıdır (toplam fiyat - indirim tutarı).
//    7- Kullanıcının girdiği sipariş listesini ekrana yazdırmalıdır.
//    İstenen özelliklere sahip bir Java programı geliştirerek, restoranın taleplerini karşılayabilirsiniz.

    public static void main(String[] args) {
        Map<String, Double> menu = new HashMap<>();

        menu.put("kebap", 56.99);
        menu.put("pilav", 42.99);
        menu.put("makarna", 24.99);
        menu.put("salata", 8.99);
        menu.put("tatlı", 14.99);

        Map<String, Double> ozelTeklifler = new HashMap<>();
        ozelTeklifler.put("kebap", 0.2);
        ozelTeklifler.put("tatlı", 0.1);

        for (Map.Entry<String, Double> entry : menu.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sipariş listesini giriniz: ");
        String siparisListesi = scanner.nextLine();
        String[] siparisler = siparisListesi.split(",");

        double toplamFiyat = hesaplaToplamFiyat(menu, siparisler);
        System.out.println("toplamFiyat = " + toplamFiyat);

        double indirimTutari = hesaplaIndirimTutari(menu, ozelTeklifler, siparisler);
        System.out.println("indirimTutari = " + indirimTutari);

        double toplamOdemeTutari = toplamFiyat - indirimTutari;
        System.out.println("toplamOdemeTutari = " + toplamOdemeTutari);

        for (String siparis : siparisler) {
            System.out.println(siparis);
        }
    }

    public static double hesaplaToplamFiyat(Map<String,Double> menu, String[] siparisler){
        double total=0;
        for (String siparis:siparisler){
            if (menu.containsKey(siparis))
                total+=menu.get(siparis);
        }
        return total;
    }

    public static double hesaplaIndirimTutari(Map<String,Double> menu, Map<String ,Double> ozelTeklifler, String[] siparisler){
        double indirimTutari=0;
        for(String siparis:siparisler){
            if (menu.containsKey(siparis) && ozelTeklifler.containsKey(siparis)){
                double fiyat=menu.get(siparis);
                double indirimOrani=ozelTeklifler.get(siparis);
                double indirimMiktari=fiyat*indirimOrani;
                indirimTutari+=indirimMiktari;
            }
        }
        return indirimTutari;
    }

}
