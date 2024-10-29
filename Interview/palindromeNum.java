public class palindromeNum {
    public static void main(String[] args) {
        int n = 123 ;

        int num =0;
        int temp =  n;
        while(n !=0){
            num = num*10 + n%10;
            n = n/10 ;
        }

        if(n==temp){
            System.out.println("Palindrome");
        }
        else 
        System.out.println("Not");
        // System.out.println(num);
    }
}