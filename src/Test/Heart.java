package Test;

import java.applet.Applet;
import java.awt.*;
import javax.swing.*;

public class Heart extends Applet implements Runnable {

    private int offset = 0;
    private Thread animator;

    @Override
    public void init() {
        setBackground(new Color(255, 255, 0)); // Yellow background
    }

    @Override
    public void start() {
        animator = new Thread(this);
        animator.start();
    }

    @Override
    public void stop() {
        animator = null;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.RED);

        // Left oval (top circle of heart)
        g2.fillOval(200 + offset, 0 + offset, 300, 350);

        // Right oval (top circle of heart)
        g2.fillOval(500 + offset, 0 + offset, 300, 350);

        // Bottom part (merged into a point)
        // We draw a large triangle-like shape using polygon or just rely on the two ovals overlapping properly
        int[] xPoints = {350 + offset, 650 + offset, 500 + offset};
        int[] yPoints = {300 + offset, 300 + offset, 650 + offset};
        g2.fillPolygon(xPoints, yPoints, 3);
    }

    @Override
    public void run() {
        while (Thread.currentThread() == animator) {
            offset += 2; // Move down and right
            if (offset > 400) {
                offset = 0; // Reset for looping animation
            }
            repaint(); // Request repaint

            try {
                Thread.sleep(30); // Control animation speed (~33 fps)
            } catch (InterruptedException e) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        JFrame win = new JFrame("Animated Heart");
        Heart heartApplet = new Heart();

        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setSize(1366, 768);
        win.setBackground(new Color(255, 255, 0));
        win.add(heartApplet);
        win.setVisible(true);

        heartApplet.init();
        heartApplet.start();
    }
}