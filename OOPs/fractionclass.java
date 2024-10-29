package OOPs;

public class fractionclass {
    public static class fraction{
        int num ;
        int den ;

     // Constructor
     public fraction(int nume , int deno){
        num = nume ;
        den = deno ;
        // simplyfy() ;     // uncomment this if want to make every fraction simplify
    }

    public void simplyfy(){
        int hcf =gcd(num , den);     // i from gcd fxtn will be hcf
        num/=hcf ;
        den/=hcf ;
        // System.out.println(num+"/"+den);
    }

    // function for hcf
    public static int gcd(int num , int den){
        int min = Math.min(num , den);
        for(int i =min ; i>=1 ;i--){
            if(num%i==0 &&den%i==0)
            return i ;
        }
        return min ;
    }

    public static fraction add(fraction f1 , fraction f2){
        int numerator = f1.num*f2.den + f1.den*f2.num ;
        int denominator = f1.den*f2.den ;
        fraction f3 = new fraction(numerator, denominator) ;
        return f3 ;
    }



    }

    public static void main(String[] args) {
        fraction f1 = new fraction(21, 7) ;
        System.out.println(f1.num +"/"+f1.den);

        f1.simplyfy() ;
        System.out.println(f1.num+"/" + f1.den);
        // add function call 
        fraction f2 = new fraction(28, 7) ;
        // System.out.println(f3); 
        f2.simplyfy();
        System.out.println(f2.num+"/" + f2.den);

        fraction f3  = fraction.add(f1, f2) ;
        System.out.println(f3.num+"/" + f3.den);

    }
    
}
