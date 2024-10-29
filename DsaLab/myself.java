package DsaLab;

public class myself {
    
    public static void main(String[] args) {
        int n=5;
        int size =2*n-1;
        int front =0;
        int back=size-1;
        while(n!=0){
            for(int i=front;i<=back;i++ ){
                for(int j=front;j<=back;j++){
                    if(i==front || i==back || j==front || j==back)
                    System.out.print(n);
                }
            }
            System.out.println();
            
           front++;
           back--;
           n--;
        }
    }
}
