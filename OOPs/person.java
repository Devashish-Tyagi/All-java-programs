package OOPs;

// Static Keyword 

public class person {
    String name ;
    String personality ;
    int weight ;
    static int noOfPerson  ;

    public person(String naam , String vyaktitv , int M ){
        name = naam ;
        personality = vyaktitv ;
        weight = M ;
        noOfPerson ++ ;
    }
    
}
