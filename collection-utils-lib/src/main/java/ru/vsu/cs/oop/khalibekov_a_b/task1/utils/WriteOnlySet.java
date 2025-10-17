package ru.vsu.cs.oop.khalibekov_a_b.task1.utils;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class WriteOnlySet<T> implements Set<T> {
    private final Set<T> delegate = new HashSet<>();

    @Override
    public boolean add(T element) {
        return delegate.add(element);
    }

    @Override
    public boolean addAll(Collection<? extends T> collection) {
        return delegate.addAll(collection);
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Read operation not allowed");
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Read operation not allowed");
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException("Read operation not allowed");
    }

    @Override
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException("Read operation not allowed");
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Read operation not allowed");
    }

    @Override
    public <E> E[] toArray(E[] a) {
        throw new UnsupportedOperationException("Read operation not allowed");
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Remove operation not allowed");
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException("Read operation not allowed");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Remove operation not allowed");
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Remove operation not allowed");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Remove operation not allowed");
    }
}
