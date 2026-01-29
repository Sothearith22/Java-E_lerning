import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class HeartFrames {
    public static void main(String[] args) throws InterruptedException {
        int n = 100; // number of frames
        int frameWidth = 300;
        int frameHeight = 125;

        int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
        int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;

        int scale = 35;
        int offsetX = screenWidth / 2;
        int offsetY = screenHeight / 2;

        for (int i = 0; i < n; i++) {
            if (i >= 48 && i <= 55) continue;

            final int frameNumber = i + 1;  // Effectively final for lambda use
            double t = i * (2 * Math.PI / n);

            // Heart-shaped coordinates
            int x = (int) (16 * Math.pow(Math.sin(t), 3) * scale) + offsetX - frameWidth / 2;
            int y = (int) ((13 * Math.cos(t) - 5 * Math.cos(2 * t) - 2 * Math.cos(3 * t) - Math.cos(4 * t)) * -scale)
                    + offsetY - frameHeight / 2;

            final int finalX = x;  // Make coordinates final for lambda
            final int finalY = y;

            SwingUtilities.invokeLater(() -> {
                JFrame frame = new JFrame("Ily " + frameNumber);
                frame.setSize(frameWidth, frameHeight);
                frame.setLayout(new GridLayout());

                JLabel l = new JLabel("I Love You");
                l.setFont(new Font("Arial", Font.BOLD, 35));
                l.setHorizontalAlignment(SwingConstants.CENTER);
                l.setForeground(Color.WHITE);
                frame.add(l);

                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                // Random background color
                float r = (float) Math.random();
                float g = (float) Math.random();
                float b = (float) Math.random();
                frame.getContentPane().setBackground(new Color(r, g, b));

                frame.setLocation(finalX, finalY);
                frame.setVisible(true);
            });

            Thread.sleep(100);
        }
    }

    public static class Scope {
        public static void main(String[] args){
            float a = 2.1f;
            float b=5.1f;
                double c=Math.sqrt(a*a+b*b);
                System.out.println("The Value of C = " + c);
        }
    }

    static class Test {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter limit N: ");

            int N = scanner.nextInt();
            // Find cube root of N-1, because we need n^3 < N
            int n = (int) Math.cbrt(N - 1);
            if (n % 2 != 0) {
                n--;
            }
            System.out.println("Largest even n such that n^3 < " + N + " is: " + n);
            System.out.println(n + "^3 = " + (int) Math.pow(n, 3));

            scanner.close();
        }
    }
}