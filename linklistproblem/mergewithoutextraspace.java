package linklistproblem;

public class mergewithoutextraspace {
    
    public static class Node {
        int data ;
        Node next ;
        Node(int data){
            this.data=data;
        }
    }

    public static Node mergelinklist(Node headA , Node headB){
        Node t1=headA;
        Node t2 =headB;
        Node h =new Node(4);
        Node t=h;
        while(t2!=null && t2!=null){
            if(t1.data<t2.data){
                t.next=t1;
                t =t1;
                t1=t1.next;

            }
            else{
                t.next=t2;
                t=t2;
                t2=t2.next;
            }
        }
        if(t1==null){
            t.next=t2;
        }
        else{    // t2 is null
            t.next=t1;
        }
        return h.next;
    }
    public static void main(String[] args) {
        Node a = new Node(1) ;
        Node b = new Node(3) ;
        Node c = new Node(5) ;
        Node d = new Node(8) ;

        Node e = new Node(2) ;
        Node f = new Node(4) ;
        Node g = new Node(6) ;
        Node h = new Node(7) ;
    
    a.next=b;
    b.next=c;
    c.next=d;
    
    e.next=f;
    f.next=g;
    g.next=h;
    
   Node q = mergelinklist(a, e);
   Node temp =q ;
   while(temp!=null){
       System.out.print(temp.data+" ");
       temp =temp.next;
   }

}
}
