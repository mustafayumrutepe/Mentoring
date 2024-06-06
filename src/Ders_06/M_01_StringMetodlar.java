package Ders_06;

public class M_01_StringMetodlar {
    public static void main(String[] args) {


//        1- length(): Bu metot, bir dizenin uzunluğunu (karakter sayısını) döndürür. Geri dönüş değeri int türündedir.

        String str = "Merhaba";
        int uzunluk = str.length();
        System.out.println("uzunluk = " + uzunluk); //uzunluk = 7

//        2- charAt(index): Bu metot, belirli bir indeksteki karakteri döndürür. İndeks değeri 0'dan başlar.

        char karakter = str.charAt(2);
        System.out.println("karakter = " + karakter); //karakter = r

//        3- substring(beginIndex, endIndex): Bu metot, başlangıç indeksinden (dahil) bitiş indeksine (hariç)
//        kadar olan karakterleri içeren bir alt dize döndürür.

        String altDize = str.substring(2, 5);
        System.out.println("altDize = " + altDize); //altDize = rha

//        4- toUpperCase(): Bu metot, bir dizedeki tüm karakterleri büyük harfe dönüştürür.

        String buyukHarf = str.toUpperCase();
        System.out.println("buyukHarf = " + buyukHarf); //buyukHarf = MERHABA

//        5- toLowerCase(): Bu metot, bir dizedeki tüm karakterleri küçük harfe dönüştürür.

        String kucukHarf = str.toLowerCase();
        System.out.println("kucukHarf = " + kucukHarf); //kucukHarf = merhaba

//        6- indexOf(str): Bu metot, belirtilen bir alt dizenin indeksini döndürür. Eğer alt dize bulunamazsa, -1 döner.

        int indeks = str.indexOf("ha");
        System.out.println("indeks = " + indeks); //indeks = 3

//        7- replace(oldStr, newStr): Bu metot, belirtilen eski bir alt dizeyi yeni bir alt dizeyle değiştirir.
//        Tüm eşleşmeleri değiştirir.

        String yeniDize = str.replace("haba", "Java");
        System.out.println("yeniDize = " + yeniDize); //yeniDize = MerJava

//        8- trim(): Bu metot, bir dizenin başındaki ve sonundaki boşlukları kırpar (silinir)
//        ve kırpmadan sonra yeni bir dize döndürür.

        String kirpilmis = str.trim();
        System.out.println("kirpilmis = " + kirpilmis); //kirpilmis = Merhaba

//        9- contains(str): Bu metot, bir dizenin belirli bir alt dizeyi içerip içermediğini kontrol eder ve
//        true veya false değerini döndürür.

        boolean iceriyorMu = str.contains("Mer");
        System.out.println("iceriyorMu = " + iceriyorMu); //iceriyorMu = true

//        10- equalsIgnoreCase(str): Bu metot, iki dizenin büyük/küçük harf farkını dikkate almadan eşit
//        olup olmadığını kontrol eder ve true veya false değerini döndürür.

        String str1 = "Merhaba";
        String str2 = "merhaba";
        boolean esitMi = str1.equalsIgnoreCase(str2);
        System.out.println("esitMi = " + esitMi); //esitMi = true

//        11- equals(str): Bu metot, bir dizenin başka bir dizeyle eşit olup olmadığını kontrol eder.
//        İki dize aynı karakterleri aynı sırayla içeriyorsa, true değerini döndürür. Büyük/küçük harf duyarlıdır.

        boolean esitMi2 = str1.equals(str2);
        System.out.println("esitMi2 = " + esitMi2); //esitMi2 = false

//        12- replaceAll(regex, replacement): Bu metot, bir dizede belirli bir deseni (regex) arar
//        ve bu desenin tüm eşleşmelerini başka bir dizeyle (replacement) değiştirir.

        String yeniDize2 = str.replaceAll("a", "o");
        System.out.println("yeniDize2 = " + yeniDize2); //yeniDize2 = Merhobo

//        13- lastIndexOf(str): Bu metot, bir dizenin içinde belirli bir alt dizenin en son bulunduğu indeksi döndürür.
//        Eğer alt dize bulunamazsa, -1 döner.

        int indeks2 = str.lastIndexOf("a");
        System.out.println("indeks2 = " + indeks2); //indeks2 = 6


    }
}
