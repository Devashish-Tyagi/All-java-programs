package linklist;

public class test {

   public static class Node{
        Node next  ;
        int data;
        Node(int data){
            this.data = data ;
        }
    }

    public static void display(Node a){
        Node temp = a ;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=  temp.next ;
        }
        System.out.println();
    }

    public static void primeFreq(Node a){
        Node temp  = a ;
        boolean flag = true ;
        int count =0 ;
        while(temp !=null){
            for(int i =3 ;  i<temp.data/2 ; i++){
                if(temp.data %i==0){
                    flag = false ;
                }
            }
            if(flag ==true){
                count++ ;
            }
            temp=temp.next ;
        }
        System.out.println(count +" is prime number frequency");
    }

    public static void copy3and5(Node a) {
        Node head = null;
        Node end = null;
        Node temp = a;

        while (temp != null) {
            if (temp.data % 3 == 0 && temp.data % 5 == 0) {
                Node newNode = new Node(temp.data);
                if (head == null) {
                    head = newNode;
                    end = head;
                } else {
                    end.next = newNode; // link the new node
                    end = newNode; // move the end pointer
                }
                System.out.println(newNode.data);
            }
            temp = temp.next;
        }
        System.out.print("Numbers divisible by 3 and 5: ");
        // display(head);
    }
    public static void main(String[] args) {
        Node a = new Node(2) ;   
        Node b = new Node(7) ;
        Node c = new Node(8) ;
        Node d = new Node(9) ;
        Node e = new Node(10) ;
        Node f = new Node(11) ;

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        // display(a) ;
        // primeFreq(a);
        copy3and5(a);
    }
}
