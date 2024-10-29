package CollectionsFrameworks;

import java.util.LinkedList;

public class linkList {
     static void Linklist(){
        LinkedList<Integer> l= new LinkedList<>();
        l.offer(1);
        l.offer(2);
        l.offer(3);
        System.out.println(l.peek());
        System.out.println(l.poll());
        System.out.println(l.peek());
        System.out.println(l.isEmpty());
        System.out.println(l.size());
        System.out.println(l);
    }

    public static void main(String[] args) {
        Linklist();
    }
}
