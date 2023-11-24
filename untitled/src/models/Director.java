package models;
import java.util.List;
public class Director extends User {
    private final List<User> staffsAndMangers;
    public Director(String ID, String name, int age, double hourlyRate, double monthCompletedHour,List<User>staffsAndMangers) {
        super(ID, name, age, hourlyRate, monthCompletedHour, "director");
        this.staffsAndMangers=staffsAndMangers;
    }
    public List<User> getStaffsAndMangers() {
        return staffsAndMangers;
    }
}