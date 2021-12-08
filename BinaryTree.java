class Node
    {
        int data;
        Node left, right;
        
        Node(int data)
        {
            this.data=data;
            left = right = null; 
        }
    }

public class BinaryTree
{
    Node root;
    
    public static void main(String args[])
    {
        BinaryTree bt= new BinaryTree();
        bt.root = new Node(1);
        bt.root.left= new Node(2);
        bt.root.right= new Node(3);
        
        System.out.println("data at root : "+bt.root.data);
        System.out.println("data at root's left : "+bt.root.left);
        System.out.println("data at root's right : "+bt.root.right);
        
        System.out.println("data at left child : "+bt.root.left.data);
        System.out.println("data at left child's left : "+bt.root.left.left);
        System.out.println("data at left child's right : "+bt.root.left.right);
        
        System.out.println("data at right child : "+bt.root.right.data);
        System.out.println("data at right child's left : "+bt.root.right.left);
        System.out.println("data at right child's right : "+bt.root.right.right);
    }
}

