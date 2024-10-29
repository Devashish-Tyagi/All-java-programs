package yoo;

public class anagram {

    public static void main(String[] args) {
        String str1="care";
        String str2="race";

        char a[]=str1.toCharArray();
        char b[]=str2.toCharArray();

        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    char temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
        
        for(int i=0;i<b.length-1;i++){
            for(int j=0;j<b.length-i-1;j++){
                if(b[j]>b[j+1]){
                    char temp=b[j+1];
                    b[j+1]=b[j];
                    b[j]=temp;
                }
            }
        }


        if(a.length ==b.length){

            Boolean flag=false;
            for(int i=0;i<a.length;i++){
            if(a[i]==b[i]){
                flag=true;
            }else{
                flag=false;
                System.out.println("Not anagram");
                return ;
            }
        }
        if(flag=true){
            System.out.println("anagram string");
        }else{
            System.out.println("not anagram string");
        }
    }
    else
    System.out.println("Not Anagram");
        

    }
    
}
