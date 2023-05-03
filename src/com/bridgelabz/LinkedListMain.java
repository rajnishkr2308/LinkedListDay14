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

             /*
         UC3: Simple Linked list by Appending 30 and 70 to 56.
         */
            LinkedList<Integer> linkedList2 = new LinkedList<>();
            linkedList2.append(56);
            linkedList2.append(30);
            linkedList2.append(70);
            linkedList2.display();

            /*
         UC4: Linked list Inserting the element 30.
         */
            LinkedList<Integer> linkedList3 = new LinkedList<>();
            linkedList3.append(56);
            linkedList3.append(70);
            linkedList3.display();

            boolean isInserted = linkedList3.insertAfter(56,30);
            if (isInserted)
                System.out.println("Element 30 is Inserted");
            else
                System.out.println("Element is NOt inserted");
            linkedList3.display();
            linkedList3.display();
            System.out.println("-------------------------------------");

            /*
         UC5: Linked list PopMethod to delete the first element.
         */
            linkedList3.display();
            Integer poppedData = linkedList3.pop();
            if (poppedData == null)
                System.out.println("LinkedList is Empty");
            else
                System.out.println("The Element popped is "+poppedData);
            linkedList3.display();
            System.out.println("-------------------------------------");
        }
    }
