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
            return data +
                    " ---> "
                    + next;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int currentSize;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        currentSize = 0;
    }

    @Override
    public void addFirst(T obj) {
        Node<T> newNode = new Node<>(obj);
        if (head == null) {
            head = tail = newNode;
            currentSize++;
            return;
        }
        newNode.next = head; // updates new node's next reference
        head = newNode; // updates new head position
        currentSize++;
    }

    @Override
    public void addLast(T obj) {
        Node<T> newNode = new Node<>(obj);
        if (head == null) {
            head = tail = newNode;
            currentSize++;
            return;
        }
        tail.next = newNode; // updates current tail node next element
        tail = newNode; // updates new tail position
        currentSize++;
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
        StringBuilder sb = new StringBuilder();
        sb.append("currentSize = ");
        sb.append(currentSize);
        sb.append("\n");
        sb.append(head);
        return sb.toString();
    }
}
