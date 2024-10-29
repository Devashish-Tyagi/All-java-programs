public class reverseStr {

    public static String revStr(String str2 , int idx ){
            if(idx == str2.length()) return "" ;

            String smallAns = revStr(str2, idx+1);
            return smallAns + str2.charAt(idx) ;
    }

    public static void main(String[] args) {
        // String str1 = "olleH" ;
        String str2 = "olleH" ;
        // String revStr1 = "" ;

        // for(int i =0 ; i<str1.length() ; i++){
        //     char ch = str1.charAt(i) ;
        //     revStr1 = ch+ revStr1  ;
        // }
        // System.out.println(revStr1);

        System.out.println(revStr(str2 , 0));
    }   
}