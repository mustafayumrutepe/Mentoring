package Ders_11;

import java.util.Arrays;

public class M_01_2DArrays {
    public static void main(String[] args) {
        int[][] farkliBoyutlar=new int[2][];
        farkliBoyutlar[0]=new int[3];
        farkliBoyutlar[1]=new int[6];

        for (int i = 0; i < farkliBoyutlar.length; i++) {
            for (int j = 0; j < farkliBoyutlar[i].length; j++) {
                farkliBoyutlar[i][j]=(int)(Math.random()*(100+1));
            }
        }

        for (int i = 0; i < farkliBoyutlar.length; i++) {
            for (int j = 0; j < farkliBoyutlar[i].length; j++) {
                System.out.print(farkliBoyutlar[i][j]+" ");
            }
            System.out.println();
        }
    }
}
