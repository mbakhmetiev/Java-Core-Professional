package Lesson2_1_3v1;

public class Apple extends Fruit {
    public Apple(String name) {
        super(name);
    }

    @Override
    public float getSingleFruitWeight() {
        return 1.0f;
    }
}
