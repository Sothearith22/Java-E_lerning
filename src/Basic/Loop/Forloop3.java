package Basic.Loop;

public class Forloop3 {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            if (i == 1)
                continue;

            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break ;  // now label exists
                }
                System.out.println(i + " " + j);
            }
        }

    }
}
