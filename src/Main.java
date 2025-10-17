import Utils.CollectionUtils;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> originalList = Arrays.asList("a", "b", "c", "d");
        Map<Integer, String> originalMap = new HashMap<>();
        originalMap.put(1, "A");
        originalMap.put(2, "B");

        System.out.println("---ReadOnly коллекции---");
        List<String> readOnlyList = CollectionUtils.createReadOnlyList(originalList);
        Map<Integer, String> readOnlyMap = CollectionUtils.createReadOnlyMap(originalMap);

        System.out.println("ReadOnly List: " + readOnlyList);
        System.out.println("ReadOnly Map: " + readOnlyMap);

        try {
            readOnlyList.add("E"); // Будет исключение
        } catch (UnsupportedOperationException e) {
            System.out.println("Ожидаемое исключение при попытке модификации readOnly коллекции");
        }

        try {
            readOnlyMap.containsValue("A");
            System.out.println("Успешно"); // Не будет исключение
        } catch (UnsupportedOperationException e) {
            System.out.println("Ошибка");
        }


        System.out.println("\n---WriteOnly коллекции---");
        List<String> writeOnlyList = CollectionUtils.createWriteOnlyList();

        try {
            writeOnlyList.add("X");
            writeOnlyList.add("Y");
            writeOnlyList.addAll(Arrays.asList("Z", "W"));

            System.out.println("Элементы успешно добавлены в writeOnly коллекцию"); // Не будет исключение
        } catch (UnsupportedOperationException e) {
            System.out.println("Ошибка");
        }

        try {
            writeOnlyList.get(0); // Будет исключение
        } catch (UnsupportedOperationException e) {
            System.out.println("Ожидаемое исключение при попытке чтения witeOnly коллекции");
        }


        System.out.println("\n---Singleton коллекции---");
        Collection<String> singletonCollection = CollectionUtils.createSingletonCollection("SingleCollection");
        List<String> singletonList = CollectionUtils.createSingletonList("SingleList");
        Map<String, Integer> singletonMap = CollectionUtils.createSingletonMap("key", 1);

        System.out.println("Singleton Collection: " + singletonCollection);
        System.out.println("Singleton List: " + singletonList);
        System.out.println("Singleton Map: " + singletonMap);

        System.out.println("\n---Empty коллекции---");
        List<String> emptyList = CollectionUtils.createEmptyList();
        Map<String, Integer> emptyMap = CollectionUtils.createEmptyMap();
        Set<String> emptySet = CollectionUtils.createEmptySet();

        System.out.println("Empty List: " + emptyList);
        System.out.println("Empty Map: " + emptyMap);
        System.out.println("Empty Set: " + emptySet);
        System.out.println("Empty List size: " + emptyList.size());
    }
}