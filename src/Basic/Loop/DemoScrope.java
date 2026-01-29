package Basic.Loop;

public class DemoScrope {
    public static void main(String[] args){
        int x;
        x =9;
        if(x==9){
            int y=10;
           // System.out.println("x and y "+x+" "+y);
            System.out.println("The value of x : "+x);
            System.out.println("The value of Y : "+y);
            x = y*3;
        }
        //y                 //Error because u here unknown out of y scope
        System.out.println("Value total of x = "+x);
    }
}
