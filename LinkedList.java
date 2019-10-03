import java.io.*;
import java.util.*;



public class LinkedList {
    ListElement head;

    static class ListElement {

        private ListElement next;
        private ListElement previous;
        private int data;
    
        public ListElement(){
            this.data = 0;
            this.next = null;
            this.previous = null;
        }
        public ListElement(int Data){
            this.data = Data;
        }

        /**  */
        public void setData(int data) {
            this.data = data;
    
        }
    
        public int getData() {
            return this.data;
        }
        
        public ListElement getNext(){
            return this.next;
        }

        public void setNext(ListElement le){
            this.next = le;
        }

    }

    public static LinkedList addElement(LinkedList list, int data){
        ListElement newElement = new ListElement(data);
        
        if(list.head == null){
            list.head.setNext(newElement);

        }
        else {
            ListElement last;
            last.setNext(list.head);

            while(last.getNext() != null){
                last = list.getNext();

            }

            last.setNext(newElement);           
        }

        return list;

    }

    public static LinkedList getElement(LinedList list, int index){
        assert(list.head == null) : "the list is empty.";
        assert(index == 0) : "index must be greater than 0.";

        int counter = 0;        
        ListElement currentElement = list.head;

        while(currentElement.getNext() != null){
            if(index == temp){
                System.out.println("LinkedList Element at index "+temp+" is : "+currentElement.getData());    
                break;
            }

            counter ++;
            crrentElement = currentElement.getNext();
        }
        

    }

    public static LinkedList deleteElement(int index){
        assert(list.head == null) : "the list is empty.";
        assert(index == 0) : "index must be greater than 0.";

        ListElement current, prev;
        current = list.head;
        prev = null;

        if(index == 0){
            list.head = current.getNext();
            System.out.println(index + " position element deleted.");
            
            return list;
        }

        int counter = 0;

        while(current != null){
            if( counter == index ){
                prev.setNext(current.getNext());

                System.out.println(index + " position element deleted.");
                break;

            } else {
                prev = current;
                current = current.getNext();

                counter++;
            }
        }

        if(current == null){
            System.out.println(index + "position element not found.");

        }

        return list;
    }


    public static void printLinkedListHead(LinkedList list){
        ListElement current = list.head;
        
        Sytem.out.println("The list : ");

        while(current != null){
            System.out.println(current.getData() + " ");
            current = current.getNExt();
        }

        System.out.println(" \n ");
    }
        
}


public static void main(String[] args) {

    ListElement le = new ListElement();
    le.setData(5);

    System.out.println("le has data of " + le.getData + " \n \n \n")
           
    LinkedList list = new LinkedList();     

    list = addElement(list, 3);
    list = addElement(list, 4);
    list = addElement(list, 5);
    list = addElement(list, 6);
    list = addElement(list, 7);
    list = addElement(list, 8);
    list = addElement(list, 9);
    list = addElement(list, 10);
    

    printList(list); 
  
    // 
    // ******DELETION BY KEY****** 
    // 

    // Delete node with value 1 
    // In this case the key is ***at head*** 
    deleteByKey(list, 1); 

    // Print the LinkedList 
    printList(list); 

    // Delete node with value 4 
    // In this case the key is present ***in the middle*** 
    deleteByKey(list, 4); 

    // Print the LinkedList 
    printList(list); 
}