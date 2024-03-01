import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class MatchmakingInfo {

    private static JFrame frame;
    private static JRadioButton maleButton;
    private static JRadioButton femaleButton;
    private static JRadioButton muslimRadioButton;
    private static JRadioButton hinduRadioButton;
    private static JRadioButton christianRadioButton;
    private static JRadioButton otherRadioButton;
    private static JTextField hobbyField;
    private static JTextField professionField;
    private static JTextField passionsField;
    private static JButton saveButton;
    private static ButtonGroup genderGroup;

    public void open(User user) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private void createAndShowGUI() {
        frame = new JFrame("Matchmaking Info");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(600, 350, 700, 550);
        Font f = new Font("Century", Font.BOLD, 20);
        Font f2 = new Font("Century", 0, 20);

        Container container = frame.getContentPane();
        container.setLayout(null);

        JLabel genderLabel = new JLabel("Interested In ");
        genderLabel.setBounds(100, 30, 400, 40);
        genderLabel.setFont(f);
        maleButton = new JRadioButton("Male");
        maleButton.setBounds(250, 30, 100, 40);
        maleButton.setFont(f);
        femaleButton = new JRadioButton("Female");
        femaleButton.setBounds(350, 30, 150, 40);
        femaleButton.setFont(f);
        genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);

        JLabel lookingForLabel = new JLabel("Looking For ");
        lookingForLabel.setBounds(100, 70, 400, 40);
        lookingForLabel.setFont(f);

        muslimRadioButton = new JRadioButton("Muslim");
        muslimRadioButton.setBounds(250, 70, 300, 40);
        muslimRadioButton.setFont(f2);

        hinduRadioButton = new JRadioButton("Hindu");
        hinduRadioButton.setBounds(250, 110, 300, 40);
        hinduRadioButton.setFont(f2);

        christianRadioButton = new JRadioButton("Christian");
        christianRadioButton.setBounds(250, 150, 300, 40);
        christianRadioButton.setFont(f2);

        otherRadioButton = new JRadioButton("Other");
        otherRadioButton.setBounds(250, 190, 300, 40);
        otherRadioButton.setFont(f2);

        ButtonGroup lookingForGroup = new ButtonGroup();
        lookingForGroup.add(muslimRadioButton);
        lookingForGroup.add(hinduRadioButton);
        lookingForGroup.add(christianRadioButton);
        lookingForGroup.add(otherRadioButton);

        JLabel hobbyLabel = new JLabel("Hobby ");
        hobbyLabel.setBounds(100, 230, 400, 40);
        hobbyLabel.setFont(f);
        hobbyField = new JTextField();
        hobbyField.setBounds(250, 230, 300, 40);
        hobbyField.setFont(f2);

        JLabel professionLabel = new JLabel("Profession ");
        professionLabel.setBounds(100, 270, 400, 40);
        professionLabel.setFont(f);
        professionField = new JTextField();
        professionField.setBounds(250, 270, 300, 40);
        professionField.setFont(f2);

        JLabel passionsLabel = new JLabel("Passions ");
        passionsLabel.setBounds(100, 310, 400, 40);
        passionsLabel.setFont(f);
        passionsField = new JTextField();
        passionsField.setBounds(250, 310, 300, 40);
        passionsField.setFont(f2);

        saveButton = new JButton("Save");
        saveButton.setBounds(250, 360, 100, 30);
        saveButton.setFont(f);

        container.add(genderLabel);
        container.add(maleButton);
        container.add(femaleButton);
        container.add(lookingForLabel);
        container.add(lookingForLabel);
        container.add(muslimRadioButton);
        container.add(hinduRadioButton);
        container.add(christianRadioButton);
        container.add(otherRadioButton);
        container.add(hobbyLabel);
        container.add(hobbyField);
        container.add(professionLabel);
        container.add(professionField);
        container.add(passionsLabel);
        container.add(passionsField);
        container.add(saveButton);

        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String interestedGender = maleButton.isSelected() ? "Male" : "Female";
                String lookingFor = getLookingFor();
                String hobby = hobbyField.getText();
                String profession = professionField.getText();
                String passions = passionsField.getText();

                if (validateInput(interestedGender, lookingFor, hobby, profession, passions)) {
                    String matchmakingInfo = interestedGender + "\n" +
                            lookingFor + "\n" +
                            hobby + "\n" +
                            profession + "\n" +
                            passions + "\n";

                    appendMatchmakingInfo(matchmakingInfo);

                    JOptionPane.showMessageDialog(frame, "Matchmaking info saved successfully!");
                    frame.dispose();
                    if(true){
                        Profile profile = new Profile();
                        profile.displayProfile();
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Please fill in all the required fields.");
                }
            }
        });
        frame.setVisible(true);
    }

    private String getLookingFor() {
        String lookingFor = "";
        if (muslimRadioButton.isSelected()) {
            lookingFor = "Short-term Relation";
        } else if (hinduRadioButton.isSelected()) {
            lookingFor = "Long-term Relation";
        } else if (christianRadioButton.isSelected()) {
            lookingFor = "Still not sure";
        } else if (otherRadioButton.isSelected()) {
            lookingFor = "Friends";
        }
        return lookingFor;
    }

    private boolean validateInput(String interestedGender, String lookingFor, String hobby, String profession, String passions) {
        return !interestedGender.isEmpty() && !lookingFor.isEmpty() && !hobby.isEmpty() && !profession.isEmpty() && !passions.isEmpty();
    }

    private void appendMatchmakingInfo(String matchmakingInfo) {
        try {
            File file = new File("login_info.txt");
            FileWriter writer = new FileWriter(file, true);
            writer.write(matchmakingInfo);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
  
}
    