package com.faen.linkedlists;

public class Demo {
    private static void addFirst() {
        LinkedList<Integer> myList = new LinkedList<>();
        myList.addFirst(42);
        System.out.println(myList);
    }

    private static void addLast() {
        LinkedList<Integer> myList = new LinkedList<>();
        myList.addFirst(42);
        myList.addFirst(5);
        myList.addLast(69);
        System.out.println(myList);
    }

    private static void removeFirst() {
        LinkedList<Integer> myList = new LinkedList<>();
        myList.addFirst(42);
        myList.addFirst(5);
        myList.addLast(69);
        System.out.println(myList);
        myList.removeFirst();
        System.out.println(myList);
    }

    public static void main(String[] args) {
        removeFirst();
    }
}
