package linklistproblem;

public class nthfromend {

    public static class Node{
        int data ;
        Node next ;
        Node(int data){
            this.data =data ;
        }
    }
    public static Node nthnodefromend(Node head , int n){
        int size =0;
        Node temp = head ;
        if(head.next==null) return null;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int m =size-n+1;
        temp =head ;
        for(int i=0 ;i<m-2 ;i++){
            temp =temp.next;
        }
        temp.next=temp.next.next;
        return head ;
    } 

    public static void display(Node head ){
        Node temp =head ;
        while(temp!=null){
            System.out.print(temp.data);
            temp =temp.next;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(10) ;
        Node b = new Node(20) ;
        Node c = new Node(30) ;
        Node d = new Node(40) ;
        Node e = new Node(50) ;

        a.next =b;
        b.next =c;
        c.next =d;
        d.next =e;
        Node q = nthnodefromend(a, 1);
        display(q);
    }
    
}
