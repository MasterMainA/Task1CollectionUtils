package Utils;

import java.util.*;

public class CollectionUtils {

    // Read only
    public static <T> Collection<T> createReadOnlyCollection(Collection<T> source) {
        return Collections.unmodifiableCollection(new ArrayList<>(source));
    }

    public static <T> List<T> createReadOnlyList(List<T> source) {
        return Collections.unmodifiableList(new ArrayList<>(source));
    }

    public static <K, V> Map<K, V> createReadOnlyMap(Map<K, V> source) {
        return Collections.unmodifiableMap(new HashMap<>(source));
    }

    public static <T> Set<T> createReadOnlySet(Set<T> source) {
        return Collections.unmodifiableSet(new HashSet<>(source));
    }

    // Write only
    public static <T> Collection<T> createWriteOnlyCollection() {
        return new WriteOnlyCollection<>();
    }

    public static <T> List<T> createWriteOnlyList() {
        return new WriteOnlyList<>();
    }

    public static <K, V> Map<K, V> createWriteOnlyMap(Map<K, V> source) {
        return new WriteOnlyMap<>();
    }

    public static <T> Set<T> createWriteOnlySet(Set<T> source) {
        return new WriteOnlySet<>();
    }

    // Singleton
    public static <T> Collection<T> createSingletonCollection(T element) {
        return Collections.singleton(element);
    }

    public static <T> List<T> createSingletonList(T element) {
        return Collections.singletonList(element);
    }

    public static <K, V> Map<K, V> createSingletonMap(K key, V value) {
        return Collections.singletonMap(key, value);
    }

    public static <T> Set<T> createSingletonSet(T element) {
        return Collections.singleton(element);
    }

    // Empty
    public static <T> Collection<T> createEmptyCollection() {
        return Collections.emptyList();
    }

    public static <T> List<T> createEmptyList() {
        return Collections.emptyList();
    }

    public static <K, V> Map<K, V> createEmptyMap() {
        return Collections.emptyMap();
    }

    public static <T> Set<T> createEmptySet() {
        return Collections.emptySet();
    }
}