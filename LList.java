package com.company;

public class LList {
        public String bookName;
        public int millionsSold;
        public Link next;
        public Link(String bookName, int millionsSold){
            this.bookName = bookName;
            this.millionsSold = millionsSold;
        }
        public void display(){
            System.out.println(bookName + ": " + millionsSold + ",000,000 Sold");

        }
        public String toString(){
            return bookName;
        }
        public static void main(String[] args) {
            LinkList theLinkedList = new LinkList();
            theLinkedList.insertFirstLink("Don Quixote", 500);
            theLinkedList.insertFirstLink("A Tale of Two Cities", 200);
            theLinkedList.insertFirstLink("The Lord of the Rings", 150);
            theLinkedList.insertFirstLink("Harry Potter and the Sorcerer's Stone", 107);

            theLinkedList.display();
            System.out.println("Value of first in LinkedList " + theLinkedList.firstLink + "\n");

            theLinkedList.removeFirst();
            theLinkedList.display();
            System.out.println(theLinkedList.find("The Lord of the Rings").bookName + " Was Found");

            theLinkedList.removeLink("A Tale of Two Cities");
            System.out.println("\nA Tale of Two Cities Removed\n");
            theLinkedList.display();
        }
    }
