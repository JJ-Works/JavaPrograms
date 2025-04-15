// Create a signup page with fields name, username, email, password, gender, current semester, & a submit button. When user clicks on submit button all values should be saved in a file "user_detail.txt".

import javax.swing.*;
import java.awt.*;

public class _31_assignmentCreatingSignupPage {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(700, 800);
        frame.setTitle(">>  Sign up <<");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        // frame.setBackground(Color.BLUE);  => from what i understand is this didn't worked because (actually it did but it applied to the frame or to the part which is not visible) but when we do
        // frame.getContentPane().setBackground(Color.blue) it targets the visible or frontal part that user can see.
        // But when using a label you must toggle setOpacity to true inorder to display the background color because the label, by default takes as much space as possible like whole page if possible
        // And it also changes the space it takes if we change the size of the page.
        // By default, label follows Border layout. meaning it can be controlled by right, left, top, bottom, and center.
        // to set a border you have to create a border class like this:
        /*
        * Border border = BorderFactory.createLineBorder(Color.BLUE, 2);
        * label.setBorder(border);
        * */


        // to change the icon you have to import image class and create a instance of image class and then set imageIcon
        // The things that we add i frames is known as a components.
        // ImageIcon icon = new ImageIcon("asmt.jpg");
        // frame.setIconImage(icon.getImage());

        JTextField nameField = new JTextField("Enter anything here");
        nameField.setSize(300, 80);
        nameField.setLayout(new FlowLayout(FlowLayout.CENTER));


        frame.add(nameField);

        frame.setVisible(true);
    }
}