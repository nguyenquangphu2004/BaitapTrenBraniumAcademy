package Override.GiaoDien;

import javax.swing.*;
import java.awt.*;

public class Bai3 extends JFrame {
    private int width;
    private int height;
    public Bai3(String title,int width,int height) {
        this.setTitle(title);
        this.setSize(width,height);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        var g2d = (Graphics2D)g;
        g2d.setStroke(new BasicStroke(4));
        g.setColor(Color.blue);


    }
    public void drawLine1(Graphics g) {

        g.drawLine(250,0,250,500);
    }
    public void drawLine2(Graphics g) {

        g.drawLine(0,250,500,250);
    }

    public static void main(String[] args) {
        String title = "Nguyen Quang Phu";
        int width = 630;
        int height = 530;
        Bai3 bai3 = new Bai3(title,width,height);
        bai3.setVisible(true);

    }
}
