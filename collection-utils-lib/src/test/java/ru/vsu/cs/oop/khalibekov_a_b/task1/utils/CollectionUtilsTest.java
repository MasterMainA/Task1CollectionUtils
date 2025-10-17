package ru.vsu.cs.oop.khalibekov_a_b.task1.utils;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class CollectionUtilsTest {

    @Test
    void testCreateReadOnlyList() {
        List<String> original = Arrays.asList("a", "b", "c");
        List<String> readOnly = CollectionUtils.createReadOnlyList(original);

        // можно читать
        assertEquals(3, readOnly.size());
        assertEquals("a", readOnly.get(0));

        // нельзя модифицировать
        assertThrows(UnsupportedOperationException.class, () -> readOnly.add("d"));
        assertThrows(UnsupportedOperationException.class, () -> readOnly.remove(0));
    }

    @Test
    void testCreateReadOnlyMap() {
        Map<String, Integer> original = new HashMap<>();
        original.put("key1", 1);
        original.put("key2", 2);

        Map<String, Integer> readOnly = CollectionUtils.createReadOnlyMap(original);

        // чтение
        assertEquals(2, readOnly.size());
        assertEquals(1, readOnly.get("key1"));

        // нельзя модифицировать
        assertThrows(UnsupportedOperationException.class, () -> readOnly.put("key3", 3));
    }

    @Test
    void testCreateWriteOnlyList() {
        List<String> writeOnly = CollectionUtils.createWriteOnlyList();

        // можно добавлять
        assertDoesNotThrow(() -> writeOnly.add("test"));
        assertDoesNotThrow(() -> writeOnly.addAll(Arrays.asList("a", "b")));

        // нельзя читать
        assertThrows(UnsupportedOperationException.class, () -> writeOnly.get(0));
        assertThrows(UnsupportedOperationException.class, () -> writeOnly.size());
        assertThrows(UnsupportedOperationException.class, () -> writeOnly.isEmpty());
    }

    @Test
    void testCreateSingletonCollection() {
        Collection<String> singleton = CollectionUtils.createSingletonCollection("unique");

        assertEquals(1, singleton.size());
        assertTrue(singleton.contains("unique"));
        assertThrows(UnsupportedOperationException.class, () -> singleton.add("another"));
    }

    @Test
    void testCreateEmptyList() {
        List<String> empty = CollectionUtils.createEmptyList();

        assertTrue(empty.isEmpty());
        assertEquals(0, empty.size());
        assertThrows(UnsupportedOperationException.class, () -> empty.add("element"));
    }
}