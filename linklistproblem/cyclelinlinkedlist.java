package linklistproblem;

public class cyclelinlinkedlist {  
    
    public static class Node{
        int data ;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static boolean hascycle(Node head){
        Node slow =head ;
        Node fast =head ;
        while(fast!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow)
            return true ;
        }
        return false ;
    }

    public static Node cycleelement(Node head){
        Node slow =head ;
        Node fast = head ;
        while(fast!=null){
            slow =slow.next;
            fast=fast.next.next;
            if(fast==slow)  
            break ;
        }
        Node temp =head ;
        while(temp!=slow){
            temp=temp.next;
            slow=slow.next;
        }
        return slow ;
    }

    public static void main(String[] args) {
        Node a = new Node(10) ;
        Node b = new Node(20) ;
        Node c = new Node(30) ;
        Node d = new Node(40) ;
        Node e = new Node(50) ;
        // Node f = new Node(60) ;

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=c ;             // Cycle

        boolean ans = hascycle(a) ;
        System.out.println(ans);

        Node q = cycleelement(a) ;
        System.out.println(q.data);

    }
}
