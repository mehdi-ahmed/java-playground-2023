package immutability;

import java.util.HashMap;
import java.util.Map;

public class ImmutabilityMain {

    public static void main(String[] args) {


        // Creating Map object with reference to HashMap
        Map<String, String> map = new HashMap<>();

        // Adding elements to Map object
        // using put() method
        map.put("1", "first");
        map.put("2", "second");

        Student s = new Student("ABC", 101, map);
        System.out.println(s.getName()); // ABC
        System.out.println(s.getRegNo()); // 101
        System.out.println(s.getMetadata()); // {1=first, 2=second}

        // We can't modify anything from the Student class
        //s.regNo = 102;

        // Remains unchanged due to deep copy in constructor
        // lLet's add something in the metadata Map and see if the original object has changed.
        s.getMetadata().put("4", "Fourth");
        // Remains unchanged due to deep copy in getter
        System.out.println(s.getMetadata()); // {1=first, 2=second}

    }
}
