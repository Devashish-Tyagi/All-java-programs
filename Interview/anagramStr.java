import java.util.Arrays;

public class anagramStr {
    public static void main(String[] args) {
        String str1 = "race" ;
        String str2 = "care" ;
        boolean flag = true;

        if(str1.length()!= str2.length()){
            System.out.println("not anagram");
        }

        else {
            char[] array1 = str1.toCharArray() ;
            char[] array2 = str2.toCharArray() ;

            Arrays.sort(array1) ;
            Arrays.sort(array2) ;

            for(int i =0 ; i<str1.length() ; i++){
                if(array1[i]==array2[i]){
                         flag = true ;
                        continue ;
                }
               else {
                   flag = false ;
                   break ;
               }
            }

            if(flag ==true){
                System.out.println("Anagram");
            }
            else 
            System.out.println("Not anagram ");
        }
    }
    
}
