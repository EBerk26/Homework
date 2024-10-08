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

        JPanel mainPanel = new JPanel(new GridLayout(2,1));
        JPanel bigTop = new JPanel(new GridLayout(1,2));
        JPanel topLeftGrid = new JPanel(new GridLayout(3,3));
        JPanel topRight = new JPanel(new GridLayout(2,1));
        JPanel bottomLine = new JPanel(new GridLayout(1,9));
        JPanel largerBottomPanel = new JPanel(new BorderLayout());

        frame.add(mainPanel);
        mainPanel.add(bigTop);
        mainPanel.add(largerBottomPanel);
        bigTop.add(topLeftGrid);
        bigTop.add(topRight);
        largerBottomPanel.add(bottomLine, BorderLayout.SOUTH);


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

        JLabel topRightLabel = new JLabel("TopRight");
        topRightLabel.setHorizontalAlignment(SwingConstants.CENTER);
        topRight.add(topRightLabel);

        JButton topRightButton = new JButton("1");
        topRightButton.setHorizontalAlignment(SwingConstants.CENTER);
        topRight.add(topRightButton);

        JLabel[] label0 = new JLabel[6];
        for(int x =1;x<=5;x++){
            label0[x] = new JLabel("0");
            label0[x].setHorizontalAlignment(SwingConstants.CENTER);
        }
        JButton[] bottomButton = new JButton[5];
        for(int x =1;x<=4;x++){
            bottomButton[x] = new JButton(String.valueOf(x));
            bottomButton[x].setHorizontalAlignment(SwingConstants.CENTER);
        }
        for(int x=1;x<=4; x++){
            bottomLine.add(label0[x]);
            bottomLine.add(bottomButton[x]);
        }
        bottomLine.add(label0[5]);

        //TODO: add file edit and help drop down menus
    }
}
