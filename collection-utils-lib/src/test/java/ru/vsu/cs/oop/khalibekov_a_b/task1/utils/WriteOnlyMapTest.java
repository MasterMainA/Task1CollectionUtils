package ru.vsu.cs.oop.khalibekov_a_b.task1.utils;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class WriteOnlyMapTest {

    @Test
    void testPutOperations() {
        Map<String, Integer> map = new WriteOnlyMap<>();

        // проверка добавления
        assertNull(map.put("key1", 1));

        Map<String, Integer> toPut = new HashMap<>();
        toPut.put("key2", 2);
        toPut.put("key3", 3);
        assertDoesNotThrow(() -> map.putAll(toPut));
    }

    @Test
    void testReadOperationsThrowException() {
        Map<String, Integer> map = new WriteOnlyMap<>();
        map.put("key", 1);

        // read операции бросают исключение
        assertThrows(UnsupportedOperationException.class, () -> map.get("key"));
        assertThrows(UnsupportedOperationException.class, () -> map.size());
        assertThrows(UnsupportedOperationException.class, () -> map.containsKey("key"));
        assertThrows(UnsupportedOperationException.class, () -> map.keySet());
        assertThrows(UnsupportedOperationException.class, () -> map.values());
    }

    @Test
    void testRemoveOperationsThrowException() {
        WriteOnlyMap<String, String> map = new WriteOnlyMap<>();

        // remove(key) бросает исключение
        assertThrows(UnsupportedOperationException.class, () -> {
            map.remove("key1");
        });

        // remove(key, value) бросает исключение
        assertThrows(UnsupportedOperationException.class, () -> {
            map.remove("key1", "value1");
        });
    }
}