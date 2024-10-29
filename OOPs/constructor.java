package OOPs;

//   Linked to cars class file
public class constructor {
    public static void main(String[] args) {
        cars c1 = new cars("Fortuner", 2755, "Black") ;
        System.out.println(c1.name);
        System.out.println(c1.cc);
        System.out.println(c1.color);
        // c1.destiny = "What will happen" ; // line giving error  because destiny is already set by admin(final)
        System.out.println(c1.destiny);
    }

}
