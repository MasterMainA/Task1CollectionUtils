package ru.vsu.cs.oop.khalibekov_a_b.task1.utils;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class WriteOnlyMap<K, V> implements Map<K, V> {
    private final Map<K, V> delegate = new HashMap<>();

    // Write operations - разрешены
    @Override
    public V put(K key, V value) {
        return delegate.put(key, value);
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        delegate.putAll(m);
    }

    // Read operations - запрещены
    @Override
    public int size() {
        throw new UnsupportedOperationException("Read operation not allowed");
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Read operation not allowed");
    }

    @Override
    public boolean containsKey(Object key) {
        throw new UnsupportedOperationException("Read operation not allowed");
    }

    @Override
    public boolean containsValue(Object value) {
        throw new UnsupportedOperationException("Read operation not allowed");
    }

    @Override
    public V get(Object key) {
        throw new UnsupportedOperationException("Read operation not allowed");
    }

    @Override
    public V remove(Object key) {
        throw new UnsupportedOperationException("Remove operation not allowed");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Remove operation not allowed");
    }

    @Override
    public Set<K> keySet() {
        throw new UnsupportedOperationException("Read operation not allowed");
    }

    @Override
    public Collection<V> values() {
        throw new UnsupportedOperationException("Read operation not allowed");
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        throw new UnsupportedOperationException("Read operation not allowed");
    }
}