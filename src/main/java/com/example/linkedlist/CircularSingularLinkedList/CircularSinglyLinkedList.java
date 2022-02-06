package com.example.linkedlist.CircularSingularLinkedList;

public class CircularSinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createCSLL(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }
    // insertion in a CircularSinglyLinkedList any the beginning, at any poin and at the last position
    public void insertCSLL(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;
        if(head == null){
            createCSLL(nodeValue);
            return;
        }else if(location == 0){ //insertion at the beginning
            node.next = head;
            head = node;
            tail.next = head;
        }else if(location >= size){ //isertion at the end
            tail.next = node;
            tail = node;
            tail.next = head;
        }else{ //insertion at any point
           Node tempNode = head;
           int index = 0;
           while(index < location - 1){
               tempNode = tempNode.next;
               index++;
           }
           node.next = tempNode.next;
           tempNode.next = node;
        }
        size++;
    }
    //transversal method
    public void transverseCSLL(){
        if(head != null){
            Node tempNode = head;
            for(int i = 0; i < size; i++){
                System.out.println(tempNode.value);
                if ((i != size - 1)) {
                    System.out.println("->");
                }
                tempNode = tempNode.next;
                }
            }else{
            System.out.println("\n CSLL does not exist");
        }
    }
    //serching for a node value in a circularSinglyLinkedList
    public boolean searchNode(int nodeValue){
        if(head != null){
            Node tempNode = head;
            for(int i = 0; i < size; i++){
                if(tempNode.value == nodeValue){
                    System.out.println("found node at location: " +i);
                    return true;
                }
                tempNode =tempNode.next;
            }
        }
        System.out.println("node not found ");
        return false;
    }
}
