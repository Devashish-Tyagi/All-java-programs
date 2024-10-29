package OOPs;

import java.sql.Struct;
// linked to student class file

public class getterandSetter {
    public static void main(String[] args) {
        Student s1 =new Student() ;
        s1.name = "Devashish" ;
        s1.percentage =85.5 ;
        // s1.rno =16;  // we cannot get this due to priavate modifier

        System.out.println(s1.name);    // allowed 
        // System.out.println(s1.rno);  // not allowed in getter and setter 
        System.out.println(s1.getrno());   // Default 0

        s1.setrno(16);
        System.out.println(s1.getrno());

        System.out.println(s1.getnumberofgf());    // default 0
        s1.setnumberofgf(1);       
        System.out.println(s1.getnumberofgf());     
        
    
    }
    
    }
    
