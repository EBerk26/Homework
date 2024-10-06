import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GridLayoutExample implements ActionListener{
    JButton[] button = new JButton[7];
        Dimension dimension = new Dimension();
        public static void main(String[] args) {
            new GridLayoutExample();
        }
        GridLayoutExample() {
            dimension.width = 700;
            dimension.height = 400;
            JFrame frame = new JFrame();
            frame.setSize(700,400);
            frame.setMinimumSize(dimension);
            frame.setMaximumSize(dimension);

            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(2,3));
            frame.add(panel);

            for(int x =1; x<=5;x++){
                button[x]=new JButton("Button "+x);
                panel.add(button[x]);
            }

            frame.setVisible(true);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        }
        @Override
        public void actionPerformed(ActionEvent e) {
        }
    }
