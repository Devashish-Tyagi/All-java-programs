package linklistproblem;


public class mergeExtraspace {
    
    public static class Node{
        Node next ;
        int data ;
        Node(int data){
            this.data=data;
        }
    }

    public static Node mergelinklist(Node headA , Node headB){
        Node temp1=headA;
        Node temp2=headB;
        Node head =new Node(100);
        Node temp = head ;
        while(temp!=null && temp2!=null){
            if(temp1.data<temp2.data){
                Node a =new Node(temp1.data);
                temp.next=a;
                temp=a;
                temp1=temp1.next;

            }
            else{
                Node a =new Node(temp2.data);
                temp.next=a;
                temp=a;
                temp2=temp2.next;
            }

        }
        if(temp!=null){
            temp.next=temp2;
        }
        else{
            temp.next=temp1;
        }
        return head.next;
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