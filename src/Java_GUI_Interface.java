import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Java_GUI_Interface {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(970,1100);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);

        JLabel label =  new JLabel("Enter anything.");
        label.setSize(180,40);

        JTextArea textArea = new JTextArea();
        textArea.setPreferredSize(new Dimension(950,50));
        textArea.setRows(3);
        textArea.setBackground(Color.LIGHT_GRAY);

        textArea.setBorder(new LineBorder(Color.BLACK,1 ,true));

        JButton btn = new JButton("Click Me!👍");
        JCheckBox checkbox = new JCheckBox();
        frame.add(textArea);
        frame.add(label);
        frame.add(checkbox);
        frame.add(btn);

//        btn.addActionListener(ActionListener(){
//            @Override
//                    public void actionListener(ActionEvent e){
//                System.out.println("Hello");
//            }
//        });
//

 btn.setCursor(new Cursor(Cursor.HAND_CURSOR));

 btn.addActionListener(new ActionListener() {
 @Override
 public void actionPerformed(ActionEvent e) {

 label.setText("Buttom was clicked");
 }
 });





        JPanel panel = new JPanel();
        panel.setSize(new Dimension(950,100));



        JLabel label1 = new JLabel("This is a label.");
        panel.add(label1);


        frame.setVisible(true);

    }
}
