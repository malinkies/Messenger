import java.util.Scanner;

/*
Стейси
Джейкоб
Боб
Аманда
Нил
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Создайте пять различных пользователей: ");
        User[] masUsers = new User[5];
        for (int i = 0; i < 5; i++) {
            User user = new User(scanner.nextLine());
            masUsers[i] = user;
        }
        System.out.println("Выберете ваш аккаунт:");
        for (int i = 0; i < 5; i++) {
            masUsers[i].creatUser();
        }
        User admin = new User(scanner.nextLine());
        admin.menu();
        admin.getUsers(masUsers, admin); //крч возвращает всех ост пользователей, которые не явл админом
        //String action = scanner.nextLine(); //тип ввод операции, которую хочет совершить админ

        Message message = new Message("приветики", "вчера", masUsers[0]);
        Group group1 = new Group("УРА", new Message[]{message});
        group1.sendMessage("прив", "сегодня", masUsers[1]);
        group1.printMessages();
    }
}
