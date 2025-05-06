import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LibraryManagement {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Book Management");
        frame.setSize(1140, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel titleLabel = new JLabel("Book Management System", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 30));
        titleLabel.setBounds(0, 50, 1200, 40);
        frame.add(titleLabel);

        // New parent panel with rounded black border
        JPanel contentPanel = new JPanel();
        contentPanel.setBounds(10, 120, 1100, 560);
        contentPanel.setLayout(null);
        contentPanel.setBorder(new LineBorder(Color.BLACK, 2, true));
        frame.add(contentPanel);

        // Left Panel
        JPanel leftPanel = new JPanel();
        leftPanel.setBounds(15, 10, 400, 540);
        leftPanel.setLayout(null);

        JLabel addBookLabel = new JLabel("Add Book");
        addBookLabel.setFont(new Font("Arial", Font.BOLD, 20));
        addBookLabel.setBounds(20, 10, 200, 30);
        leftPanel.add(addBookLabel);



        JLabel bookIdLabel = new JLabel("Book ID:");
        bookIdLabel.setBounds(20, 50, 100, 25);
        JTextField bookIdField = new JTextField();
        bookIdField.setBounds(20, 75, 360, 25);

        JLabel bookNameLabel = new JLabel("Book Name:");
        bookNameLabel.setBounds(20, 110, 100, 25);
        JTextField bookNameField = new JTextField();
        bookNameField.setBounds(20, 135, 360, 25);

        JLabel bookAuthorLabel = new JLabel("Book Author:");
        bookAuthorLabel.setBounds(20, 170, 100, 25);
        JTextField bookAuthorField = new JTextField();
        bookAuthorField.setBounds(20, 195, 360, 25);

        JLabel bookGenreLabel = new JLabel("Book Genre:");
        bookGenreLabel.setBounds(20, 230, 100, 25);
        JTextField bookGenreField = new JTextField();
        bookGenreField.setBounds(20, 255, 360, 25);

        JLabel bookDescriptionLabel = new JLabel("Book Description:");
        bookDescriptionLabel.setBounds(20, 290, 150, 25);
        JTextField bookDescriptionField = new JTextField();
        bookDescriptionField.setBounds(20, 315, 360, 25);

        JButton addButton = new JButton("Add");
        addButton.setBounds(20, 350, 360, 30);
        addButton.setBorder(BorderFactory.createLineBorder(null,1,true));
        addButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        JButton viewAllButton = new JButton("View All Books");
        viewAllButton.setBounds(20, 410, 360, 30);
        viewAllButton.setCursor(new Cursor(Cursor.HAND_CURSOR));


        JButton editButton = new JButton("Edit Book");
        editButton.setBounds(20, 450, 360, 30);
        editButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        JButton deleteButton = new JButton("Delete Book");
        deleteButton.setBounds(20, 490, 360, 30);
        deleteButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        leftPanel.add(bookIdLabel);
        leftPanel.add(bookIdField);
        leftPanel.add(bookNameLabel);
        leftPanel.add(bookNameField);
        leftPanel.add(bookAuthorLabel);
        leftPanel.add(bookAuthorField);
        leftPanel.add(bookGenreLabel);
        leftPanel.add(bookGenreField);
        leftPanel.add(bookDescriptionLabel);
        leftPanel.add(bookDescriptionField);
        leftPanel.add(addButton);
        leftPanel.add(viewAllButton);
        leftPanel.add(editButton);
        leftPanel.add(deleteButton);

        JLabel inventoryLabel = new JLabel("Inventory");
        inventoryLabel.setBounds(430, 15,100, 40);
        inventoryLabel.setFont(new Font("Arial",Font.BOLD,20));

        // Right Panel inside a scroll pane
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
        JScrollPane scrollPane = new JScrollPane(rightPanel);
        scrollPane.setBounds(420, 67, 670, 465);
        scrollPane.setBorder(BorderFactory.createLineBorder(Color.black,2,true)); // Remove border from scroll pane

        contentPanel.add(inventoryLabel);
        contentPanel.add(leftPanel);
        contentPanel.add(scrollPane);

        // Add button functionality
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String bookName = bookNameField.getText().trim();
                if (!bookName.isEmpty()) {
                    JLabel bookLabel = new JLabel(bookName);
                    bookLabel.setFont(new Font("Arial", Font.PLAIN, 18));
                    bookLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
                    rightPanel.add(bookLabel);
                    rightPanel.revalidate();
                    rightPanel.repaint();
                    bookNameField.setText("");
                } else {
                    JOptionPane.showMessageDialog(frame, "Please enter a book name.");
                }
            }
        });

        frame.setVisible(true);
    }
}
