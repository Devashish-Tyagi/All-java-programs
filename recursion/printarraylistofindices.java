package recursion;

import java.util.ArrayList;

public class printarraylistofindices {
    static ArrayList<Integer> allidx(int a[], int n , int x , int idx){
        if(idx>=n)
        return new ArrayList<Integer>();
        ArrayList<Integer> ans= new ArrayList<>();
        if(a[idx]==x){
            ans.add(idx);                   
        }
        ArrayList<Integer> smallans =allidx(a, n, x, idx+1) ;
        ans.addAll(smallans) ;
        return ans ;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,4,5,4} ;
        int target =4 ;
        int n =a.length ;
        ArrayList<Integer> ans =allidx(a, n, target, 0) ;
        for(Integer i:ans){
            System.out.println(i);
        }
    }
}
