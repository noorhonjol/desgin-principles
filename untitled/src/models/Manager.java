package models;
import database.DataBase;
import database.FakeDB;
import java.util.ArrayList;
import java.util.List;
public class Manager extends User{
    private final List<User> staffs;
    public Manager(String ID, String name, int age, double hourlyRate, double monthCompletedHour) {
        super(ID, name, age, hourlyRate, monthCompletedHour, "manager");
        staffs=new ArrayList<>();
    }
    public void getDataFromDb(){
        DataBase Db=FakeDB.getInstance();
        staffs.addAll(Db.query("staffs"));
    }
    public List<User> getStaffs() {
        return staffs;
    }

}