package ru.vsu.cs.oop.khalibekov_a_b.task1.utils;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WriteOnlyListTest {

    @Test
    void testAddOperations() {
        List<String> list = new WriteOnlyList<>();

        // проверка добавления
        assertTrue(list.add("element"));
        assertDoesNotThrow(() -> list.add(0, "first"));
        assertTrue(list.addAll(Arrays.asList("x", "y")));
        assertTrue(list.addAll(0, Arrays.asList("a", "b")));
    }

    @Test
    void testReadOperationsThrowException() {
        List<String> list = new WriteOnlyList<>();
        list.add("test");

        // read операции бросают исключение
        assertThrows(UnsupportedOperationException.class, () -> list.get(0));
        assertThrows(UnsupportedOperationException.class, () -> list.size());
        assertThrows(UnsupportedOperationException.class, () -> list.indexOf("test"));
        assertThrows(UnsupportedOperationException.class, () -> list.listIterator());
    }

    @Test
    void testRemoveOperationsThrowException() {
        List<String> list = new WriteOnlyList<>();
        list.add("test");

        // remove операции бросают исключение
        assertThrows(UnsupportedOperationException.class, () -> list.remove(0));
        assertThrows(UnsupportedOperationException.class, () -> list.remove("test"));
        assertThrows(UnsupportedOperationException.class, () -> list.set(0, "new"));
    }
}