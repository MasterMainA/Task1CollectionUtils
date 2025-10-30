package ru.vsu.cs.oop.khalibekov_a_b.task1.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class WriteOnlyCollection<T> implements Collection<T> {
    private final Collection<T> writeOnlyCollection = new ArrayList<>();

    @Override
    public boolean add(T element) {
        return writeOnlyCollection.add(element);
    }

    @Override
    public boolean addAll(Collection<? extends T> collection) {
        return writeOnlyCollection.addAll(collection);
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