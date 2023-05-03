package com.bridgelabz;
public class SortedLinkedList <T extends Comparable<T>> {

    Node<T> head;
    Node<T> tail;

    public void add(T data) {
        /*
         * New Node is created in the Linked list.so the head and tail is new node.
         * if head is not equal to null, then tail.next will be new node.
         * And tail is New node.
         */
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void display() {
        /*
        Display the linked list
         */
        Node<T> temp = head;
        ;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void sortedList() {
        /*
         * Creates linked list in ascending order:-
         */
        Node<T> temp1 = head;
        Node<T> temp2;
        T temp3;

        if (head != tail) {
            while (temp1 != null) {
                temp2 = temp1.next;
                while (temp2 != null){
                    if ((temp1.data.compareTo(temp2.data))>0) {
                        temp3 = temp1.data;
                        temp1.data = temp2.data;
                        temp2.data = temp3;
                    }
                    temp2 = temp2.next;
                }
                temp1 = temp1.next;
            }
        }
    }
}

