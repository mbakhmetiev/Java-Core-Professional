/*
        Написать метод, который меняет два элемента массива местами
        (массив может быть любого ссылочного типа);
*/

package Lesson2_1_1v1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] arrString = {"Mary", "had", "a", "litte", "lamb"};
        System.out.println("Исходный sring массив и замена:");
        System.out.println(Arrays.toString(arrString));
        System.out.println(Arrays.toString(swapElements(arrString , 0,2)));

        Integer[] arrInt = {1,2,3,4,5};
        System.out.println("Исходный int массив и замена:");
        System.out.println(Arrays.toString(arrInt));
        System.out.println(Arrays.toString(swapElements(arrInt , 0,arrInt.length-1)));
    }

    public static <T> T[] swapElements(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }


}
