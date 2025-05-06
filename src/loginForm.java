import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Page");
        frame.setSize(1200, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        Border borderPanel = BorderFactory.createLineBorder(Color.black,1,true);
        Border borderText = BorderFactory.createLineBorder(Color.gray,2,true);

        JPanel panel = new JPanel();
        panel.setBounds(380, 25, 380, 320);
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setBorder(borderPanel);
        panel.setLayout(null);


        JLabel titleLabel = new JLabel("Login");
        titleLabel.setFont(new Font("Lucida Sans", Font.BOLD, 28));
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setBounds(140, 20, 120, 40);
        panel.add(titleLabel);

        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setFont(new Font("Lucida Sans", Font.PLAIN, 16));
        usernameLabel.setForeground(Color.WHITE);
        usernameLabel.setBounds(40, 80, 100, 25);
        panel.add(usernameLabel);

        JTextField usernameField = new JTextField();
        usernameField.setFont(new Font("Lucida Sans", Font.PLAIN, 16));
        usernameField.setBounds(150, 80, 180, 25);
        usernameField.setBorder(borderText);
        panel.add(usernameField);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setFont(new Font("Lucida Sans", Font.PLAIN, 16));
        emailLabel.setForeground(Color.WHITE);
        emailLabel.setBounds(40, 120, 100, 25);
        panel.add(emailLabel);

        JTextField emailField = new JTextField();
        emailField.setFont(new Font("Lucida Sans", Font.PLAIN, 16));
        emailField.setBounds(150, 120, 180, 25);
        usernameField.setBorder(borderText);
        panel.add(emailField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Lucida Sans", Font.PLAIN, 16));
        passwordLabel.setForeground(Color.WHITE);
        passwordLabel.setBounds(40, 160, 100, 25);
        panel.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setFont(new Font("Lucida Sans", Font.PLAIN, 16));
        passwordField.setBounds(150, 160, 180, 25);
        usernameField.setBorder(borderText);
        panel.add(passwordField);

        JCheckBox rememberMe = new JCheckBox("Remember Me");
        rememberMe.setFont(new Font("Lucida Sans", Font.PLAIN, 14));
        rememberMe.setForeground(Color.WHITE);
        rememberMe.setBackground(Color.LIGHT_GRAY);
        rememberMe.setBounds(150, 195, 130, 20);
        usernameField.setBorder(borderText);
        panel.add(rememberMe);

        JButton loginButton = new JButton("Login");
        loginButton.setFont(new Font("Lucida Sans", Font.BOLD, 16));
        loginButton.setBounds(150, 225, 100, 30);
        panel.add(loginButton);

        JLabel forgotLabel = new JLabel("Forgot Password?");
        forgotLabel.setFont(new Font("Lucida Sans", Font.PLAIN, 12));
        forgotLabel.setForeground(Color.WHITE);
        forgotLabel.setBounds(150, 260, 120, 20);
        panel.add(forgotLabel);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add your login logic here
                String username = usernameField.getText();
                String email = emailField.getText();
                String password = new String(passwordField.getPassword());
                boolean remember = rememberMe.isSelected();

                if (!username.isEmpty() && !email.isEmpty() && !password.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Login Successful!");
                    usernameField.setText(" ");
                    emailField.setText("");
                    passwordField.setText("");
                } else {
                    JOptionPane.showMessageDialog(frame, "Please fill all fields.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });



        frame.add(panel);
        frame.setVisible(true);
    }
}
