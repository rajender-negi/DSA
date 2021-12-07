public class Stack
{
    static Node top;
    
    static class Node
    {
        int data;
        Node link;
        
        Node(int data)
        {
            this.data=data;
            this.link=null;
        }
    }
    
    public static Stack push(Stack s, int d)
    {
        Node newNode = new Node(d);
        newNode.link=s.top;
        s.top=newNode;
        return s;
    }
    
    public static void pop(Stack s)
    {
        s.top=top.link;
    }
    
    public static void peek(Stack s)
    {
        System.out.println("\npeek stack");
        if(s.top==null)
        {
            System.out.println("stack is empty");
        }else
        {
            Node checkNode=s.top;
            while(checkNode!=null)
            {
                System.out.println(checkNode.data);
                checkNode=checkNode.link;
            }
        }
    }
    
    public static void main(String args[])
    {
        Stack stack= new Stack();
        peek(stack);

        stack.push(stack, 10);
        peek(stack);

        stack.push(stack, 20);
        peek(stack);

        stack.push(stack, 30);
        peek(stack);

        stack.push(stack, 40);
        peek(stack);

        stack.pop(stack);
        peek(stack);
    }
}
