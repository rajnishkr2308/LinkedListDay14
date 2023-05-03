package com.bridgelabz;
public class LinkedList <T> {

    Node<T> head;
    Node<T> tail;

    public void push(T data) {
        /*
         * New Node is created in the Linked list.so the head and tail is new node.
         * if head is not equal to null, then newNode.next will be head.
         * And head is New node.
         */
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void append(T data) {
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

    public Node<T> search(T searchData) {
        /*
         when temp node is head,and temp is not equal to null then its data equals to search data
         */
        Node<T> temp = head;
        ;
        while (temp != null) {
            if (temp.data.equals(searchData))
                return temp;
            temp = temp.next;
        }
        return null; //when temp = null;
    }

    public boolean insertAfter(T searchData, T insertData) {
        /*
         * After searching the node the new node is inserted next ot it.
         */
        Node<T> newNode = new Node<>(insertData);
        Node<T> searchedNode = search(searchData);
        if (searchedNode != null) {
            newNode.next = searchedNode.next;
            searchedNode.next = newNode;
            return true;
        }
        return false;
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

    public T pop() {
            /*
              Deleting the first Element
            */
        if (head == null)
            return null;
        T popData = head.data;  //first element
        head = head.next;
        return popData;
    }

    public T popLast() {
         /*
           Deleting the Last Element
         */
        if (head == null)
            return null;
        T popLastData = tail.data;  //last element
        Node<T> temp = head;
        while (temp.next != tail) {
            temp = temp.next;      //Second last element is converting to null using while loop
        }
        temp.next = null;
        tail = temp;
        return popLastData;
    }
}

