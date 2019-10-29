package Lesson2_1_4v1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class SomeClass {

    private int id;
    private String name;

    public SomeClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {

        int[] ids = {1,2,3,4,5,6,7,8};
        String[] names = {"Test1","Test1","Test1","Test2","Test2","Test3","Test3","Test4"};

        List<SomeClass> someClassArr = new ArrayList<>();

        for (int i = 0; i < ids.length ; i++) {
            someClassArr.add(new SomeClass(ids[i], names[i]));
        }

        HashMap<String, ArrayList> someClassHash = new HashMap<>();

        for (SomeClass el : someClassArr) {
            someClassHash.put(el.getName(), new ArrayList());
        }

        for (SomeClass el : someClassArr) {
            someClassHash.get(el.getName()).add(el.getId());
        }

        for (HashMap.Entry<String, ArrayList> entry : someClassHash.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
