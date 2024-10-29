package prefixsuffix;

// Check if we can partition a array in two subarray having equal Sum
public class partitionequalsum {
    public static int check(int a[]){
        int n = a.length ;
        int pref =0 ,total_sum=0;           // if prefsum == suffsum
        for (int i =0 ; i<n ; i++){
            total_sum+=a[i];
        }
        for(int i =0 ; i<n;i++){        
            int suff= total_sum-pref;
            if(pref==suff){ 
                return i;
            }
            pref+=a[i] ;
        }
        return -1;
    }
    public static void main(String[] args) {
       int a[]={4,1,3,1,4};
       int ans =check(a) ;
       System.out.println(ans);
    }
}
