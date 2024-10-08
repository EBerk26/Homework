import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;

class BorderLayoutExample implements ActionListener{
    JButton[] button = new JButton[20];
    Dimension dimension = new Dimension();
    public static void main(String[] args) {
        new BorderLayoutExample();
    }
    BorderLayoutExample() {
        dimension.width = 700;
        dimension.height = 400;
        JFrame frame = new JFrame();
        frame.setSize(700,400);
        frame.setMinimumSize(dimension);
        frame.setMaximumSize(dimension);

        JPanel panel = new JPanel();
        panel.setLayout(new java.awt.BorderLayout());
        frame.add(panel);

        for(int x =1; x<=8;x++){
            button[x]=new JButton("Button "+x);
        }

        panel.add(button[1],BorderLayout.NORTH);
        panel.add(button[2],BorderLayout.EAST);
        panel.add(button[3],BorderLayout.SOUTH);
        panel.add(button[4],BorderLayout.WEST);
        panel.add(button[5],BorderLayout.CENTER);


        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
