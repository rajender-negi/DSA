import java.util.*;
public class OneQueueTwoStacks {
    static Stack<Integer> s1= new Stack<Integer>();
    static Stack<Integer> s2= new Stack<Integer>();
    public static void push(int n) {
        while(!s1.isEmpty()) {
            s2.push(s1.peek());
            s1.pop();
        }
            s1.push(n);
        while(!s2.isEmpty()){
            s1.push(s2.peek());
            s2.pop();
        }
    }
    public static void printStack(){
        while(!s1.isEmpty()){
            System.out.println(s1.peek());
            s1.pop();
        }
    }
    public static void main(String args[])
    {
        push(10);
        push(20);
        push(30);
        printStack();
    }
}
