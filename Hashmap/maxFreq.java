package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class maxFreq {
    // Find most frequency element in an array 

    public static void main(String[] args) {
        int[] arr = {1,11,1,1,1,1,7,7,7,7,7,7,43,3};
        Map<Integer , Integer> freq = new HashMap<>();
        for(int el :arr ){
            if(!freq.containsKey(el));
         else {
            freq.put(freq.get(el), el) ;
        }
    }

    System.out.println("Frequency Map");
    System.out.println(freq.entrySet());

    int maxfreq = 0 , anskey =-1 ;

    for(var e : freq.entrySet()){
        if(e.getValue() > maxfreq){
            maxfreq =e.getValue();
            anskey =e.getKey();

        }
    }
}
    
}
