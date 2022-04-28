public class LinkedListWithOperations {
    Node head;
    public static void main(String args[]) {
        LinkedListWithOperations list= new LinkedListWithOperations();
        int key, data;
        list=list.insertNode(list,10);
        list=list.insertNode(list,20);
        list=list.insertNode(list,30);
        list=list.insertNode(list,40);
        list=list.insertNode(list,50);
        System.out.println("print linked list");
        printList(list);

        System.out.println("delete last node");
        list=deleteLastNode(list);
        printList(list);

        key=30;
        System.out.println("delete node with this data: "+key);
        deleteNodeByKey(list, key);
        printList(list);

        key=40; data=100;
        System.out.println("insert node before key: "+key+" and with data value: "+data);
        list=insertNodeBeforeKey(list,key,data);
        printList(list);


        key=40; data=200;
        System.out.println("insert node after key: "+key+" and with data value: "+data);
        list=insertNodeAfterKey(list,key,data);
        printList(list);
    }

    public static LinkedListWithOperations insertNode(LinkedListWithOperations list, int data){

        Node newNode= new Node(data);
        if(list.head==null)
        {
            list.head=newNode;
        }else{
            Node last = list.head;
            //System.out.println(last.data);
            while(last.next!=null)
            {
                last=last.next;
            }
            last.next=newNode;
        }
        return list;
    }


    public static LinkedListWithOperations deleteLastNode(LinkedListWithOperations list)
    {
        Node last=list.head;
        while(last.next.next!=null)
        {
            last=last.next;
        }
        last.next=null;
        return list;
    }

    public static LinkedListWithOperations deleteNodeByKey(LinkedListWithOperations list, int dataKey)
    {
        Node last= list.head;
        if(last.data==dataKey){
            list.head=last.next;
            return list;
        }
        while(last.next!=null){
            if(last.next.data==dataKey){
                last.next=last.next.next;
                return list;
            }
            last=last.next;
        }
        return list;
    }

    public static LinkedListWithOperations insertNodeBeforeKey(LinkedListWithOperations list, int key,int data)
    {
        Node new_node = new Node(data);
        Node last=list.head;
        if(key==last.data){
            new_node.next=last;
            list.head=new_node;
            return list;
        }
        while(last.next!=null){
            if(key==last.next.data){
                new_node.next=last.next;
                last.next=new_node;
                return list;
            }
            last=last.next;
        }
        return list;
    }

    public static LinkedListWithOperations insertNodeAfterKey(LinkedListWithOperations list, int key, int data)
    {
        Node last=list.head;
        Node new_node= new Node(data);
        if(last.data==key)
        {
            new_node.next=last.next;
            last.next=new_node;
            return list;
        }

        while(last.next!=null){
            if(key==last.next.data)
            {
                new_node.next=last.next.next;
                last.next.next=new_node;
            }
            last=last.next;
        }
        return list;
    }
    public static void printList(LinkedListWithOperations list)
    {
        Node last = list.head;
        while(last!=null)
        {
            System.out.println(last.data);
            last=last.next;
        }
    }
}
class Node {
    Node next;
    int data;
    Node(int data)
    {
        this.data=data;
        next=null;
    }
}

