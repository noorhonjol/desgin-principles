package models;
public class Staff extends User {
    public Staff(String ID, String name, int age, double hourlyRate, double monthCompletedHour) {
        super(ID, name, age, hourlyRate, monthCompletedHour, "staff");
    }
}