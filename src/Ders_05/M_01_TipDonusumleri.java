package Ders_05;

public class M_01_TipDonusumleri {

    public static void main(String[] args) {

//        Tip dönüşümleri, bir veri tipinin başka bir veri tipine dönüştürülmesini sağlar.
//        İşte Java'da tip dönüşümleriyle ilgili bazı örnekler:
//
//        1- Otomatik (Implicit) Tip Dönüşümü:
//        Bu tip dönüşümler Java tarafından otomatik olarak gerçekleştirilir.
//        Küçük boyuttaki bir veri tipi, büyük boyuttaki bir veri tipine atanırken otomatik olarak dönüştürülür.

        int sayi1 = 5;
        double yeniSayi1 = sayi1;
        System.out.println("yeniSayi = " + yeniSayi1);

//        Burada int veri tipindeki sayi değişkeni, double veri tipindeki yeniSayi değişkenine
//        otomatik olarak dönüştürülür. Bu, daha büyük veri tipinin daha küçük bir veri tipine
//        zarar vermeden değeri tutabileceği anlamına gelir.

        /********************************************************************************************************/

//        2- Şekil Dönüşümü (Casting):
//        Şekil dönüşümü, bir veri tipini başka bir veri tipine dönüştürmek için kullanılır.
//        Ancak bu dönüşüm, bazı veri kaybına neden olabilir. Şekil dönüşümü açıkça ifade edilmelidir.

        double sayi2 = 3.14;
        int yeniSayi2 = (int) sayi2;
        System.out.println("yeniSayi = " + yeniSayi2);

//        Burada double veri tipindeki sayi değişkeni, int veri tipindeki yeniSayi değişkenine dönüştürülür.
//        Ancak, ondalık kısmın kesilmesi nedeniyle veri kaybı yaşanır.

        /********************************************************************************************************/

//        3- String Dönüşümü:
//        String dönüşümü, bir sayısal değeri veya başka bir veri tipini String veri tipine dönüştürmek için kullanılır.
//        Bunun için toString() yöntemi veya String sınıfının diğer yöntemleri kullanılabilir.

        int sayi3 = 42;
        String sayiString1 = Integer.toString(sayi3);
        System.out.println("sayiString = " + sayiString1);

//        Burada int veri tipindeki sayi değişkeni, toString() yöntemi kullanılarak
//        String veri tipindeki sayiString değişkenine dönüştürülür.

        /********************************************************************************************************/

//        4- Java'da bir String'i sayısal bir veri türüne dönüştürmek için çeşitli yöntemler bulunmaktadır.
//        parseInt();
//        parseDouble();
//        parseLong();
//        parseFloat();

        String sayiString2 = "123456789";
        long sayi4 = Long.parseLong(sayiString2);
        System.out.println("sayi4 = " + sayi4);
//        Bu yöntemler sayesinde, bir String değerini ilgili sayısal veri türüne dönüştürebilirsiniz.
//        Ancak dönüşüm sırasında dikkatli olmanız ve String'in geçerli bir sayısal değer içerdiğinden
//        emin olmanız önemlidir, aksi takdirde hata alabilirsiniz.

        /********************************************************************************************************/

//        Bu örnekler, Java'da tip dönüşümleriyle ilgili temel kavramları ve kullanımı göstermektedir.
//        Tip dönüşümleri, veri tiplerini dönüştürmek ve uygun türde işlemler yapabilmek için önemli bir araçtır.
    }
}
