package com.mytutorials.java;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ImmutableTest {

    private final List<String> strings = new ArrayList<>();

    @Test
    public void testStringImmutable() {
        String name = "Mehdi Ahmed";
        String newName = name.replace("Mehdi", "Marcus");

        assertEquals("Mehdi Ahmed", name);
        assertEquals("Marcus Ahmed", newName);
    }

    @Test
    public void testList() {
        assertEquals(0, strings.size());
        strings.add("Gotcha");
        // assertEquals(0, strings.size()); fails


        final List<String> immutableList = List.of("I'm the only one String in this list forever");
        //immutableList.add("test"); // Exception: java.lang.UnsupportedOperationException
    }
}
