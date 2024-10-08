import javax.swing.*;
import java.awt.*;
import java.awt.GridLayout;

public class BorderInsideGrid {
    JButton button[] = new JButton[11];
    public static void main(String[] args) {
        new BorderInsideGrid();
    }
    public BorderInsideGrid() {
        JFrame frame = new JFrame("Border Inside Grid");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(700,400);

        JPanel mainPanel = new JPanel(new GridLayout(3,3));
        frame.add(mainPanel);

        for(int x = 1; x<=10; x++){
            button[x]=new JButton("Button "+x);
        }
        for(int x = 1; x<=4; x++){
            mainPanel.add(button[x]);
        }

        JPanel miniPanel = new JPanel(new BorderLayout());
        mainPanel.add(miniPanel);

        for(int x =5;x<=8;x++){
            mainPanel.add(button[x]);
        }
        JLabel label = new JLabel("label");
        label.setHorizontalAlignment(SwingConstants.CENTER);

        miniPanel.add(label,BorderLayout.CENTER);
        miniPanel.add(button[9],BorderLayout.EAST);
        miniPanel.add(button[10],BorderLayout.SOUTH);


    }
}
