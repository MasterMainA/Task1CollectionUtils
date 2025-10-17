package ru.vsu.cs.oop.khalibekov_a_b.task1.utils;

import java.util.*;
import java.util.function.UnaryOperator;

class WriteOnlyList<T> implements List<T> {
    private final List<T> delegate = new ArrayList<>();

    @Override
    public boolean add(T element) {
        return delegate.add(element);
    }

    @Override
    public void add(int index, T element) {
        delegate.add(index, element);
    }

    @Override
    public boolean addAll(Collection<? extends T> collection) {
        return delegate.addAll(collection);
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> collection) {
        return delegate.addAll(index, collection);
    }

    @Override
    public T get(int index) {
        throw new UnsupportedOperationException("Read operation not allowed");
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

    @Override
    public T set(int index, T element) {
        throw new UnsupportedOperationException("Read/Modify operation not allowed");
    }

    @Override
    public T remove(int index) {
        throw new UnsupportedOperationException("Remove operation not allowed");
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException("Read operation not allowed");
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("Read operation not allowed");
    }

    @Override
    public ListIterator<T> listIterator() {
        throw new UnsupportedOperationException("Read operation not allowed");
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        throw new UnsupportedOperationException("Read operation not allowed");
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Read operation not allowed");
    }

    @Override
    public void replaceAll(UnaryOperator<T> operator) {
        throw new UnsupportedOperationException("Read/Modify operation not allowed");
    }

    @Override
    public void sort(Comparator<? super T> c) {
        throw new UnsupportedOperationException("Read/Modify operation not allowed");
    }
}
