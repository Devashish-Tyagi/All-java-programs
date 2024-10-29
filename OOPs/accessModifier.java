package OOPs;

public class accessModifier {
// linked to studeny file by class 
    public static void main(String[] args) {
        Student s1 = new Student() ;
        s1.name = "Devashish" ;
        // s1.rno=16 ;    
        System.out.println(s1.name);
        // System.out.println(s1.percentage);
        // System.out.println(s1.rno); 
        // This line throwing error due to private access modifier 
    }    
}
