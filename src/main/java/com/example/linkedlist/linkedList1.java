package com.example.linkedlist;

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

    public Node addAtIndex(int index, int data){
        Node temp = head;
        Node node1 = new Node(data);
        if(index > size){
          throw new IndexOutOfBoundsException("out of bound at " +index);
        }else{

            for(int i = 0; i < size; i++){
                if (i == index-1){
                  node1.setNextNode(temp.getNextNode());
                  temp.nextNode = node1;
                }
                    temp = temp.getNextNode();
            }
        }
        return node1;
    }
     public Node addNextAtHead(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            size++;
        }else{
            newNode.setNextNode(head);
            head = newNode;
            size++;
        }
        return newNode;
     }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        Node temp = head;
        while (temp != null) {
            sb.append(temp.data);
            if (temp.getNextNode() != null) {
                sb.append(", ");
            }
            temp = temp.getNextNode();
        }
        sb.append(" ]");
        sb.append("size: " +size +" Node");
        return sb.toString();
    }

    public static void main(String[] args) {
        LinkedList1 link = new LinkedList1();
        link.add(40);
        link.add(20);
        link.add(30);
        link.addNextAtHead(2);
        link.addAtIndex(2,203);
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

