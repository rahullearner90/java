import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class StudentResumeForm extends JFrame {
private JTextField nameField;
private JTextField emailField;
private JTextArea commentsArea;
public StudentResumeForm() {
setTitle("Student Resume Form");
setSize(400, 300);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
createForm();
}
private void createForm() {
JPanel panel = new JPanel();
panel.setLayout(new GridLayout(4, 2));
JLabel nameLabel = new JLabel("Name:");
JLabel emailLabel = new JLabel("Email:");
JLabel commentsLabel = new JLabel("Additional Comments:");
nameField = new JTextField();
emailField = new JTextField();
commentsArea = new JTextArea();
JScrollPane scrollPane = new JScrollPane(commentsArea);
JButton submitButton = new JButton("Submit");
submitButton.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
submitResume();
}
});
panel.add(nameLabel);
panel.add(nameField);
panel.add(emailLabel);
panel.add(emailField);
panel.add(commentsLabel);
panel.add(scrollPane);
panel.add(new JLabel()); // Placeholder
panel.add(submitButton);
setLayout(new BorderLayout());
add(panel, BorderLayout.CENTER);
}
private void submitResume() {
String name = nameField.getText();
String email = emailField.getText();
String comments = commentsArea.getText();
String message = "Name: " + name + "\nEmail: " + email + "\nComments: " + comments;
JOptionPane.showMessageDialog(this, message, "Resume Submitted",
JOptionPane.INFORMATION_MESSAGE);
nameField.setText("");
emailField.setText("");
commentsArea.setText("");
}
public static void main(String[] args) {
SwingUtilities.invokeLater(new Runnable() {
@Override
public void run() {
new StudentResumeForm().setVisible(true);
}
});
}
}
public class practical5swing {
    
}
