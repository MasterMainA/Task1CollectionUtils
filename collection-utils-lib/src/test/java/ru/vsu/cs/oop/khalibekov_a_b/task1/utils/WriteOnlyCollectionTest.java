package ru.vsu.cs.oop.khalibekov_a_b.task1.utils;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class WriteOnlyCollectionTest {

    @Test
    void testAddOperation() {
        Collection<String> collection = new WriteOnlyCollection<>();

        // проверка добавления
        assertTrue(collection.add("element1"));
        assertTrue(collection.add("element2"));
    }

    @Test
    void testAddAllOperation() {
        Collection<String> collection = new WriteOnlyCollection<>();
        Collection<String> toAdd = Arrays.asList("a", "b", "c");

        assertTrue(collection.addAll(toAdd));
    }

    @Test
    void testReadOperationsThrowException() {
        Collection<String> collection = new WriteOnlyCollection<>();
        collection.add("test");

        // read операции бросают исключение
        assertThrows(UnsupportedOperationException.class, () -> collection.size());
        assertThrows(UnsupportedOperationException.class, () -> collection.isEmpty());
        assertThrows(UnsupportedOperationException.class, () -> collection.contains("test"));
        assertThrows(UnsupportedOperationException.class, () -> collection.iterator());
        assertThrows(UnsupportedOperationException.class, () -> collection.toArray());
    }

    @Test
    void testRemoveOperationsThrowException() {
        Collection<String> collection = new WriteOnlyCollection<>();
        collection.add("test");

        // remove операции бросают исключение
        assertThrows(UnsupportedOperationException.class, () -> collection.remove("test"));
        assertThrows(UnsupportedOperationException.class, () -> collection.clear());
    }
}