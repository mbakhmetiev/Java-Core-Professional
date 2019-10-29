package Lesson2_1_3v1;

public class Orange extends Fruit {
    public Orange(String name) {
        super(name);
    }

    @Override
    public float getSingleFruitWeight() {
        return 1.5f;
    }
}
