package linklistproblem;

public class reversewithoutrecursion {

    public static class Node{
        int data ;
        Node next ;
        Node(int data){
            this.data =data ;
        }
    }

    // without recursion
    public static Node reverselist(Node head){
        Node curr =head;
        Node prev =null;
        Node after = null;
        while(curr!=null){
            after = curr.next;
            curr.next=prev;
            prev=curr;
            curr=after;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        a.next = b ;
        b.next =c;
        c.next =d;
        d.next =e;

       System.out.println();
       Node q1 =reverselist(a);
       Node temp1=q1;
       
       while(temp1!=null){
        System.out.print(temp1.data+" ");
        temp1=temp1.next;
       }
    }
    
}
