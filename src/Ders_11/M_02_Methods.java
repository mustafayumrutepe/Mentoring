package Ders_11;

import java.util.Arrays;

public class M_02_Methods {
    public static void main(String[] args) {
        int[] dizi = new int[5];
        elemanEkle(dizi);
        diziYazdir(dizi);
        int toplam = diziToplam(dizi);
        System.out.println("toplam = " + toplam);
        double ort = diziOrtalma(dizi);
        System.out.println("ort = " + ort);
        int enB = enBuyukEleman(dizi);
        System.out.println("enB = " + enB);
    }

    public static void elemanEkle(int[] dz) {
        for (int i = 0; i < dz.length; i++) {
            dz[i] = (int) (Math.random() * (10 + 1));
        }
        System.out.println("arrays ile yazdır: "+Arrays.toString(dz));
    }

    public static void diziYazdir(int[] dz) {
        for (int eleman : dz)
            System.out.print(eleman + " ");
        System.out.println();
    }

    public static int diziToplam(int[] dz) {
        int toplam = 0;
        for (int eleman : dz)
            toplam += eleman;
        return toplam;
    }

    public static double diziOrtalma(int[] dz) {
        int toplam = diziToplam(dz);
        int ort = toplam / dz.length;
        return ort;
    }

    public static int enBuyukEleman(int[] dz) {
        int enBuyuk = dz[0];
        for (int i = 0; i < dz.length; i++) {
            if (dz[i] > enBuyuk)
                enBuyuk = dz[i];
        }
        return enBuyuk;
    }
}
