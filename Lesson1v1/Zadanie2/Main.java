/*
    Написать метод, который преобразует массив в ArrayList;
 */

package Lesson2_1_2v1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] arrString = {"Mary", "had", "a", "litte", "lamb"};
        // Доказательство, что это теперь ArrayList, т.к. доступен метод .size()
        System.out.println("ArrayList<String>.size(): " +  convert(arrString).size());

        // Доказательство, что это теперь ArrayList, т.к. доступен метод .size()
        Integer[] arrInt = {1,2,3,4,5, 6, 7};
        System.out.println("ArrayList<int>.size(): " + convert(arrInt).size());
    }

    public static <T> ArrayList<T>  convert(T[] arr1 ){
        return new ArrayList<T>(Arrays.asList(arr1));
    }
}
