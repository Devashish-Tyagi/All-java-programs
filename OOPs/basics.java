package OOPs;

public class basics {
    public static class Student{
        String name ;
        int roNo ;
        double percentage ;
    } 

    public static void change(Student s){
        s.name = "Krishna" ;
    }
    public static void main(String[] args) {
        Student s1 = new Student() ;
        s1.name = "Devashish" ;
        s1.roNo =16 ;
        s1.percentage =85 ;

        System.out.println("My name is "+s1.name+" and My roll number is "+s1.roNo);
        
        
        //  Classes are passed by reference 
        
        change(s1);
        System.out.println(s1.name);

    }
    
}
