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
    
    public static void searchElement(BST bst, int key, String path)
    {
        if(bst.root==null || bst.root.data==key)
        {
            System.out.println("found the element :: root -> "+path);
            return;
        }else
        {
            if(bst.root.data>key)
                {
                    path=path+" left -> ";
                    bst.root=bst.root.left;
                    searchElement(bst, key, path);
                }else
                {
                    path=path+" right -> ";
                    bst.root=bst.root.right;
                    searchElement(bst, key, path);
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
        
        searchElement(bst, 37, "");
    }
}
