package linklist;

public class implimentation {
    public static class Node{
        int data ;
        Node next ;
        Node(int data){
            this.data  =data ;
        }
    }

    public static class linklist{
        Node head  =null ;
        Node tail =null ;

        void insertAtend(int val){
            Node temp = new Node(val);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                tail.next =temp;
                tail=temp;
            }
        }

        //  insert at beginning 
        void insertAthead(int val){
            Node temp =new Node(val);
            if(head==null){
                head =tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
        }

        // insert method 
        void insertAt(int idx ,  int val){
            Node t =new Node(val) ;
            Node temp =head ;
            if(idx==size()){
                insertAtend(val);
                return ;
            }
            else if(idx==0){
                insertAthead(val);
                return ;
            }

            for(int i=0 ;i<idx-1 ;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t ;
        }

        // get method
        int getAt(int idx){
            Node temp=head ;
            for(int i=0 ; i<idx-1;i++){
                temp=temp.next;
            }
            return temp.data;
        }

        // delete element
        void deleteAt(int idx){
            Node temp =head ;
            if(idx==0){
                head=head.next;
                return ;
            }
            for(int i=1 ;i<idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            tail=temp;
            // size--; 
        }


        void display(){
            Node temp =head ;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        

        int size(){
            Node temp=head ;
            int count =0;
            int sum = 0 ;
            while(temp!=null){
                count++;
                // sum = sum+ temp.data ;
                temp=temp.next;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        linklist l1=new linklist();
        l1.insertAtend(4);
        l1.insertAtend(7);
        l1.insertAtend(11);
        l1.insertAthead(2);
        l1.insertAt(2, 98);
        l1.insertAt(5, 876);
        l1.display();
        System.out.println();
        l1.deleteAt(4);
        l1.display();
        System.out.println();
        System.out.println("Element at idx is : "+l1.getAt(4)); 
        // System.out.println();
        System.out.println("Size of link lisk is : "+l1.size());
    }
}
