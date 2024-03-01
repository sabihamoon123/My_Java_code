import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Login {
    private JTextField usernameTextField;
    private JPasswordField passwordField;

    public void login() {
        String filePath = "login_info.txt";
        String[] loginInfo = readLoginInfo(filePath);

        String savedUsername = loginInfo[0];
        String savedPassword = loginInfo[1];

        JFrame frame = new JFrame("Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setBounds(600,350,600, 400);

        Font f = new Font("Century",Font.BOLD , 20);
        Font f2 = new Font("Century", Font.PLAIN, 20);

    
        JLabel usernameLabel = new JLabel("Username:");
        usernameTextField = new JTextField();
        usernameLabel.setFont(f2);
        usernameTextField.setFont(f2);
        usernameLabel.setBounds(100, 30, 400, 40);
        usernameTextField.setBounds(250, 30, 300, 40);

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        passwordLabel.setFont(f2);
        passwordField.setFont(f2);
        passwordLabel.setBounds(100, 70, 400, 40);
        passwordField.setBounds(250, 70, 300, 40);

        frame.add(usernameLabel);
        frame.add(usernameTextField);
        frame.add(passwordLabel);
        frame.add(passwordField);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(250, 130, 100, 30);
        loginButton.setFont(f);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enteredUsername = usernameTextField.getText();
                String enteredPassword = new String(passwordField.getPassword());

                if (enteredUsername.equals(savedUsername) && enteredPassword.equals(savedPassword)) {
                    JOptionPane.showMessageDialog(null, "Login successful!");
                    Profile profile =new Profile();
                    profile.displayProfile();
                    frame.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password. Please try again.");
                }
            }
        });

        frame.add(loginButton);
        frame.setVisible(true);
    }

    private static String[] readLoginInfo(String filePath) {
        String[] loginInfo = new String[15];
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int i = 0;
            while ((line = br.readLine()) != null && i < loginInfo.length) {
                loginInfo[i] = line;
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return loginInfo;
    }
}

