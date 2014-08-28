
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;
 
/**
 *
 * @author Igor Novikov
 */
public class Main {
 
    public static final double WIDTH = 400;
 
    public static final double HEIGHT = 400;
 
    public static void main(String[] args) {
        new GraphFrame().setVisible(true);
    }
 
}
 
class GraphFrame extends JFrame {
 
    public GraphFrame() {
        super();
        setBounds(200, 200, (int) Main.WIDTH, (int) Main.HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(new GraphPanel());
    }
 
}
 
class GraphPanel extends JPanel {
 
    private static final double SCALE_X = 20;
 
    private static final double SCALE_Y = 15;
 
    public GraphPanel() {
        super();
    }
 
    @Override
    public void paint(Graphics grphcs) {
        super.paint(grphcs);
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        drawGraph(g2);
    }
 
    private void drawGraph(Graphics2D g2) {
        double lastX = 0;
        double lastY1 = Main.HEIGHT / 2;
        double lastY2 = Main.HEIGHT / 2;
        double lastY3 = Main.HEIGHT / 2;
        for (int x = 1; x <= Main.WIDTH; x++) {
            double y1 = Main.HEIGHT / 2 - func1(x / SCALE_X) * SCALE_Y;
            double y2 = Main.HEIGHT / 2 - func2(x / SCALE_X) * SCALE_Y;
            double y3 = Main.HEIGHT / 2 - func3(x / SCALE_X) * SCALE_Y;
            g2.drawLine((int)lastX, (int)lastY1, (int)x, (int)y1);
            g2.drawLine((int)lastX, (int)lastY2, (int)x, (int)y2);
            g2.drawLine((int)lastX, (int)lastY3, (int)x, (int)y3);
            lastX = x;
            lastY1 = y1;
            lastY2 = y2;
            lastY3 = y3;
        }
    }
 
    private double func1(double x) {
        return 10 * Math.exp(-x / 2) * Math.cos(3 * x);
    }
 
    private double func2(double x) {
        return 10 * Math.exp(-x / 2);
    }
 
    private double func3(double x) {
        return -10 * Math.exp(-x / 2);
    }
}
