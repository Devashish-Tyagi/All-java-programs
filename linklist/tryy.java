package linklist;

public class tryy {

    public static class Node{
        int data ;
        Node next ;
        Node(int data){
            this.data = data ;
        }
    }

    public static void printLink(Node head){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next ;
        }
        System.out.println();
    }
    public static void size(Node head){
        Node temp = head;
        int count =0 ;
        while (temp!=null) {
            count++ ;
            temp = temp.next ;
        }
        System.out.println("Size is "+count);
    }


    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next =b ;
        b.next = c;
        c.next = d ;
        d.next = e ;

        System.out.println(a);

        printLink(a);
        size(a);

    }
    
}
