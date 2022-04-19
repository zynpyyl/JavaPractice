package selfStudy;

public class ex5 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
     //   byte c = a + b; //compile error
        int d = a + b;

        System.out.println("-------------------");


        int x = 10;
        //post increment: use it first, then increase
        System.out.println( x++ );     //10
        System.out.println( x );       //11
        //post decrement: use it first, then decrease
        System.out.println( x-- );     //11
        System.out.println( x );       //10




    }
}
