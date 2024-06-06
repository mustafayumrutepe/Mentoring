package Ders_09;

public class M_01_WhileDoWhileForLoop {
    public static void main(String[] args) {


        // BLOK 1 WHILE LOOP
        {
            int i = 0;
            while (i < 10) {
                System.out.println(i);
                i++;
            }
        }

        //BLOK 2 DO WHILE
        {
            int i = 0;
            do {
                System.out.println(i);
                i++;
            } while (i < 10);
        }

        // BLOK 3 FOR LOOP
        {
            int i = 0;
            for (i = 0; i < 10; i++) {
                System.out.println(i);
            }
            System.out.println("i = " + i);
        }
    }
}
