package OOPs;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arraylist {
    public static class Arraylist{
        int a[] =new int[5];
        int idx =0 , size =0;

        // function to add element to arraylist
        public void add(int ele){
            if(size==a.length){
                int b[] = Arrays.copyOf(a, a.length*2);
                a=b;
            }
            a[idx]=ele;
            idx++;
            size++ ;
        } 
        public int size(){
            System.out.println(a);
            return size ;

        }
        public void set(int idx , int val){
            a[idx]=val ;
        }

        // public static Arraylist print(Arraylist a){
        //     System.out.println(a);                     // function not working 
        //     return a ;
        // }
    }

    public static void main(String[] args) {
        Arraylist arr =new Arraylist();
        arr.add(3);
        System.out.println(arr.size);
        arr.add(5);
        System.out.println(arr.size);
        // System.out.println(arr);

        // arr.print(arr );    // not printing 
    }
    
}
