package com.faen.linkedlists;

public class LinkedList<T> implements ILinkedList<T> {
    private class Node<T> {
        T data;
        Node<T> next;

        public Node(T obj) {
            this.data = obj;
            next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }

    private Node<T> head;
    private int currentSize;

    public LinkedList() {
        this.head = null;
        currentSize = 0;
    }

    @Override
    public void addFirst(T obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void addLast(T obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T removeFirst() {
        return null;
    }

    @Override
    public T removeLast() {
        return null;
    }

    @Override
    public T remove(T obj) {
        return null;
    }

    @Override
    public T peek() {
        return null;
    }


    @Override
    public String toString() {
        return "LinkedList{" +
                "currentSize=" + currentSize +
                ", head=" + head +
                '}';
    }
}
