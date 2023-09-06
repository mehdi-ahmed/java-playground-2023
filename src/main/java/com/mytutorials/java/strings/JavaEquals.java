package com.mytutorials.java.strings;

public class JavaEquals {

    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 5;
        Integer n3 = 5;
        Integer n4 = 5;

        System.out.println(n1 == n2); // false
        System.out.println(n3.equals(n4)); // true

        String string1 = new String("same string");
        String string2 = new String("same string");

        System.out.println(string1 == string2); // false
        System.out.println(string1.equals(string2)); // true

        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1 == s2);       // true
        System.out.println(s1.equals(s2));  // true

        s2 = "Hey";
        System.out.println(s1 == s2);       // false
        System.out.println(s1.equals(s2));  // false

    }
}
