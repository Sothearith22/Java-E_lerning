package Basic.Arrays;

import java.util.Scanner;

public class InputArrSize {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter Arrays Size : ");
        int size = cin.nextInt();

        int arr[] = new int[size];

        System.out.print("Enter arrays elements : ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = cin.nextInt();
            System.out.print("Arrays elements are : ");
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        cin.close();
    }
}