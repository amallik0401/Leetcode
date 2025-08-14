public class binarytree {

    Node root;

    static class Node 
    {
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    binarytree()
    {
        root = null;
    }

    public void printInOrder(Node node)
    {
        if(node == null)
        {
            return;
        }

        printInOrder(node.left);
        System.out.print(node.data+" ");
        printInOrder(node.right);
    }
    public void printPreOrder(Node node)
    {
        if(node == null)
        {
            return;
        }

        System.out.print(node.data+" ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }
    public void printPostOrder(Node node)
    {
        if(node == null)
        {
            return;
        }

        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.data+" ");
    }

     public void inOrder()
    {
        System.out.println("Inorder :");
        printInOrder(root);
    }
    public void preOrder()
    {
        System.out.println("Preorder :");
        printPreOrder(root);
    }
    public void postOrder()
    {
        System.out.println("Postorder :");
        printPostOrder(root);
    }
    public static void main(String[] args) 
    {
        binarytree tree = new binarytree();

        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(15);
        tree.root.left.left = new Node(5);
        tree.root.right.left = new Node(12);
        
        
        tree.inOrder();
        System.out.println();
        tree.preOrder();
        System.out.println();
        tree.postOrder();
        
    }
}
