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
    //deletion of node at the beginning, the last and at any point
    public void deletionNode(int location){
        if(head == null){
            System.out.println("the CSLL does not exist");
            return;
        }else if(location == 0){ //deletion from the beginning if it contains more that one node
            head = head.next;
            tail.next = head;
            size--;
            if(size == 0){ //deletion from the beginning if it contains only one node
                tail = null;
                head = null;
            }
        }else if(location >= size){ //deletion from the end of a circularSinglyLinkedList
            Node tempNode = head;
            for(int i = 0; i<size-1; i++){
                tempNode = tempNode.next;
            }
            if(tempNode == head){ //if it contains only one node
                head.next = null;
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = head; // if it contains more that one node
            tail = tempNode;
            size--;
        }else{ // deletion at any given point
            Node tempNode = head;
            for(int i = 0; i < location; i++){
                tempNode = tempNode.next;
            }
            tempNode.next =tempNode.next.next;
            size--;
        }
    }
    //Delete ALL CSLL
    public void deleteAll(){
        if(head == null){
            System.out.println("the CSLL does not exist");
        }else{
            head = null;
            tail.next = null;
            tail = null;
            System.out.println("the CSLL has been deleted successfully");
        }
    }
}
