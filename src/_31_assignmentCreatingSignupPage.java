// Create a signup page with fields name, username, email, password, gender, current semester, & a submit button. When user clicks on submit button all values should be saved in a file "user_detail.txt".

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;

public class _31_assignmentCreatingSignupPage {
    public static void main(String[] args) {


       JFrame frame = new JFrame();
        frame.setLayout(null);
       frame.setSize(950,1000);
       frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


       Border border = BorderFactory.createLineBorder(Color.black,3,true);
        JPanel cardPanel = new JPanel();
        cardPanel.setBackground(Color.LIGHT_GRAY);
        cardPanel.setBounds(100,50,700,700);
        cardPanel.setBorder(border);

        JPanel panelNav = new JPanel();
        panelNav.setSize(700,100);
        panelNav.setBackground(new Color(200,20,25));
//        panelNav.setBounds(20,0,700,100);




        JLabel labelTitle = new JLabel("--------------| Sign Up |--------------");
        labelTitle.setFont(new Font("Helvetica",Font.BOLD,40));


        JTextField textFieldName = new JTextField();
        Border borderText = BorderFactory.createLineBorder(Color.BLACK,1,true);
                    textFieldName.setText("Enter");


        textFieldName.setColumns(25);
        textFieldName.setFont(new Font("Helvetica",Font.BOLD,20));
        textFieldName.setBackground(Color.red);
        textFieldName.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(textFieldName.getText().equals("Enter")){
                    textFieldName.setText("");
                    textFieldName.setBackground(Color.GREEN);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });






        textFieldName.setBorder(borderText);
        textFieldName.setBounds(10,120,500,30);




        JTextField textFieldUsername = new JTextField();
        textFieldUsername.setText("Enter");


        textFieldUsername.setColumns(25);
        textFieldUsername.setFont(new Font("Helvetica",Font.BOLD,20));
        textFieldUsername.setBackground(Color.red);
        textFieldUsername.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(textFieldUsername.getText().equals("Enter")){
                    textFieldUsername.setText("");
                    textFieldUsername.setBackground(Color.GREEN);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });






        textFieldUsername.setBorder(borderText);
        textFieldUsername.setBounds(10,170,500,30);


        JTextField textFieldEmail = new JTextField();
        textFieldEmail.setText("Enter");


        textFieldEmail.setColumns(25);
        textFieldEmail.setFont(new Font("Helvetica",Font.BOLD,20));
        textFieldEmail.setBackground(Color.red);
        textFieldEmail.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(textFieldEmail.getText().equals("Enter")){
                    textFieldEmail.setText("");
                    textFieldEmail.setBackground(Color.GREEN);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });






        textFieldEmail.setBorder(borderText);
        textFieldEmail.setBounds(10,200,500,30);





        JTextField textFieldPassword = new JTextField();
        textFieldPassword.setText("Enter");


        textFieldPassword.setColumns(25);
        textFieldPassword.setFont(new Font("Helvetica",Font.BOLD,20));
        textFieldPassword.setBackground(Color.red);
        textFieldPassword.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(textFieldPassword.getText().equals("Enter")){
                    textFieldPassword.setText("");
                    textFieldPassword.setBackground(Color.GREEN);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });






        textFieldPassword.setBorder(borderText);
        textFieldPassword.setBounds(10,250,500,30);



        JButton buttonName3 = new JButton("Submit");
        buttonName3.setBackground(Color.cyan);
        buttonName3.setBounds(350,500,100,30);
        buttonName3.setBorder(new LineBorder(null,1,true));





        //------------------------ADDER------------------------//

        cardPanel.setLayout(null);
        cardPanel.add(panelNav);

        cardPanel.add(textFieldName);
        cardPanel.add(textFieldUsername);
        cardPanel.add(textFieldPassword);
        cardPanel.add(textFieldEmail);
        cardPanel.add(buttonName3);
        panelNav.add(labelTitle);
        frame.add(cardPanel);
       frame.setVisible(true);

    }
}
























//        JFrame frame = new JFrame();
//        frame.setSize(700, 800);  // Instead of this you can use:
//        // frame.pack();  this will auto adjust the window according to the components present in the window.
//
//
//        frame.setTitle(">>  Sign up <<");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setResizable(true);
//        // frame.setBackground(Color.BLUE);  => from what i understand is this didn't worked because (actually it did but it applied to the frame or to the part which is not visible) but when we do
//        // frame.getContentPane().setBackground(Color.blue) it targets the visible or frontal part that user can see.
//        // But when using a label you must toggle setOpacity to true inorder to display the background color because the label, by default takes as much space as possible like whole page if possible
//        // And it also changes the space it takes if we change the size of the page.
//        // By default, label follows Border layout. meaning it can be controlled by right, left, top, bottom, and center.
//        // to set a border you have to create a border class like this:
//        /*
//        * Border border = BorderFactory.createLineBorder(Color.BLUE, 2);
//        * label.setBorder(border);
//        * You can set the label anywhere you want by label.setVertical or setHorizontalAlignment (Jlabel.CENTER);
//        * */
//
//
//        // to change the icon you have to import image class and create a instance of image class and then set imageIcon
//        // The things that we add i frames is known as a components.
//        // ImageIcon icon = new ImageIcon("asmt.jpg");
//        // frame.setIconImage(icon.getImage());
////
////        JLabel label = new JLabel("This is a label");
////        label.setSize(200,300);
////        label.setHorizontalAlignment(JLabel.CENTER);
////        label.setVerticalAlignment(JLabel.TOP);
////        label.setFont(new Font("Helvetica",Font.BOLD,20));
////
////        // If you are using no layout method then you must set bounds manually inorder to manage the componentes in the Panel, frame.
////        frame.add(label);
//
//        // Now lets talk about Panels
//        // Panels are similar to divs and frame. Frame are the windows but panels are the area we can create to insert components to.
//
//        Border border = BorderFactory.createLineBorder(Color.GREEN,10,true);
//        JPanel blackpanel = new JPanel();
//        blackpanel.setBackground(Color.black);
//        blackpanel.setBounds(0,0,200,250);
//
//        JPanel redPanel = new JPanel();
//        redPanel.setBounds(0,250,200,200);
//        redPanel.setBackground(Color.RED);
//        redPanel.setBorder(border);
//
//
//
//
//
//
//
//        frame.setLayout(null);
//        frame.add(blackpanel);
//        frame.add(redPanel);