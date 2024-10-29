package OOPs;

public class Student{
    // public static class Student{ 
        String name ;
        private int rno ;
        double percentage ;
        private int numberofgf ;
    
        public int getrno(){
            return rno ;
        }

        public void setrno(int roll){
            rno = roll ;
        }
    public int getnumberofgf(){
        return numberofgf ;
    }

    public void setnumberofgf(int numberofgf){
        this.numberofgf =numberofgf ;
    }
}
