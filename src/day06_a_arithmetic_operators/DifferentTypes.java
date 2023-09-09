package day06_a_arithmetic_operators;

public class DifferentTypes {
    public static void main(String[] args) {

//both of them is int ---> int and int ---> int
        System.out.println(10-5);
        System.out.println(10*5);
        System.out.println();

//
        System.out.println(10.0 / 5);

        System.out.println(10.0 / 5.0);
        System.out.println( (int)10.0 / 5);
        System.out.println( (double)10.0 / 5);


        byte b1 = 10;
        byte b2 = 20;

        //byte sum = b1 + b2; this will not work cause the value get changes

        int sum = b1 + b2;
    }
}
