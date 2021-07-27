package com.bridgelabz.linkedlist;

public class MyLinkedList <K>{
    public static INode head;
    public static INode tail;
    public K key;


    public MyLinkedList() {
        this.head=null;
        this.tail=null;
    }
    public void add(INode newNode) {
        if(this.tail==null) {
            tail = newNode;
        }
        if(this.head==null){
            this.head=newNode;
        }else {
            INode tempNode=this.head;
            this.head=newNode;
            this.head.setNext(tempNode);
        }
    }

    public void printStack() {
        StringBuffer myNodes=new StringBuffer("MyNodes:");
        INode tempNode=head;
        while (tempNode.getNext()!=null){
            myNodes.append(tempNode.getKey());
            if(tempNode.equals(tail)) myNodes.append("->");
            tempNode=tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }
}