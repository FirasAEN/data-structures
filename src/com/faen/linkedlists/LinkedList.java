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
        if (head == null) {
            return null;
        }
        T temp = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
        currentSize--;
        return temp;
    }

    @Override
    public T removeLast() {
        if (head == null) {
            return null;
        }
        if (head == tail) {
            return removeFirst();
        }
        Node<T> current = head;
        Node<T> previous = null;
        while (current.next != null) { // if current.next == null <=> current == tail
            previous = current;
            current = current.next;
        }
        tail = previous;
        tail.next = null;
        currentSize--;
        return current.data;
    }

    @Override
    public T remove(T obj) {
        Node<T> current = head, previous = null;
        while (current != null) {
            if (((Comparable<T>) obj).compareTo(current.data) == 0) {
                if (current == head) {
                    return removeFirst();
                }
                if (current == tail) {
                    return removeLast();
                }
                previous.next = current.next;
                currentSize--;
                return current.data;
            }
            previous = current;
            current = current.next;
        }
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
