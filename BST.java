class Node
{
    int data;
    Node left, right;
    Node(int data)
    {
        this.data=data;
        this.left=null; 
        this.right= null;
    }
}

public class BST
{
    Node root;
    
    public static void searchElement(BST bst, int key)
    {
        boolean gotIt = false;
        String path= new String("path -> root -> ");
        while(!gotIt)
        {
            System.out.println("start the search");
            if(bst.root!=null)
            {
                System.out.println("root is not null");
                System.out.println("value of bst's root data "+bst.root.data);
                if(bst.root.data>key)
                {
                    System.out.println("inside left child");
                    path=path+(" left -> ");
                    bst.root=bst.root.left;
                    if(bst.root.data==key)
                    {
                        gotIt = true;
                        System.out.println("Found the element and path is :: "+path);
                        return;
                    }
                }else
                {
                    System.out.println("inside right child");
                    path=path+(" right -> ");
                    bst.root=bst.root.right;
                    if(bst.root.data==key)
                    {
                        gotIt = true;
                        System.out.println("Found the element and path is :: "+path);
                        return;
                    }        
                }
            }
        }
        
    }
    
    public static void main(String args[])
    {
        BST bst= new BST();
        bst.root = new Node(50);
        bst.root.left = new Node(25);
        bst.root.right = new Node(75);
        
        bst.root.left.left = new Node(12);
        bst.root.left.right = new Node(37);

        bst.root.right.left = new Node(62);
        bst.root.right.right = new Node(100);
        
        searchElement(bst, 37);
    }
}
