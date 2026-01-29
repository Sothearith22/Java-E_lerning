package Basic.Loop;

public class ForLoop {
    public static void main(String[] args){
        int n, m, i;

        String[] arr = {"10", "20", "30"};

        n = Integer.parseInt(arr[0]); // n = 10
        m = Integer.parseInt(arr[1]); // m = 20

        System.out.println("The Even number Between " + n + " and " + m);

        for(i = n; i < m; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
