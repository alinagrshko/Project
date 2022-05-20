import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DefaultPanel extends JPanel {
    DefaultPanel(ActionListener listener) {
        setLayout(null);
        JButton but1 = new JButton();
        but1.setBackground(new

                Color(255, 228, 225));
        but1.setBounds(0, 0, 250, 250);
        add(but1);
        but1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                removeAll();
                JPanel panel = new PaintPanel(listener);
                panel.setSize(510, 540);
                add(panel);
                repaint();
            }
        });


        JButton but2 = new JButton();
        but2.setBackground(new

                Color(230, 230, 250));
        but2.setBounds(250, 0, 250, 250);
        add(but2);
        but2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                removeAll();
                ButtonPanel panel = new ButtonPanel();
                panel.setSize(new Dimension(500, 500));
                add(panel);
                repaint();

            }
        });

        JButton but3 = new JButton();
        but3.setBackground(new

                Color(205, 240, 255));
        but3.setBounds(0, 250, 250, 250);
        add(but3);

        JButton but4 = new JButton();
        but4.setBackground(new

                Color(255, 245, 238));
        but4.setBounds(250, 250, 250, 250);
        add(but4);
    }
}
