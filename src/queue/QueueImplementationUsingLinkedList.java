package queue;

public class QueueImplementationUsingLinkedList {

    private Node firstEntry;
    private Node lastEntry;

    private class Node{
        Node next;
        String item;
    }

    private boolean isEmpty(){
        return firstEntry == null;
    }

    public void enqueue(String item){ // enqueue means putting the element to last of the queue
        Node oldLastNode = lastEntry;
        lastEntry = new Node();
        lastEntry.item = item;
        lastEntry.next = null;
        if(isEmpty()) firstEntry = lastEntry;
        else oldLastNode.next = lastEntry;
    }

    public String dequeue(){ // take out the first item and return
        String item = firstEntry.item;
        firstEntry = firstEntry.next;
        if(isEmpty()) lastEntry = null;
        return item;
    }

    public static void main(String[] args){
        QueueImplementationUsingLinkedList testObj = new QueueImplementationUsingLinkedList();
        testObj.enqueue("a");
        testObj.enqueue("b");
        testObj.enqueue("c");
        testObj.enqueue("d");

        System.out.println(testObj.dequeue());
        System.out.println(testObj.dequeue());
        System.out.println(testObj.dequeue());
        System.out.println(testObj.dequeue());
        System.out.println("Stack is now empty ? " + testObj.isEmpty());

    }

}
