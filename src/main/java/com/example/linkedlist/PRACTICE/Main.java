package com.example.linkedlist.PRACTICE;

public class Main {
    public static void main(String[] args) {
      // creating a head an inserting a node
//  SinglyLinkedList sLL = new SinglyLinkedList();
//  sLL.createSinglyLinkedList(5);
//  System.out.println(sLL.head.value);
//  sLL.insertInLinkedList(6,0);
// // sLL.insertInLinkedList(6,1 );
//  System.out.println(sLL.head.value);
// // System.out.println(sLL.head.next.value);


      // for transverse
      SinglyLinkedList sLL = new SinglyLinkedList();
      sLL.createSinglyLinkedList(5);
      sLL.insertInLinkedList(6, 1);
      sLL.insertInLinkedList(7, 3);
      sLL.insertInLinkedList(8, 4);
      sLL.insertInLinkedList(9, 5);
      sLL.transverseSinglyLinkedList();

    }
}
