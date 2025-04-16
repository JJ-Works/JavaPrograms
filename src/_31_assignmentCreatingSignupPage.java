// Create a signup page with fields name, username, email, password, gender, current semester, & a submit button. When user clicks on submit button all values should be saved in a file "user_detail.txt".

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;

public class _31_assignmentCreatingSignupPage {
    public static void main(String[] args) {

        //----------------Frame creation---------------------//
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(800, 1000);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    //--------------------Border Creation--------------------//
        Border border = BorderFactory.createLineBorder(Color.black, 3, true);
        JPanel cardPanel = new JPanel();
        cardPanel.setBackground(new Color(220,240,240));
        cardPanel.setBounds(100, 50, 550, 700);
        cardPanel.setBorder(border);


    //------------------Panel Creation------------------------//
        JPanel panelNav = new JPanel();
        panelNav.setSize(550, 80);
        panelNav.setBackground(new Color(200, 150, 25));


    //------------------Main Components Creation------------------//


        JLabel labelTitle = new JLabel("-----| Sign Up |-----");
        labelTitle.setFont(new Font("Impact", Font.BOLD, 45));

        //---------For name---------------//
        JLabel labelName = new JLabel();
        labelName.setText("Name: ");
        labelName.setBounds(10,100,100,30);
        labelName.setFont(new Font("Helvetica",Font.BOLD,20));
        cardPanel.add(labelName);

        JTextField textFieldName = new JTextField();
        Border borderText = BorderFactory.createLineBorder(Color.BLACK, 1, true);
        textFieldName.setText("Enter");


        textFieldName.setColumns(25);
        textFieldName.setFont(new Font("Helvetica", Font.PLAIN, 15));
        textFieldName.setBackground(Color.WHITE);
        textFieldName.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (textFieldName.getText().equals("Enter")) {
                    textFieldName.setText("");
                    textFieldName.setBackground(Color.lightGray);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });


        textFieldName.setBorder(borderText);
        textFieldName.setBounds(10, 130, 500, 30);



        //----------For userName--------------//
        JLabel labelUsername = new JLabel();
        labelUsername.setBounds(10,170,200,30);
        labelUsername.setText("Username: ");
        labelUsername.setFont(new Font("Helvetica",Font.BOLD,20));
        cardPanel.add(labelUsername);


       JTextField textFieldUsername = new JTextField();
        textFieldUsername.setText("Enter");


        textFieldUsername.setColumns(25);
        textFieldUsername.setFont(new Font("Helvetica", Font.PLAIN, 15));
        textFieldUsername.setBackground(Color.white);
        textFieldUsername.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (textFieldUsername.getText().equals("Enter")) {
                    textFieldUsername.setText("");
                    textFieldUsername.setBackground(Color.LIGHT_GRAY);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        textFieldUsername.setBorder(borderText);
        textFieldUsername.setBounds(10, 200, 500, 30);

        //---------------------For Email------------------//

        JLabel labelEmail = new JLabel();
        labelEmail.setText("Email: ");
        labelEmail.setFont(new Font("Helvetica",Font.BOLD,20));
        labelEmail.setBounds(10,240,100,30);
        cardPanel.add(labelEmail);


        JTextField textFieldEmail = new JTextField();
        textFieldEmail.setText("Enter");


        textFieldEmail.setColumns(25);
        textFieldEmail.setFont(new Font("Helvetica", Font.PLAIN, 15));
        textFieldEmail.setBackground(Color.white);
        textFieldEmail.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (textFieldEmail.getText().equals("Enter")) {
                    textFieldEmail.setText("");
                    textFieldEmail.setBackground(Color.LIGHT_GRAY);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });


        textFieldEmail.setBorder(borderText);
        textFieldEmail.setBounds(10, 270, 500, 30);

        //------------For Password-----------------//
        JLabel labelPassword = new JLabel();
        labelPassword.setText("Password: ");
        labelPassword.setFont(new Font("Helvetica",Font.BOLD,20));
        labelPassword.setBounds(10, 310, 150, 30);
        cardPanel.add(labelPassword);

        JPasswordField textFieldPassword = new JPasswordField();
        textFieldPassword.setText("Enter");


