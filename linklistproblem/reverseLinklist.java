package linklistproblem;

public class reverseLinklist {

    public static class Node{
        int data ;
        Node next ;
        Node(int data){
            this.data =data ;
        }
    }

    // using recursion
    public static Node reverse(Node head){
        if(head.next==null) return head ;

        Node newHead = reverse(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
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

       Node q = reverse(a);
       Node temp=q;
       
       while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
       }

    }
    
}
