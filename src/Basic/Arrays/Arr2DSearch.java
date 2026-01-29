package Basic.Arrays;

import java.util.Scanner;

public class Arr2DSearch {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int _key;
        boolean b = false;

        System.out.println("Search Arrays = ");
        _key = cin.nextInt();
        int numbers[][] = {{20,30,40,50},{100,200,300,400},{500,600,700,800}};
        for(int i=0; i<3 ; i++ ){
            for(int j=0 ; j<4 ; j++){
                if(_key == numbers[i][j]){
                    b = true;
                }
            }
        }
        if( b == true ){
            System.out.println("Value Founded");
        }
        else{
            System.err.println("Could not be found");
        }
    }
}
