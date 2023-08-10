package HomeWorks.HomeWork_03;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WorkingWithFiles {
    public static void saveNewUser(User user) {
        try {
            File file = new File("E:\\Учеба Digital-master\\Exeptions\\HomeWorks\\HomeWork_03\\Users\\" + user.secondName + ".txt"); //Путь конкретно моего расположения директории

            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
            String date = String.format("<%s> <%s> <%s> <%s> <%s> <%c>",
                    user.secondName, user.firstName, user.lastName, user.birthday, user.numberPhone, user.gender);
            
            bw.write(date);
            bw.newLine();
            bw.close();
            System.out.println("\n\nЗапись прошла успешно");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
