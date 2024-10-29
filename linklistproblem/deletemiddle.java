package linklistproblem;

public class deletemiddle {
    public static class Node{
        int data ;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    
    public static Node deletemiddle(Node head){
        Node slow =head ;
        Node fast =head ;
        if(head.next==null){
            return null;
        }
        while(fast.next.next!=null && fast.next.next.next!=null){
            slow =slow.next ;
            fast =fast.next.next ;
        }
        slow.next=slow.next.next ;
        return slow ;
    }


    public static void display(Node head ){
        Node temp =head ;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp =temp.next;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(10) ;
        Node b = new Node(20) ;
        Node c = new Node(30) ;
        Node d = new Node(40) ;
        Node e = new Node(50) ;
        Node f = new Node(60) ;

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f ;

        display(a);
        System.out.println();
        Node q =deletemiddle(a) ;
        display(a);

    }
    
}