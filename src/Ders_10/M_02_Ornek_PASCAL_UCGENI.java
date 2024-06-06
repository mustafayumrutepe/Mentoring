package Ders_10;

import java.util.Scanner;

public class M_02_Ornek_PASCAL_UCGENI {
    public static void main(String[] args) {
        // nested loop kullanarak kullanıcıdan aldığımız sayı ile pascal üçgeni yapan programı yazalım.

//        Bir sayı giriniz : 9
//                1
//              1 2 1
//            1 2 3 2 1
//          1 2 3 4 3 2 1
//        1 2 3 4 5 4 3 2 1
//      1 2 3 4 5 6 5 4 3 2 1
//    1 2 3 4 5 6 7 6 5 4 3 2 1
//  1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
//1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1


        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int size = scanner.nextInt();
        for (int satir = 1; satir <= size; satir++) {
            for (int sutun = 1; sutun <= 2 * size; sutun++) {
                if (sutun > size + satir - 1) {
                    continue;
                }
                if (sutun <= size) { //koşul ? doğruDurum : yanlışDurum
                    System.out.print((satir + sutun >= size + 1 ? (satir + sutun - 1) % size + 1 : " ") + " ");
                } else {
                    System.out.print((satir + sutun >= size + 1 ? (satir + size) % sutun : " ") + " ");
                }
            }
            System.out.println();
        }


    }
}
