package Lesson2_1_3v1;

public abstract class Fruit {
    private String name;

    public Fruit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract float getSingleFruitWeight ();
}
