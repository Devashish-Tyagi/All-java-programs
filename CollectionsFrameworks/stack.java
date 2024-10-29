package CollectionsFrameworks;

import java.util.Stack;

public class stack {

        static void StacksExample(){
            Stack<Integer> st= new Stack<>();
            st.add(1);
            st.add(2);
            st.add(3);
            st.add(4);
            System.out.println(st);  //  1 2 3 4
            System.out.println(st.get(1));   // 2
            st.set(1, 10);
            System.out.println(st);       // 1 10 3 4
            System.out.println(st.contains(10));         // true 
            System.out.println();
        }

        static void stackss(){
            Stack<String> st1=new Stack<>();
            st1.push("World");
            st1.push("Hello");
            System.out.println(st1.peek());
            System.out.println(st1.pop());
            System.out.println(st1.peek());
            System.out.println(st1.size());
            System.out.println(st1.empty());
        }

        public static void main(String[] args) {
            StacksExample();
            stackss();
        }
    }
