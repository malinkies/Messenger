import java.util.Objects;
import java.util.Random;

public class User {
    protected String userName;
    protected String colorCode;

    public User(String userName) {
        this.userName = userName;
        this.colorCode = generateColor();
    }

    public User() {
    }

    public String generateColor() {
        Random random = new Random();
        String[] colors = {
                "\u001B[38;2;135;206;235m",
                "\u001B[38;2;238;130;238m",
                "\u001B[38;2;100;149;237m",
                "\u001B[38;2;220;20;60m",
                "\u001B[38;2;255;165;0m",
                "\u001B[38;2;0;250;154m",
                "\u001B[38;2;255;105;180m",
                "\u001B[38;2;0;255;0m",
                "\u001B[38;2;0;191;255m",
                "\u001B[38;2;255;255;0m",

        };
        int color = random.nextInt(colors.length);
        return colors[color];
    }
    public static User[] getUsers(User[] masUsers, User admin) {
        User[] users = new User[4];
        int index = 0;
        for (int i = 0; i < 5; i++) {
            if (!masUsers[i].equal(admin) && masUsers[i] != null) users[index++] = masUsers[i];
        }
        return users;
    }
    public String codeAdmin(User[] masUsers, User admin) {
        for (int i = 0; i < 5; i++) {
            if (masUsers[i].equal(admin)) return masUsers[i].colorCode;
        }
        return null;
    }

    public String toString() {
        return colorCode + userName + "\u001B[0m";
    }

    public boolean equal(Object obj) {
        if (this == obj) return true;
        if (getClass() != obj.getClass()) return false;
        User other = (User) obj;
        return userName != null ? userName.equals(other.userName) : other.userName == null;
    }
}
