public class LinkedList
{
    Node head;
    
    static class Node
    {
        int data;
        Node next;
        
        Node(int d)
        {
            this.data=d;
            next=null;
        }
    }

    public static LinkedList insertNode(LinkedList list, int data)
    {
        Node newNode = new Node(data);

        if(list.head==null)
        {
            list.head=newNode;
        }
        else
        {
            Node last = list.head;
            while(last.next!=null)
            {
                last=last.next;
            }
            last.next=newNode;
        }
        return list;
    }

    public static void main(String args[])
    {
        LinkedList list=new LinkedList();
        LinkedList l=LinkedList.insertNode(list, 10);
        l=LinkedList.insertNode(list, 20);
        
        Node currentNode=l.head;
        while(currentNode!=null)
        {
            System.out.println(currentNode.data);
            currentNode=currentNode.next;
        }

    }
}

