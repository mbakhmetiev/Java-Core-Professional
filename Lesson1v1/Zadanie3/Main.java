/*
    Есть классы Fruit -> Apple, Orange (больше фруктов не надо);
    Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
    поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
    Для хранения фруктов внутри коробки можно использовать ArrayList;
    Сделать метод getWeight(), который высчитывает вес коробки, зная количество фруктов и вес
    одного фрукта (вес яблока – 1.0f, апельсина – 1.5f. Не важно, в каких это единицах);
    Внутри класса Коробка сделать метод compare, который позволяет сравнить текущую коробку с той,
    которую подадут в compare в качестве параметра, true – если она равны по весу,
    false – в противном случае (коробки с яблоками мы можем сравнивать с коробками с апельсинами);
    Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую (помним про сортировку фруктов:
    нельзя яблоки высыпать в коробку с апельсинами). Соответственно, в текущей коробке фруктов не остается,
    а в другую перекидываются объекты, которые были в этой коробке;
    Не забываем про метод добавления фрукта в коробку.
 */

package Lesson2_1_3v1;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        // Коробки для яблок -> "Имя ящика" : кол-во яблок
        Box<Apple> appleBox1 = new Box<>("Apple Box 1");
        Box<Apple> appleBox2 = new Box<>("Apple Box 2");
        Box<Apple> appleBox3 = new Box<>("Apple Box 3");

        HashMap<Box<Apple>, Integer> appleBoxes = new HashMap<>();
        appleBoxes.put(appleBox1, 15);
        appleBoxes.put(appleBox2, 20);
        appleBoxes.put(appleBox3, 30);


        // Коробки для апельсинов -> "Имя ящика" : кол-во апельсинов
        Box<Orange> orangeBox1 = new Box<>("Orange Box 1");
        Box<Orange> orangeBox2 = new Box<>("Orange Box 2");

        HashMap<Box<Orange>, Integer> orangeBoxes = new HashMap<>();
        orangeBoxes.put(orangeBox1, 10);
        orangeBoxes.put(orangeBox2, 23);

        for (HashMap.Entry<Box<Apple>, Integer> entry : appleBoxes.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                entry.getKey().addFruit(new Apple("apple"));
            }
        }

        for (Box<Apple> key : appleBoxes.keySet()) {
            System.out.print("Вес ящика " + key.getBoxName() + ": ");
            System.out.println(key.getWeight());
        }

        for (HashMap.Entry<Box<Orange>, Integer> entry : orangeBoxes.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                entry.getKey().addFruit(new Orange("orange"));
            }
        }
        for (Box<Orange> key : orangeBoxes.keySet()) {
            System.out.print("Вес ящика " + key.getBoxName() + ": ");
            System.out.println(key.getWeight());
        }

        System.out.println(appleBox1.getBoxName() + " = " + orangeBox1.getBoxName() + ": " +(appleBox1.compareTo(orangeBox1) == 1 ? "True" : "False"));
        System.out.println(orangeBox2.getBoxName() + " = " + appleBox2.getBoxName() + ": " +(orangeBox2.compareTo(appleBox2) == 1 ? "True" : "False"));

        appleBox1.moveFruits(appleBox3);

        System.out.println("Вес ящиков после пересыпания яблок:");
        System.out.println(appleBox1.getBoxName() + ": " + appleBox1.getWeight());
        System.out.println(appleBox3.getBoxName() + ": " + appleBox3.getWeight());

        orangeBox1.moveFruits(orangeBox2);

        System.out.println("Вес ящиков после пересыпания апельсинов:");
        System.out.println(orangeBox1.getBoxName() + ": " + orangeBox1.getWeight());
        System.out.println(orangeBox2.getBoxName() + ": " + orangeBox2.getWeight());
    }
}
