package com.faen.linkedlists;

public interface ILinkedList<T> {
    void addFirst(T obj);

    void addLast(T obj);

    T removeFirst();

    T removeLast();

    T remove(T obj);

    T peek();
}
