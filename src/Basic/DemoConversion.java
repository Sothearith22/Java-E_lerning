package Basic;
// Demonstration  conversion between integer to byte ,double to byte and double to integer
public class DemoConversion {
    public static void main(String[] args){
        byte b;
        int i = 234;
        double d = 123.456;
        b=(byte)i;
        System.out.println("Conversion of integer to byte .");
        System.out.println("the value of i and b " + i +"and"+b);
        b=(byte) d;
        System.out.println(" Conversion of Double to byte. ");
        System.out.println("the value of b and d " + b +"and"+d);
        i=(int)d;
        System.out.println(" Conversion of double to integer. " );
        System.out.println("d and i"+ d + "and" + i);
    }
}
