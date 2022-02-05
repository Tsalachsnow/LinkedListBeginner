package com.example.linkedlist.CircularSingularLinkedList;


public class Main {
    public static void main(String[] args) {
        //creation of the first node for a circularSinglyLinkedList
//        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
//        csll.createCSLL(5);
//        System.out.println(csll.head.value);


        //insertion of node in a circularSinglyLinkedList
//        CircularSinglyLinkedList csll1 = new CircularSinglyLinkedList();
//        csll1.createCSLL(2);
//        csll1.insertCSLL(4,1);
//        csll1.insertCSLL(6,2);
//        csll1.insertCSLL(7,8);
//        System.out.println(csll1.head.value);
//        System.out.println(csll1.head.next.value);
//        System.out.println(csll1.head.next.next.value);
//        System.out.println(csll1.tail.value);


        //transverse through a circularSinglyLinkedList
        CircularSinglyLinkedList csll2 = new CircularSinglyLinkedList();
        csll2.createCSLL(5);
        csll2.insertCSLL(4,0);
        csll2.insertCSLL(6,1);
        csll2.insertCSLL(7,8);
        csll2.transverseCSLL();
}
}
