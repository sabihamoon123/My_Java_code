import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

public class CreatingProfile {

    private JFrame frame;
    private JTextField fullnameField;
    private JRadioButton maleButton;
    private JRadioButton femaleButton;
    private JTextField phoneNumberField;
    private JTextField emailField;
    private JTextField ageField;
    private JComboBox<String> dayComboBox;
    private JComboBox<String> monthComboBox;
    private JComboBox<String> yearComboBox;
    private JComboBox<String> cityComboBox;
    private JButton saveButton;
    private JButton uploadButton;
    private JLabel photoLabel;
    private String photoPath;

    public void open() {
        frame = new JFrame("Creating Profile");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(600, 350, 800, 550);
        Font f = new Font("Century", Font.BOLD, 20);
        Font f2 = new Font("Century", 0, 20);

        Container container = frame.getContentPane();
        container.setLayout(null);


        JLabel fullnameLabel = new JLabel("Full Name ");
        fullnameLabel.setBounds(100, 30, 400, 40);
        fullnameLabel.setFont(f);
        fullnameField = new JTextField();
        fullnameField.setBounds(250, 30, 300, 40);
        fullnameField.setFont(f2);

        JLabel genderLabel = new JLabel("Gender ");
        genderLabel.setBounds(100, 70, 400, 40);
        genderLabel.setFont(f);
        maleButton = new JRadioButton("Male");
        maleButton.setBounds(250, 70, 100, 40);
        maleButton.setFont(f);
        femaleButton = new JRadioButton("Female");
        femaleButton.setBounds(350, 70, 100, 40);
        femaleButton.setFont(f);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);

        JLabel phoneNumberLabel = new JLabel("Phone Number ");
        phoneNumberLabel.setBounds(100, 110, 400, 40);
        phoneNumberLabel.setFont(f);
        phoneNumberField = new JTextField();
        phoneNumberField.setBounds(250, 110, 300, 40);
        phoneNumberField.setFont(f2);

        JLabel emailLabel = new JLabel("Email Address ");
        emailLabel.setBounds(100, 150, 400, 40);
        emailLabel.setFont(f);
        emailField = new JTextField();
        emailField.setBounds(250, 150, 300, 40);
        emailField.setFont(f2);

        JLabel cityLabel = new JLabel("Location ");
        cityLabel.setBounds(100, 190, 400, 40);
        cityLabel.setFont(f);
        String[] cities = {"Badda", "Banani", "Bashundhara", "Cantonment", "Dhanmondi", "Gulshan", "Mirpur", "Mohakhali", "Rampura", "Uttara"};
        cityComboBox = new JComboBox<>(cities);
        cityComboBox.setBounds(250, 190, 150, 40);
        cityComboBox.setFont(f2);

        JLabel ageLabel = new JLabel("Age ");
        ageLabel.setBounds(100, 230, 400, 40);
        ageLabel.setFont(f);
        ageField = new JTextField();
        ageField.setBounds(250, 230, 70, 40);
        ageField.setFont(f2);

        JLabel dobLabel = new JLabel("Date of Birth ");
        dobLabel.setBounds(100, 270, 400, 40);
        dobLabel.setFont(f);
        String[] days = new String[31];
        for (int i = 1; i <= 31; i++) {
            days[i - 1] = String.valueOf(i);
        }
        dayComboBox = new JComboBox<>(days);
        dayComboBox.setBounds(250, 270, 70, 40);
        dayComboBox.setFont(f);
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        monthComboBox = new JComboBox<>(months);
        monthComboBox.setBounds(330, 270, 150, 40);
        monthComboBox.setFont(f);
        String[] years = new String[100];
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        for (int i = 0; i < 100; i++) {
            years[i] = String.valueOf(currentYear - i);
        }
        yearComboBox = new JComboBox<>(years);
        yearComboBox.setBounds(490, 270, 80, 40);
        yearComboBox.setFont(f);

        saveButton = new JButton("Next");
        saveButton.setBounds(250, 450, 100, 40);
        saveButton.setFont(f);

        JLabel profilePictureLabel = new JLabel("Profile Picture");
        profilePictureLabel.setBounds(100, 330, 400, 40);
        profilePictureLabel.setFont(f);
        uploadButton = new JButton("Upload Picture");
        uploadButton.setBounds(380, 330, 200, 40);
        uploadButton.setFont(f);

        photoLabel = new JLabel();
        photoLabel.setBounds(250, 310, 100, 100);
        photoLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        container.add(fullnameLabel);
        container.add(fullnameField);
        container.add(genderLabel);
        container.add(maleButton);
        container.add(femaleButton);
        container.add(phoneNumberLabel);
        container.add(phoneNumberField);
        container.add(emailLabel);
        container.add(emailField);
        container.add(cityLabel);
        container.add(cityComboBox);
        container.add(ageLabel);
        container.add(ageField);
        container.add(dobLabel);
        container.add(dayComboBox);
        container.add(monthComboBox);
        container.add(yearComboBox);
        container.add(saveButton);
        container.add(profilePictureLabel);
        container.add(uploadButton);
        container.add(photoLabel);

        uploadButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                uploadProfilePicture();
            }
        });

        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String fullname = fullnameField.getText();
                String gender = maleButton.isSelected() ? "Male" : "Female";
                String phoneNumber = phoneNumberField.getText();
                String email = emailField.getText();
                String city = (String) cityComboBox.getSelectedItem();
                String age = ageField.getText();
                String dob = dayComboBox.getSelectedItem().toString() + " " + monthComboBox.getSelectedItem().toString() + " " + yearComboBox.getSelectedItem().toString();
                if (fullname.isEmpty() || gender.isEmpty() || phoneNumber.isEmpty() || email.isEmpty() || city.isEmpty() || age.isEmpty() || dob.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please enter all information.");
                } else {
                    saveProfileInfo(fullname, gender, phoneNumber, email, city, age, dob);
                }
            }
        });

        frame.setVisible(true);
    }

    private void uploadProfilePicture() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Image Files", "jpg", "jpeg", "png"));
        int result = fileChooser.showOpenDialog(frame);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            photoPath = selectedFile.getAbsolutePath();
            ImageIcon imageIcon = new ImageIcon(photoPath);
            Image image = imageIcon.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
            photoLabel.setIcon(new ImageIcon(image));
        }
    }

    private void saveProfileInfo(String fullname, String gender, String phoneNumber, String email, String city,String age, String dob) {
        try {
            File file = new File("login_info.txt");
            FileWriter writer = new FileWriter(file, true);
            writer.write(fullname + "\n" + gender + "\n" + phoneNumber + " \n" + email + " \n" + city + "\n"+ age + "\n" + dob + "\n" + photoPath + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(frame, "Profile created successfully!");
        frame.dispose();
        MatchmakingInfo matchmakingInfo = new MatchmakingInfo();
        matchmakingInfo.open(null);
        CreatingProfile.dispose();
    }

    public void createAndShowGUI() {
    }

    public static void dispose() {
    }
}
