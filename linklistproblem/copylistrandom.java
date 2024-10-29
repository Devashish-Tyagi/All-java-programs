package linklistproblem;

public class copylistrandom {
    public static class Node{
        int data ;
        Node next;
        Node random ;
        Node(int data){
            this.data=data;
            this.next=null;  
            this.random =null;
        }
    }

    public static Node copyrandomlist(Node head){
        Node head2=new Node(0);
        Node head1= new Node(0);
        Node temp2 = head2;
        Node temp1 = head;
        while(temp1!=null){
            Node t =new Node(temp1.data);
            temp2.next=t;
            temp2=t;
            temp1=temp1.next;
        }
        head2=head2.next;
        temp2=head2;
        temp1=head;

        // alternate connection
        Node temp = new Node(-1);
        while(temp1!=null){
            temp.next= temp1;
            temp1=temp1.next;
            temp=temp.next;
            temp.next=temp2;
            temp2=temp2.next;
            temp  = temp.next;
        }
        temp2 =head2;
        temp1=head;
        // assigning random pointer
        while(temp1!=null && temp2!=null){
            if(temp1.random == null) 
            temp2.random =null;
            else 
            temp2.random = temp1.random.next;
            temp1 =temp2.next;
            temp2=temp1.next;
        }
        temp2=head2;
        temp1 =head;

        // seperating the lists
        while(temp1!=null){
            temp1.next=temp2.next;
            temp1=temp1.next;
            if(temp1==null)  break ;
            temp2.next = temp1.next;
            if(temp2.next == null) break ;
            temp2 =temp2.next;
                }
          return head2 ;

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
        a.random =d;
        d.random=b;
        b.random=d;


        Node q = copyrandomlist(a);
        Node tempq=q;
        
        while(tempq!=null){
         System.out.print(tempq.data+" ");
         tempq=tempq.next;
        }
     }

     
    }

