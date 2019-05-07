package com.java.feature.javafeature.practice.codility;

public class CustomLikedList {
    public static void main(String[] args){
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.add(4);
        singlyLinkedList.add(5);
        singlyLinkedList.add(7);
        singlyLinkedList.add(9);
        singlyLinkedList.add(1);
        singlyLinkedList.displaySinglyLinkedList();
    }
}

class SinglyLinkedList{
    class Node{
        int data;
        Node next;

        public void displayNodeData(){
            System.out.println("{ "+data+" }");
        }
    }
    Node head;
    public void add(int data){
     Node node = new Node();
     node.data = data;
     node.next = head;
     head = node;
    }
    public void delete(){

    }
    public void displaySinglyLinkedList(){
        Node current = head;
        while (current != null) {
            current.displayNodeData();
            current = current.next;
        }
        System.out.println();
    }

}
