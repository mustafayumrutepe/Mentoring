package Ders_07;

public class M_01_JavaOperators {
    public static void main(String[] args) {

//Aritmetik Operatörler (+, -, *, /, %): Matematiksel işlemler yapmak için kullanılır.

        int a = 10 + 5; // a'nın değeri 15 olur
        int b = 10 - 5; // b'nin değeri 5 olur
        int c = 10 * 5; // c'nin değeri 50 olur
        int d = 10 / 5; // d'nin değeri 2 olur
        int e = 10 % 4; // e'nin değeri 2 olur (kalan)

//Karşılaştırma Operatörleri (==, !=, >, <, >=, <=): İki değeri karşılaştırmak için kullanılır.
// Sonuç, true (doğru) veya false (yanlış) olarak döner.
        int x = 5;
        int y = 10;

        boolean sonuc1 = (x == y); // false
        boolean sonuc2 = (x != y); // true
        boolean sonuc3 = (x > y);  // false
        boolean sonuc4 = (x < y);  // true
        boolean sonuc5 = (x >= y); // false
        boolean sonuc6 = (x <= y); // true

//Mantıksal Operatörler (&&, ||, !): Mantıksal ifadeleri birleştirmek veya tersine çevirmek için kullanılır.

        boolean a1 = true;
        boolean b1 = false;

        boolean sonuc11 = (a1 && b1); // false
        boolean sonuc21 = (a1 || b1); // true
        boolean sonuc31 = !a1;       // false

//Artırma/Azaltma Operatörleri (++, --): Bir değişkenin değerini 1 artırmak veya azaltmak için kullanılır.

        int x1 = 5;

        x1++; // x'in değeri 6 olur
        x1--; // x'in değeri tekrar 5 olur


    }
}
