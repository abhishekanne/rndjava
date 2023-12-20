package RndOperationsInJava;

public class ShiftOperators {
    public static void bitwiseRightShift(int i,int j){
        System.out.println("Bitwise Left Operator <<");
        System.out.println(i+">>"+j+"="+ Integer.toString(i>>j));
        System.out.println("Binary");
        System.out.println(Integer.toBinaryString(i) +" >> "+j +"\n"+Integer.toBinaryString(i>>j));

    }

    public static void bitwiseLeftShift(int i,int j){
        System.out.println("Bitwise Left Operator <<");
        System.out.println(i+"<<"+j+"="+ Integer.toString(i<<j));
        System.out.println("Binary");
        System.out.println(Integer.toBinaryString(i) +" << "+j +"\n"+Integer.toBinaryString(i<<j));

    }
    public static void main(String[] args) {
        bitwiseRightShift(0,1);
        bitwiseRightShift(10,1);
        bitwiseRightShift(10,2);
        bitwiseLeftShift(10,1);
        bitwiseLeftShift(10,2);


    }
}
