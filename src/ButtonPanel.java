import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

class ButtonPanel extends JPanel {
        ButtonPanel(){
            this.setBackground(Color.pink) ;
            this.setLayout(null);
            JButton but = new JButton();
            but.setText("");
            but.setSize(50, 50);
           but.setBackground(new Color(new Random().nextInt(255), new Random().nextInt(255), new Random().nextInt(255)));
           but.addMouseListener(new MouseAdapter() {
               @Override
               public void mouseClicked(MouseEvent e) {
                   but.setBounds(new Random().nextInt(420), new Random().nextInt(450), 50, 50);
                   but.setBackground(new Color(new Random().nextInt(255), new Random().nextInt(255), new Random().nextInt(255)));
               }
           });
           this.add(but);
        }
}