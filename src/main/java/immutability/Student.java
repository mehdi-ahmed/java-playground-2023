package immutability;

import java.util.HashMap;
import java.util.Map;

final class Student {

    private final String name;
    private final int regNo;
    private final Map<String, String> metadata;


    // A parameterized constructor should initialize all the fields performing a deep copy so that data members
    // can’t be modified with an object reference.
    public Student(String name, int regNo, Map<String, String> metadata) {
        this.name = name;
        this.regNo = regNo;

        // We have a Map here. It's an Object.
        // Deep Copy is needed here in order to return a copy rather than returning
        // the actual object reference.

        Map<String, String> tempMap = new HashMap<>();

        // Iterating using for-each loop
        for (Map.Entry<String, String> entry : metadata.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        this.metadata = tempMap;
    }


    public String getName() {
        return name;
    }

    public int getRegNo() {
        return regNo;
    }

    // Deep Copy of objects should be performed in the getter methods to return a copy rather than returning
    // the actual object reference.
    public Map<String, String> getMetadata() {
        Map<String, String> tempMap = new HashMap<>();

        // Iterating using for-each loop
        for (Map.Entry<String, String> entry : metadata.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        return tempMap;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", regNo=" + regNo +
                ", metadata=" + metadata +
                '}';
    }
}
