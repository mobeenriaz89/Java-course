package com.mobeen;

public class Main {


    public static void main(String[] args) {
        MyLinkedList myList = new MyLinkedList(null);
        myList.traverse(myList.getRoot());
    String stringData = "9 7 6 5 1 3 0 2 4 8";

    String [] data = stringData.split(" ");
    for(String s : data){
        myList.addItem(new Node(s));
    }
    myList.traverse(myList.getRoot());

    myList.removeItem(new Node("3"));
    myList.traverse(myList.getRoot());
    myList.removeItem(new Node("6"));
    myList.traverse(myList.getRoot());
    myList.removeItem(new Node("7"));
    myList.traverse(myList.getRoot());

    myList.removeItem(new Node("4"));
    myList.traverse(myList.getRoot());
    myList.removeItem(new Node("5"));
    myList.traverse(myList.getRoot());
    myList.removeItem(new Node("2"));
    myList.traverse(myList.getRoot());
      myList.removeItem(new Node("1"));
    myList.traverse(myList.getRoot());
      myList.removeItem(new Node("9"));
    myList.traverse(myList.getRoot());
    myList.removeItem(new Node("8"));
    myList.traverse(myList.getRoot());
    myList.removeItem(new Node("0"));
    myList.traverse(myList.getRoot());
    myList.removeItem(new Node("0"));
    myList.traverse(myList.getRoot());

    }


}
