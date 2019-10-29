package Lesson2_1_3v1;

import java.util.ArrayList;

public class Box <T extends Fruit> implements Comparable<Box <T>> {

    private String boxName;
    private ArrayList<T> fruitsInBox = new ArrayList<>();
    private Fruit fruit;

    public Box(String boxName) {
        this.boxName = boxName;
    }

    public String getBoxName() {
        return boxName;
    }

    public void addFruit(T fruit) {
        this.fruitsInBox.add(fruit);
        this.fruit = fruit;
    }

    public float getWeight() {
            return this.fruitsInBox.size() * this.fruit.getSingleFruitWeight();
        }

    @Override
    public int compareTo(Box box) {
        if(this.getWeight() == box.getWeight()) {
            return 1;
        } else return -1;

    }

    public void moveFruits (Box<T> box2) {
        for (int i = 0; i < this.fruitsInBox.size(); i++) {
            box2.fruitsInBox.add(box2.fruitsInBox.get(0));
        }
        this.fruitsInBox.clear();

    }
}

