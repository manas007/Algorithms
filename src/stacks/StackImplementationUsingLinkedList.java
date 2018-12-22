package stacks;

/*
* A stack that stores strings. Stack is last in first out, which means the value that is stored most recently in the stack,
* is the one which comes out first out of the stack. You can implement stack for storing any value (by using genereics, but to simplify the understanding
* , I have used Strings.
* @author Manas Tripathi
* */
public class StackImplementationUsingLinkedList {

    private Node first;

    private class Node {
        String item;
        Node next;
    }

    public StackImplementationUsingLinkedList(){
        first = null;
    }

    public boolean isStackEmpty(){
        return first == null;
    }

    public void push(String newItem){
        Node oldNode = first;  // make a new Node reference called oldNode and make it point to firstNode.
        first = new Node(); // now firstNode should be the new item that is pushed to stack.
        first.item = newItem;
        first.next = oldNode;
    }

    public String pop(){
        String valToPop = first.item;
        first = first.next;  // make first point to the next Node in stack. This will free up the first node to be eligible for Garbage Collection.
        return valToPop;
    }

    public static void main(String[] args){
        StackImplementationUsingLinkedList testObj = new StackImplementationUsingLinkedList();
        testObj.push("a");
        testObj.push("b");
        testObj.push("c");
        testObj.push("d");

        System.out.println(testObj.pop());
        System.out.println(testObj.pop());
        System.out.println(testObj.pop());
        System.out.println(testObj.pop());
        System.out.println("Stack is now empty ? " + testObj.isStackEmpty());

    }

}
