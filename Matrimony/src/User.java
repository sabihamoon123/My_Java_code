import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class User {

    private String name;
    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void save() {
        try {
            File file = new File("login_info.txt");
            FileWriter writer = new FileWriter(file, true);
            writer.write(name + "\n" + password + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getUserCount() {
        return null;
    }
}
