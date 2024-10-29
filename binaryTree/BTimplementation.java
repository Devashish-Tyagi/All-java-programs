
public class BTimplementation {

   public static class Node{
        int val ;
        Node left;
        Node right;
        public Node(int val){
            this.val=val ;
        }
    }

    public static void display(Node root ){
        if(root ==null) return ;
        System.out.print(root.val + " --> ");
        if(root.left!=null)
        System.out.print(root.left.val +",");
        if(root.right!=null)
        System.out.print(root.right.val);
        System.out.println();
        display(root.left);
        display(root.right);
    }

    // Preorder traversal
    public static void preorder(Node root){
        if(root == null) return ;
        System.out.println(root.val +" ");
        preorder(root.left);
        preorder(root.right);
    }

    // Size 
    public static int size(Node root ){
        if(root ==null) return 0;
        return 1+ size(root.left) +size(root.right);
    }

    // Sum
    public static int sum(Node root ){
        if(root==null ) return 0;
        return  ((root.val) + sum(root.left) + sum(root.right));
    }

    // product
    public static int product(Node root){
     if(root==null) return 1;
     return ( (root.val) * product(root.left) * product(root.right));
    }

    // Max 
    public static int max(Node root){
        // if(root==null) return 0;
        if(root==null) return Integer.MIN_VALUE;
        int a = root.val;
        int b = max(root.left);
        int c = max(root.right);
        return Math.max(a, Math.max(b, c));
    }

    // Min
    public static int min(Node root){
        if(root==null) return Integer.MAX_VALUE;
        int a =root.val;
        int b = min(root.left);
        int c =min(root.right);
        return Math.min(a,Math.max(b, c));
    }
    // Height
    public static int height(Node root){
        if(root==null || (root.left==null && root.right== null))
        return 0;
        return 1+ Math.max(height(root.left) , height(root.right));
    }

    // nth level nodes
    public static void nthLevel(Node root , int n ){
        if(root==null) return ;
        if(n==1) System.out.print(root.val+",");            
        nthLevel(root.left, n-1);
        nthLevel(root.right, n-1);
           }

    public static void main(String[] args) {
    Node root = new Node(1);
    Node a = new Node(2);    
    Node b = new Node(3);
    root.left =a ;
    root.right=b ;

    Node c = new Node(4);    
    Node d = new Node(5);    
    a.left=c;
    a.right=d;
    Node e = new Node(6);    
    Node f = new Node(7);    
    b.left=e;
    b.right=f;

    // System.out.print(display(root));
    System.out.println("Display");
    display(root);
    System.out.println("Preorder traversal : ");
    preorder(root);
    System.out.println("Size "+size(root));
    System.out.println("Sum "+sum(root));
    System.out.println("Product "+ product(root));
    System.out.println("Max "+max(root));
    System.out.println("Min "+min(root));
    System.out.println("Height "+height(root));

    nthLevel(root, 3);
    }
}