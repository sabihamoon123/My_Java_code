import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Container;
import java.awt.Font;

public class Main {
    private static JTextField nameField;
    private static JPasswordField passwordField;
    private static JButton saveButton;
    private static User user;
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Welcome To TinderLite");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(600,350,600, 400);
        Font f = new Font("Century",Font.BOLD , 20);
        Font f2 = new Font("Century", 0, 20);
        Container container = frame.getContentPane();
        container.setLayout(null);

        JOptionPane.showMessageDialog(null, "Login or Create an account to get started.", "Welcome", JOptionPane.PLAIN_MESSAGE);

        JLabel nameLabel = new JLabel("Username ");
        nameLabel.setBounds(100, 30, 400, 40);
        nameLabel.setFont(f);
        nameField = new JTextField();
        nameField.setBounds(250, 30, 300, 40);
        nameField.setFont(f2);

        JLabel passwordLabel = new JLabel("Password ");
        passwordLabel.setBounds(100, 70, 400, 40);
        passwordLabel.setFont(f);
        passwordField = new JPasswordField();
        passwordField.setFont(f);
        passwordField.setBounds(250, 70, 300, 40);
        passwordField.setEchoChar('*');

        saveButton = new JButton("Next");
        saveButton.setBounds(250, 130, 100, 30);
        saveButton.setFont(f);
        
        JButton loginButton = new JButton("Login to existing account");
        loginButton.setBounds(100, 180, 400, 30);
        loginButton.setFont(f);
        
        container.add(nameLabel);
        container.add(nameField);
        container.add(passwordLabel);
        container.add(passwordField);
        container.add(saveButton);
        container.add(loginButton);

        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String password = new String(passwordField.getPassword());

                if (name.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please enter an Username and Password.");
                } else {
                    user = new User(name, password);
                    user.save();
                    JOptionPane.showMessageDialog(frame, "User created successfully!");
                    CreatingProfile creatingProfile = new CreatingProfile();
                    creatingProfile.open();
                    frame.dispose();
                }
            }
        });

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Login login = new Login();
                login.login();
                frame.dispose();
            }
        });
        frame.setVisible(true);
    }
}