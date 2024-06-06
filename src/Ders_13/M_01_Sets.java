package Ders_13;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.HashSet;
import java.util.Set;

public class M_01_Sets {
    public static void main(String[] args) {
        // Verilen bir dizideki tekrarlanan sayıları bulan  ve bu sayıları bir set kullanarak
        // döndüren bir metod yazın

        int[] numbers={1,4,5,66,34,6,76,1,3,4,66,5};
        Set<Integer> duplicate = findDuplicate(numbers);
        System.out.println(duplicate);
    }

    public static Set<Integer> findDuplicate(int[] numbers){
        Set<Integer> duplicate=new HashSet<>();
        Set<Integer> uniqueElements=new HashSet<>();
        for (int num:numbers){
            if (!uniqueElements.add(num))              //TODO Burası önemli. Bu satıra tekrar bak incele
                duplicate.add(num);
        }
        return duplicate;
    }


}
