import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Profile {

    public void displayProfile() {

        JFrame frame = new JFrame("Profile");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(499, 550);

        ImageIcon profile = new ImageIcon("profile.png");
        JLabel profile_img = new JLabel(profile);
        profile_img.setBounds(0, 0, profile.getIconWidth(), profile.getIconHeight());

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        int frameWidth = frame.getWidth();
        int frameHeight = frame.getHeight();
        int x = (screenWidth - frameWidth) / 2;
        int y = (screenHeight - frameHeight) / 2;
        frame.setLocation(x, y);

        Font f2 = new Font("Century", Font.PLAIN, 20);

        String filePath = "login_info.txt";
        String[] profileInfo = readProfileInfo(filePath);

        String imagePath = profileInfo[9];
        String fullName = profileInfo[2];
        String age = profileInfo[7];
        String location = profileInfo[6];
        String profession = profileInfo[13];
        String interests = profileInfo[10];
        String hobby = profileInfo[12];

        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image image = imageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon scaledImageIcon = new ImageIcon(image);
        JLabel imageLabel = new JLabel(scaledImageIcon);
        imageLabel.setBounds(200, 100, 100, 100);
        frame.add(imageLabel);

        StringBuilder infoText = new StringBuilder();
        infoText.append("<html><b></b> ").append(fullName).append("<br>");
        infoText.append("<b>Age:</b> ").append(age).append("<br>");
        infoText.append("<b>Location:</b> ").append(location).append("<br>");
        infoText.append("<b>Profession:</b> ").append(profession).append("<br>");
        infoText.append("<b>Interests:</b> ").append(interests).append("<br>");
        infoText.append("<b>Hobby:</b> ").append(hobby).append("</html>");

        JLabel infoLabel = new JLabel(infoText.toString());
        infoLabel.setBounds(160, 130, 500, 300);
        infoLabel.setFont(f2);
        frame.add(infoLabel);
        frame.add(profile_img);

        frame.setVisible(true);
    }

    private static String[] readProfileInfo(String filePath) {
        String[] profileInfo = new String[15];
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int i = 0;
            while ((line = br.readLine()) != null && i < profileInfo.length) {
                profileInfo[i] = line;
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return profileInfo;
    }

}