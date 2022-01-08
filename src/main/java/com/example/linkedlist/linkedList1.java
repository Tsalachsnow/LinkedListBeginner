package com.example.linkedlist;

import java.util.LinkedList;
import lombok.Data;

@Data
class LinkedList1 {
    private Node head;
    private Node tail;
    int size;
    private Node currentNode;

    public Node add(int data){
        Node node = new Node(data);
        if(this.getHead() == null){
            head = node;
            tail = node;
            size++;
        }else{
            Node foo = tail;
           foo.setNextNode(node);
           tail = node;
           size++;
        }
        return node;
    }

    public static void main(String[] args) {
        LinkedList1 link = new LinkedList1();
        link.add(40);
        link.add(20);
        link.add(30);
        System.out.println(link.getHead().getData());
        System.out.println(link);
    }

    @Data
    class Node{
        private Integer data;
        private Node nextNode;

        public Node(Integer data) {
            this.data = data;
        }

    }


}

