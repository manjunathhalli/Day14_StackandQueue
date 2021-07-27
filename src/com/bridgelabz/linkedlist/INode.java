package com.bridgelabz.linkedlist;

public interface INode <K>{
    K getKey();
    void setKey(K key);

    INode getNext();
    void setNext(INode next);

    void push(INode myNode);
    void printstack();
    INode peak();
    INode pop();
    int size();
    void emptyingTheStack();
    boolean IsEmpty();

    void enqueue(INode myNode);
    INode checkQueue();
    boolean isEmpty();
    void deQueue();
}