package Factory;
import models.Director;
import models.Manager;
import models.Staff;
import models.User;
import java.util.List;

public class UserFactory {
    public static Staff createStaff(String ID, String name, int age, double hourlyRate, double monthCompletedHour) {
        return new Staff(ID, name, age, hourlyRate, monthCompletedHour);
    }
    public static Manager createManager(String ID, String name, int age, double hourlyRate, double monthCompletedHour,List<User>staffs) {
        return new Manager(ID, name, age, hourlyRate, monthCompletedHour,staffs);
    }
    public static Director createDirector(String ID, String name, int age, double hourlyRate, double monthCompletedHour, List<User>staffAndMangersList) {
        return new Director(ID, name, age, hourlyRate, monthCompletedHour,staffAndMangersList);
    }

}