public class User {
    protected String userName;

    public User(String userName) {
        this.userName = userName;
    }

    public User() {
    }

    public void creatUser() {
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
        System.out.println(colors[color] + userName + "\u001B[0m");
    }
    public void menu() {
        System.out.println("""
                Вам доступны следующие операции:\s
                \u25CF Написать сообщение\s
                \u25CF Зайти на канал\s
                \u25CF Прочитать сообщения""");
    }
    public User[] getUsers(User[] masUsers, User admin) {
        User[] users = new User[5];
        for (int i = 0; i < 5; i++ ) {
            if (!admin.equals(masUsers[i])) users[i] = masUsers[i];
        }
        return users;
    }
}
