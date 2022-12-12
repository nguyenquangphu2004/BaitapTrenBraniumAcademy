package Override.GiaoDien;

import javax.swing.*;
import java.awt.*;

// Ve duong tron
public class Bai1 extends JFrame {
    private int width;
    private int height;

    public Bai1(String title,int width,int height) {
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
        g2d.setStroke(new BasicStroke(9));
        g.setColor(Color.red);
        g.drawOval(100, 100,300,300);
        g.fillOval(100,100,300,300);
        drawPolygon1(g);
        drawPolygon2(g);

    }

    public void drawPolygon1 (Graphics g){
        int[] x = new int[] {250,100,400};
        int[] y = new int[] {100,250,250};
        var g2d = (Graphics2D)g;
        g2d.setStroke(new BasicStroke(5));
        g.setColor(Color.green);
        g.drawPolygon(x,y,3);
        g.fillPolygon(x,y,3);
    }
    public void drawPolygon2 (Graphics g){
        int[] x = new int[] {250,100,400};
        int[] y = new int[] {400,250,250};
        var g2d = (Graphics2D)g;
        g2d.setStroke(new BasicStroke(4));
        g.setColor(Color.blue);
        g.drawPolygon(x,y,3);
        g.fillPolygon(x,y,3);
    }

    public static void main(String[] args) {
        Bai1 a = new Bai1("hihi",500,500);
        a.setBackground(Color.red);
        a.setVisible(true);

    }
}
