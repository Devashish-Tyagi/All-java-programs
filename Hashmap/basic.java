package Hashmap ;
    import java.util.HashMap;
    public class basic{
        public static void main(String[] args) {
            HashMap<String , Integer> mp =new HashMap<>();
            mp.put("Devashish", 16);
            mp.put("Dev", 11);
            mp.put("Ram", 1);
            mp.put("Krishna", 2);       
            mp.put("Remove It", 8);
            // Getting value of a key from hashmap 
            System.out.println(mp.get("Dev"));
            System.out.println(mp.get("Devashish"));
            System.out.println(mp.get("H"));  // null

            // Changing/ Update value of key in HashMap
            mp.put("Devashish", 21) ;    // Devashish --> 21
            System.out.println(mp.get("Devashish"));    // 21

            // remove a pair 
            System.out.println(mp.remove("Remove It"));   // 8

            // check if a key is in Map 
            System.out.println(mp.containsKey("Dev"));   // true

            // adding a new entry only if key doesn't exist already
            mp.putIfAbsent("Devashish", 33);   // will not enter 
            mp.putIfAbsent("Devashish Tyagi", 5); 

            // Get all keys in HashMap
            System.out.println(mp.keySet());
            // Get all values in HashMap
            System.out.println(mp.values());

            // Get all entries in HashMap
            System.out.println(mp.entrySet());


            // Traverse all entries of HashMap
            // for(String key: mp.keySet()){
            //     System.out.print("House number of %s is %d \n", key, mp.get(key));
            // }

            // for(Map.Entry<String , integer> e mp.entrySet()){
            //     System.out.println("House Number of %s is %d \n" , e.getkey(), e.getValue());
            // }
        }
        
    }