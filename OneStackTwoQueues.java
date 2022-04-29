import java.util.*;
public interface OneStackTwoQueues {
    static Queue<Integer> q1= new LinkedList<Integer>();
    static Queue<Integer> q2= new LinkedList<Integer>();
    public static void push(int d){
     while(!q1.isEmpty()){
         q2.add(q1.peek());
         q1.remove();
     }
     q1.add(d);
     while(!q2.isEmpty()){
         q1.add(q2.peek());
         q2.remove();
     }
    }
    public static void printStack(){
     while(!q1.isEmpty()){
         System.out.println(q1.peek());
         q1.remove();
     }
    }
    public static void main(String args[]){
        push(10);
        push(20);
        push(30);
        printStack();
    }
}
