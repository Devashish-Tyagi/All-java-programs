package CollectionsFrameworks;
import java.util.ArrayList;
import java.util.LinkedList;

public class arrayList {
    static void ArrayListExample(){
        ArrayList<String> l= new ArrayList<>();

        l.add("Ramesh");
        l.add("Suresh");
        l.add("Mahesh");
        l.add("Dinesh");
        System.out.println(l);  

        System.out.println(l.contains("Ramesh"));     //  True
        System.out.println(l.get(1));       // Suresh
        System.out.println(l);                  // ["Ramesh" , "Suresh" ,"Mahhesh" ,"Dinesh"]
        System.out.println(l.contains(10));       // false 
    }

    static void linklist(){
        LinkedList<Integer> ll = new LinkedList<>() ;  

        ll.push(3);
        ll.push(3);
        ll.push(3);
        ll.pop();
        System.out.println(ll.size());
    }
    public static void main(String[] args) {
        ArrayListExample();
        // linklist();
    }
}