package Ders_04;

public class M_03_DataTypes {
    public static void main(String[] args) {


        // İlkel Veri Tipleri:
        byte myByte=126;
        short myShort=327;
        int myInt=1058;
        long myLong=12042;
        float myFloat= 42.8F;
        double myDouble=8.58;
        char myChar='A';
        boolean myBoolean=true;

        // Referans Veri Tipleri (String ile sınırlı):
        String myText="Merhaba dostlar!",myWeb="https://techno.study/";

        // Ekrana Yazdırma Komutları:
        System.out.println(myText+"\n"+"\nByte Değeri:"+myByte+"\nShort Değeri:"+myShort+
                "\nInteger Değeri:"+myInt+"\nLong Değeri:"+ myLong+"\nFloat Değeri:"+myFloat+
                "\nDouble Değeri:"+myDouble+"\nChar Değeri:"+myChar+"\nBoolean Değeri:"+myBoolean);

        System.out.println("\n"+myWeb);

    }
}
