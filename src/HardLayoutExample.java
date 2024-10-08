import javax.swing.*;
import java.awt.*;

public class HardLayoutExample {
    public static void main(String[] args) {
        new HardLayoutExample();
    }
    public HardLayoutExample() {


        JLabel[] top0 = new JLabel[6];
        for (int x =0;x<=5;x++){
            top0[x] = new JLabel("Top 0");
            top0[x].setHorizontalAlignment(SwingConstants.CENTER);

        }

        JFrame frame = new JFrame("Optional Example");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(700,800);


        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel bigTop = new JPanel(new GridLayout(1,2));

        JPanel topLeftGrid = new JPanel(new GridLayout(3,3));
        bigTop.setPreferredSize(new Dimension(700,400));
        JPanel topRight = new JPanel(new GridLayout(2,1));
        JPanel bottom = new JPanel(new GridLayout(1,9));

        frame.add(mainPanel);
        mainPanel.add(bigTop,BorderLayout.NORTH);
        bigTop.setSize(700,200);
        bigTop.add(topLeftGrid);
        bigTop.add(topRight);
        mainPanel.add(bottom,BorderLayout.SOUTH);

        JButton[] topButtons = new JButton[5];
        for(int x =1;x<=4;x++){
            topButtons[x] = new JButton("Top "+x);
            topButtons[x].setHorizontalAlignment(SwingConstants.CENTER);
        }

        for(int x = 1;x<=4;x++){
            topLeftGrid.add(top0[x]);
            topLeftGrid.add(topButtons[x]);
        }
        topLeftGrid.add(top0[5]);

    }
}
