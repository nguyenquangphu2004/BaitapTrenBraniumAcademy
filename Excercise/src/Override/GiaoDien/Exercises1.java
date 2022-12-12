package Override.GiaoDien;
import javax.swing.*;
import java.awt.*;

public class Exercises1 extends JFrame {
    private final int x;
    private final int y;
    private final int width;
    private final int height;
    private final Color color;

    public Exercises1(int x, int y,
                      int width, int height,
                      Color color
    ) throws HeadlessException {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);
        setTitle("Triangles Inside Circle");
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(color);
        g.fillOval(x - width/2,
                y-height/2, width, height);
        Polygon polygon = new Polygon(
                new int[]{x, x-width/2, x+width/2},
                new int[]{y - height/2, y, y},
                3);
        g.setColor(Color.green);
        g.fillPolygon(polygon);
        g.setColor(Color.blue);
        g.fillPolygon(new Polygon(
                new int[]{x, x-width/2, x+width/2},
                new int[]{y + height/2, y, y},
                3));
    }

    public static void main(String[] args) {
        int x = 200;
        int y = 200;
        int width = 300;
        int height = 300;
        Color color = Color.RED;
        new Exercises1(x, y, width, height, color);
    }
}