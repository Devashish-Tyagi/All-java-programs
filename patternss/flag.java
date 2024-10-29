package patternss;

public class flag {
    public static void main(String[] args) {
        for(int i =3 ; i>=-3 ;i--){
            for(int j =3 ; j>=Math.abs(i) ;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }  
}
