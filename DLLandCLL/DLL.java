package DLLandCLL;

import java.util.Scanner;

public class DLL {
    public static class Node{
        int data ;
        Node next ;
        Node prev ;
        Node(int data){
            this.data=data;
        }
    }

    public static void displayFromHead(Node head){
        Node temp=head ;
        while(temp!=null){
            System.out.print(temp.data+" ");
        temp=temp.next;
        }
        System.out.println();
    }

    public static void displayFromTail(Node tail){
        Node temp =tail;
        while(temp!=null){
             System.out.print(temp.data+" ");
            temp=temp.prev;
            }
            System.out.println();
    }

    public static void displayFromRandom(Node random){
        Node temp=random ;
        while(temp.prev!=null){
            temp=temp.prev;
        }
        while(temp!=null){
            System.out.print(temp.data+" ");
        temp=temp.next;
        }
        System.out.println();

    }
    public static void insertionAtHead(Node head){
        Node t=new Node(999);
        t.next=head;
        head.prev=t;
        head=t;
    }

    public static void insertAtTail(Node head){
        Node temp =head ;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node t=new Node(99);
        temp.next=t;
        t.prev=temp;
    }
    public static void insertAtIdx (Node head ,int idx,int data){
        Node temp=head; 
        for(int i=0 ; i<idx-2 ; i++){
            temp=temp.next;
         }
         Node t=new Node(data);

         temp.next.prev=t;
         t.prev=temp;
         t.next=temp.next;
         temp.next=t;
    }

    public static void deleteIdx(Node head , int idx){
        Node temp=head ;
        for(int i=0 ;i<idx-2 ;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        temp.next.prev=temp;

    }
    
    public static void runthis(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {
        Node a =new Node(2);
        Node b =new Node(3);
        Node c =new Node(7);
        Node d =new Node(11);
        Node e =new Node(21);
         
        a.next =b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;

        displayFromHead(a);
        displayFromTail(e);
        displayFromRandom(d);
        insertionAtHead(a);
        displayFromHead(a.prev);
        insertAtTail(a);
        displayFromHead(a);
        insertAtIdx(a, 3, 9898);
        displayFromHead(a);
        deleteIdx(a, 3);
        displayFromHead(a);

        Scanner sc =new Scanner(System.in);

        String s =sc.nextLine();
        runthis(s);
    }
}