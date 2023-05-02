package com.bridgelabz;
    public class LinkedListMain {
        public static void main(String[] args) {
            System.out.println("Welcome to LinkedList");
        /*
         UC1: Simple Linked list of 56,30,70.
         */
            LinkedList<Integer> linkedList = new LinkedList<>();
            linkedList.push(56);
            linkedList.push(30);
            linkedList.push(70);
            linkedList.display();

             /*
         UC2: Simple Linked list by pushing 70,30,56.
         */
            LinkedList<Integer> linkedList1 = new LinkedList<>();
            linkedList1.push(70);
            linkedList1.push(30);
            linkedList1.push(56);
            linkedList1.display();
        }
    }
