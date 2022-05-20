import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.util.EventListener;

public class Main extends JFrame implements ActionListener {
    CardLayout card;
Container pane;
    Main() {
        JFrame frame = new JFrame("Click");
        setSize(510, 540);
        pane = getContentPane();
        card = new CardLayout();
        pane.setLayout(card);
        pane.add("1", new DefaultPanel(this));
        pane.add("2", new PaintPanel(this));
        pane.add("3", new ButtonPanel());

        setContentPane(new DefaultPanel(this));
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        card.next(pane);
    }
}