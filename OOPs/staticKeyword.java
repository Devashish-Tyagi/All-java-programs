package OOPs;

// linked to person
public class staticKeyword {
    public static void main(String[] args) {

        person p1 = new person("Devashish", "Good", 69) ;
        System.out.println(p1.noOfPerson);
        person p2 =new person("Dev ", "Very good", 69);
        System.out.println(p2.noOfPerson);

        person p3 = new person("User", "Unknown", 75) ;
        // static is a shared property of class and object
        // access through class name  
        System.out.println(person.noOfPerson);


        
    }
    
}
