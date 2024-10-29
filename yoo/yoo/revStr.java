package yoo;

public class revStr {

    public static void revv(String str){
        String rev ="";
        for(int i =str.length()-1  ; i>=0 ; i--){
                rev = rev+str.charAt(i) ;
        }
        System.out.println(rev);
    }

    public static String revStr(String str ,int idx){
        if(idx==str.length()) return "" ;
        String smallans= revStr(str, idx+1);
        return smallans+str.charAt(idx);
    }

    public static void devanshi(String str){
        StringBuilder sb = new StringBuilder(str);
        for(int i =0 ; i<sb.length()/2;i++){
            int front = i ;
            int back = sb.length() -i-1 ;
            char frontChar = sb.charAt(front);
            char lastChar = sb.charAt(back) ;

            if(str.charAt(i)!=' '){          
                sb.setCharAt(front, lastChar);
                sb.setCharAt(back, frontChar);
            }
        }        
        System.out.println(sb);
    }

    public static void basic(String str){
        str.length();
        System.out.println(str.length());
        System.out.println(str.charAt(5));
    }

    public static void main(String[] args) {
        String str = "Hello" ;

        // revv(str);
        devanshi(str);
        // System.out.println( revStr(str, 0)); 

        // basic(str) ;

    }
    
}
