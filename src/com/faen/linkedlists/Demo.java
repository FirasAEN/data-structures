package com.faen.linkedlists;

import java.util.stream.IntStream;

public class Demo {
    private static void addFirst() {
        LinkedList<Integer> myList = populate(1);
        System.out.println(myList);
    }

    private static void addLast() {
        LinkedList<Integer> myList = populate(5);
        myList.addLast(69);
        System.out.println(myList);
    }

    private static void removeFirst() {
        LinkedList<Integer> myList = populate(5);
        System.out.println(myList);
        myList.removeFirst();
        System.out.println(myList);
    }

    private static void removeLast() {
        LinkedList<Integer> myList = populate(50);
        System.out.println(myList);
        myList.removeLast();
        System.out.println(myList);
    }

    private static void remove() {
        LinkedList<Integer> myList = new LinkedList<>();
        myList.addLast(1);
        myList.addLast(2);
        myList.addLast(3);
        myList.addLast(4);
        myList.addLast(5);
        System.out.println(myList);
        myList.remove(1);
        System.out.println(myList);
        myList.remove(5);
        System.out.println(myList);
        myList.remove(3);
        System.out.println(myList);
    }

    private static LinkedList<Integer> populate(int numberOfNodes) {
        LinkedList<Integer> myList = new LinkedList<>();
        IntStream.range(0, numberOfNodes)
                .forEach(num -> myList.addFirst(generateRandom()));
        return myList;
    }

    public static int generateRandom() {
        int max = 100;
        int min = 5;
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }

    public static void main(String[] args) {
        remove();
    }
}
