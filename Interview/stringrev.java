import OneDarrayproblems.reverse;

public class stringrev {

    public static void reverseString(String str){
        String str2 = "" ;
        for(int i  =0 ; i<str.length() ;i++){
            char ch =  str.charAt(i) ;
            str2 = ch+str2 ;
        }
        System.out.println(str2 );
    }

    public static String revString(String str , int idx){
        if(idx==str.length()) return "" ;
        String smallAns = revString(str, idx+1);
        return smallAns+ str.charAt(idx) ;
    }
    public static void main(String[] args) {
        String str= "Hello" ;
        String str3 = "Hello" ;

        reverseString(str);
        System.out.println(revString(str3 , 0));
    }
}
