package linklist;

public class basic {
    public static class Node{
        int data ;
        Node next ;
        Node(int data){
            this.data=data ;
        }
    }

    // display function
    public static void display(Node head){
         Node temp =head ;
         while(temp!=null){
            System.out.print(temp.data+"-");
            temp=temp.next ;
         }
    }

    // display recursive function
    // public static void display2(Node head){
    //     Node temp =head ;
    //     if( temp== null)  return ;
    //     System.out.println(temp.data);      // NOt working yet
    //     display2(temp);
    // }

    public static int length(Node head){
        int count =0 ;
        Node a=head ;
        while(a!=null){
            count++;
            a=a.next;
        }
        return count ;
    }




    public static void main(String[] args) {
        Node a =new Node(5);
        Node b =new Node(10) ;  
        Node c =new Node(11) ;
        Node d =new Node(16) ;
                                   //___
        a.next=b;                  //   |  
        b.next=c;                  //   |==>    linking nodes with each other  
        c.next=d;                  //___|
                                   
        // displaying linklist
        System.out.println(a.data); 
        System.out.println(a.next.data); 
        System.out.println(a.next.next.data);
        
        
        // displaying using for loop 
        Node temp = a;
        for(int i =0 ; i<=3;i++){
            System.out.print(temp.data+" ");
            temp =temp.next ;
        }
        System.out.println();

        // when number of node unknown 
        Node temp1 =a ;
        while(temp1!=null){
            System.out.print(temp1.data+",");
            temp1=temp1.next ;
        }
        System.out.println();

        display(a);
        // display2(a); 
       int len= length(a) ;
       System.out.println(len);

    }
}