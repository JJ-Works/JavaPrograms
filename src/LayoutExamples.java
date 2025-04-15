// Layout is the user-interface, it defines the components that is added it the layout. In swing there are different layout manager and it is responsible to show the layouts. By default, it uses flow layout
// , and it also manages Box Layout, Border layout, Grid Layout, No Layout.

/*
    flowlayout -> left, right, center, leading , trailing
    box Layout => X-axis, Y-axis
    Border layout => North, south, east, west, center
    Grid layout => (rows, cols)
    No layout -> null ( X,Y,H,W)
* */

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class LayoutExamples {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Layout");

        frame.setLayout(new FlowLayout());
        frame.setSize(950, 1000);
        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");
        JButton btn3 = new JButton("Button 3");
        JButton btn4 = new JButton("Button 4");
//        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
//        frame.setLayout(new FlowLayout(FlowLayout.CENTER));

        frame.setLayout(new BorderLayout());
        frame.add(btn1,BorderLayout.CENTER);
        frame.add(btn2,BorderLayout.NORTH);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
//        frame.setResizable(false);
     frame.setVisible(true);
    }
}
