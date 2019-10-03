import java.io.*;
import ListElement.ListElement;

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
    
        /**  */
        public void setData(int data) {
            this.data = data;
    
        }
    
        public int getData() {
            return this.data;
        }
        
        public void setNext(ListElement le){
            this.next = le;
        }

        public void setPrivious(ListElement le){
            this.previous = le;
        }
    }
        
}

ListElement le = new ListElement();
le.setData(5);


public static void main(String[] args) {
           
   

}