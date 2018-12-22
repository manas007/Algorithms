package stacks;

public class StackImplementationUsingArray {

    private String[] arr;
    private int N = 0;

    public StackImplementationUsingArray(int capacity){
        arr = new String[capacity];
    }

    public void push(String item){
        arr[N++] = item; // first put the item at N and then increase N by 1;
    }

    public String pop(){
        String item =  arr[--N];
        arr[N] = null;
        return item;
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public boolean isFull(){
        return N == arr.length;
    }


    public static void main(String[] args){
        StackImplementationUsingArray testObj = new StackImplementationUsingArray(4);
        testObj.push("a");
        testObj.push("b");
        testObj.push("c");
        testObj.push("d");
        System.out.println("Stack is now Full ? " + testObj.isFull());

        System.out.println(testObj.pop());
        System.out.println(testObj.pop());
        System.out.println(testObj.pop());
        System.out.println(testObj.pop());
        System.out.println("Stack is now empty ? " + testObj.isEmpty());

    }
}


