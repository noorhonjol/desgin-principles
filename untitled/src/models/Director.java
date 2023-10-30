package models;
import database.DataBase;

import database.FakeDB;
import java.util.ArrayList;
import java.util.List;
public class Director extends User {
    private final List<User> staffsAndMangers;
    public Director(String ID, String name, int age, double hourlyRate, double monthCompletedHour) {
        super(ID, name, age, hourlyRate, monthCompletedHour, "director");
        staffsAndMangers=new ArrayList<>();
    }
    public void getDataFromDb() {
        DataBase dbc = FakeDB.getInstance();
        staffsAndMangers.addAll(dbc.query ("staffs and mangers"));
    }
    public List<User> getStaffsAndMangers() {
        return staffsAndMangers;
    }
}