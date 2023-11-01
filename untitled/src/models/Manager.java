package models;
import database.DataBase;
import database.FakeDB;
import java.util.ArrayList;
import java.util.List;
public class Manager extends User{
    private final List<User> staffs;
    public Manager(String ID, String name, int age, double hourlyRate, double monthCompletedHour,List<User> staffs) {
        super(ID, name, age, hourlyRate, monthCompletedHour, "manager");
        this.staffs=staffs;
    }
    public List<User> getStaffs() {
        return staffs;
    }
}