        textFieldPassword.setColumns(25);
        textFieldPassword.setFont(new Font("Helvetica", Font.PLAIN, 15));
        textFieldPassword.setBackground(Color.white);
//        textFieldPassword.addKeyListener(new KeyListener() {
//            @Override
//            public void keyTyped(KeyEvent e) {
//
//            }
//
////            @Override
////            public void keyPressed(KeyEvent e) {
////                if (textFieldPassword.getText().equals("Enter")) {
////                    textFieldPassword.setText("");
////                    textFieldPassword.setBackground(Color.GREEN);
////                }
////            }
//
//            @Override
//            public void keyReleased(KeyEvent e) {
//
//            }
//        });


        textFieldPassword.setBorder(borderText);
        textFieldPassword.setBounds(10, 340, 500, 30);

        //-------------For Gender--------------//
        JLabel labelGender = new JLabel();
        labelGender.setText("Gender:");
        labelGender.setBounds(10,380,100,30);
        labelGender.setFont(new Font("Helvetica",Font.BOLD,20));
        cardPanel.add(labelGender);

        JCheckBox checkBox = new JCheckBox();
        checkBox.setBounds(90,382,20,30);
        cardPanel.add(checkBox);
        checkBox.setBackground(new Color(220,240,240));

        JLabel labelMale = new JLabel();
        labelMale.setText("Male");
        labelMale.setFont(new Font("Helvetica",Font.BOLD,15));
        labelMale.setBounds(114,382,40,30);
        cardPanel.add(labelMale);

        JCheckBox checkBoxFem = new JCheckBox();
        checkBoxFem.setBounds(150,382,20,30);
        cardPanel.add(checkBoxFem);
        checkBoxFem.setBackground(new Color(220,240,240));

        JLabel labelFemale = new JLabel();
        labelFemale.setText("Female");
        labelFemale.setFont(new Font("Helvetica",Font.BOLD,15));
        labelFemale.setBounds(178,382,70,30);
        cardPanel.add(labelFemale);

        JCheckBox checkBoxOther = new JCheckBox();
        checkBoxOther.setBounds(237,382,20,30);
        cardPanel.add(checkBoxOther);
        checkBoxOther.setBackground(new Color(220,240,240));

        JLabel labelOthers = new JLabel();
        labelOthers.setText("Others");
        labelOthers.setFont(new Font("Helvetica",Font.BOLD,15));
        labelOthers.setBounds(260,382,70,30);
        cardPanel.add(labelOthers);






//---------------Current Semester------------------//
        JLabel labelSemester = new JLabel();
        labelSemester.setText("Semester:");
        labelSemester.setFont(new Font("Helvetica",Font.BOLD,20));
        labelSemester.setBounds(10,425,150,30);
        cardPanel.add(labelSemester);


        String[] semesters = {"Semester 1","Semester 2","Semester 3","Semester 4","Semester 5","Semester 6","Semester 7","Semester 8"};
        JComboBox<String> comboBox = new JComboBox<String>(semesters);
        comboBox.setFont(new Font("Helvetica",Font.PLAIN,20));
        comboBox.setBounds(110,428,170,30);
//
//        Border bodForSem = BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.white,1),
//        new EmptyBorder(1,1,1,1)
//    );

        Border bodForSem = BorderFactory.createLineBorder(Color.cyan,01,true);
        comboBox.setBorder(bodForSem);

        cardPanel.add(comboBox);




        JButton button = new JButton("Submit");
        button.setFont(new Font("Helvetic",Font.BOLD,30));
        button.setBackground(Color.cyan);
        button.setBounds(210, 500, 150, 60);
        button.setBorder(new LineBorder(Color.gray, 1, true));


        //------------------------ADDER------------------------//

        cardPanel.setLayout(null);
        cardPanel.add(panelNav);

        cardPanel.add(textFieldName);
        cardPanel.add(textFieldUsername);
        cardPanel.add(textFieldPassword);
        cardPanel.add(textFieldEmail);
        cardPanel.add(button);
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
/// /
/// /        JLabel label = new JLabel("This is a label");
/// /        label.setSize(200,300);
/// /        label.setHorizontalAlignment(JLabel.CENTER);
/// /        label.setVerticalAlignment(JLabel.TOP);
/// /        label.setFont(new Font("Helvetica",Font.BOLD,20));
/// /
/// /        // If you are using no layout method then you must set bounds manually inorder to manage the componentes in the Panel, frame.
/// /        frame.add(label);
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