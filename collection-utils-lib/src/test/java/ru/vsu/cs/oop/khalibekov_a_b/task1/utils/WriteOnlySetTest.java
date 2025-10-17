package ru.vsu.cs.oop.khalibekov_a_b.task1.utils;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class WriteOnlySetTest {

    @Test
    void testAddOperations() {
        Set<String> set = new WriteOnlySet<>();

        assertTrue(set.add("element"));
        assertTrue(set.addAll(Arrays.asList("a", "b", "c")));
    }

    @Test
    void testReadOperationsThrowException() {
        Set<String> set = new WriteOnlySet<>();
        set.add("test");

        assertThrows(UnsupportedOperationException.class, () -> set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.contains("test"));
        assertThrows(UnsupportedOperationException.class, () -> set.iterator());
    }

    @Test
    void testRemoveOperationsThrowException() {
        WriteOnlySet<String> set = new WriteOnlySet<>();

        // remove(object) бросает исключение
        assertThrows(UnsupportedOperationException.class, () -> set.remove("element1"));

        // removeAll бросает исключение
        assertThrows(UnsupportedOperationException.class, () -> set.removeAll(Arrays.asList("element1", "element2")));

        // clear бросает исключение
        assertThrows(UnsupportedOperationException.class, () -> set.clear());
    }
}