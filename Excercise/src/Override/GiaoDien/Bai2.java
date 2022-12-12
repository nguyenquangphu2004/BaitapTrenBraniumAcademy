package Override.GiaoDien;

import javax.swing.*;
import java.awt.*;

public class Bai2 extends JFrame {
    private int width;
    private int height;
    public Bai2(String title,int width,int height) {
        this.width = width;
        this.height = height;
        this.setTitle(title);
        this.setSize(width,height);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);

    }

    @Override
    public void paint(Graphics g) {
        var g2d = (Graphics2D)g;
        g2d.setStroke(new BasicStroke(6));
        g.setColor(Color.red);
        g.drawOval(100,100,300,300);
        g.fillOval(100,100,300,300);
        drawRect(g);
        circle(g);
    }
    public void drawRect(Graphics g) {
        g.setColor(Color.blue);
        g.drawRoundRect(150,150,200,200,8,8);
        g.fillRoundRect(150,150,200,200,8,8);
    }
    public void circle(Graphics g) {
        g.setColor(Color.yellow);
        g.drawOval(170,170,160 ,160);
        g.fillOval(170,170,160,160);
    }

    public static void main(String[] args) {
        Bai2 jFrame = new Bai2("Nguyễn Quang Phú",500,500);
        jFrame.setVisible(true);
        jFrame.setPreferredSize(new Dimension(500,500));
        jFrame.setBackground(Color.YELLOW);
        jFrame.pack();
    }
}
