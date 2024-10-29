package linklistproblem;

public class intersection {

    public static class Node{
        int data ;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    
    public static Node inter(Node headA , Node headB){
        Node tempA = headA;
        Node tempB =headB ;
        int lengthA =0;
        while(tempA!=null){
            lengthA++;
            tempA =tempA.next ;
        }
        int lengthB =0;
        while(tempB!=null){
            lengthB++;
            tempB =tempB.next ;
        }
        tempA = headA;
        tempB = headB ;
        if(lengthA>lengthB){
            int steps =lengthA-lengthB;
            for(int i =1 ;i<=steps;i++){
                tempA =tempA.next;
            }
        }
        else {
            int steps =lengthB-lengthA;
            for(int i =1;i<=steps;i++){
                tempB=tempB.next;
            }
        }
        while(tempA!=tempB){
            tempA = tempA.next;
            tempB=tempB.next;
        }
        return tempA ;
    }

    public static void main(String[] args) {
        Node a  = new Node(10);
        Node b  = new Node(20);
        Node c  = new Node(30);
        Node d  = new Node(40);
        Node e  = new Node(50);
        Node a1 = new Node(60);
        Node a2 = new Node(70);
        Node a3 = new Node(80);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        a1.next =a2 ;
        a2.next =a3 ;
        a3.next=c ;

        Node q = inter(a, a1) ;
        System.out.println(q.data);
    }
}