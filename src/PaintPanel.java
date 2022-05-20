import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PaintPanel extends JPanel {

    //    private static final int DEFAULT_WIDTH = 510;
//    private static final int DEFAULT_HEIGHT = 540;
    private final Color BACK_COLOR = Color.WHITE;

    private int x1, y1, x2, y2;
    private Graphics g;

    public PaintPanel(ActionListener listener) {
        JButton exit = new JButton("exit");
        exit.setBounds(0, 0, 100, 100);
        exit.addActionListener(listener);
        add(exit);
        setBackground(BACK_COLOR);
//        setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));

        MyMouseHandler handler = new MyMouseHandler();

        this.addMouseListener(handler);
        this.addMouseMotionListener(handler);
    }

    private class MyMouseHandler extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            x1 = e.getX();
            y1 = e.getY();

            g = getGraphics();

            x2 = x1;
            y2 = y1;
        }

        public void mouseDragged(MouseEvent e) {
            x1 = e.getX();
            y1 = e.getY();

            g.drawLine(x1, y1, x2, y2);

            x2 = x1;
            y2 = y1;
        }
    }}
