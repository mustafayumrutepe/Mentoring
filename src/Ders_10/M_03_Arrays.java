package Ders_10;

public class M_03_Arrays {
    public static void main(String[] args) {

        int[] sayilar = new int[5];

        sayilar[0] = 10;
        sayilar[1] = 20;
        sayilar[2] = 30;
        sayilar[3] = 40;
        sayilar[4] = 50;

        for (int i = 0; i < sayilar.length; i++) {
            System.out.println(sayilar[i]);
        }

    }
}
