package com.example.linkedlist.CircularSingularLinkedList;

import com.example.linkedlist.SinglyLinkedList.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        //creation of the first node for a circularSinglyLinkedList
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.createCSLL(5);
        System.out.println(csll.head.value);
        System.out.println(csll.head.next.value);
}
}
