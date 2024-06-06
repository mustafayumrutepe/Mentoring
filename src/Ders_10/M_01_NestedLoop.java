package Ders_10;

public class M_01_NestedLoop {
    public static void main(String[] args) {

        // Nested --> iç içe, Loop --> Döngü

        for (int i = 0; i < 5; i++) { // i 1 tur atarken

            for (int j = 0; j < 3; j++) { // j 10 tur atacak
                System.out.print(" ▶");

                for (int k = 0; k < 1; k++) { // j 1 tur atarken k 2 tur atacak
                    System.out.print(" ☺");

                    for (int l = 0; l < 1; l++) { // k 1 tur atarken  l 5 tur atacak
                        System.out.print(" ❤");
                    }

                }

            }
            System.out.println();
        }
    }
}
