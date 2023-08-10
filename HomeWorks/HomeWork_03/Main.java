package HomeWorks.HomeWork_03;

public class Main {
    public static void main(String[] args) {
        User user = CreateUser.createNewUser();
        if(user.counter == 6) //Простая проверка на количество не null полей
            WorkingWithFiles.saveNewUser(user);
        else
            System.out.println("\nПовторите попытку");
    }
}
