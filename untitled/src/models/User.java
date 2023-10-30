package models;

public abstract class User {
    public User(String ID, String name, int age, double hourlyRate, double monthCompletedHour, String userType) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.hourlyRate = hourlyRate;
        this.monthCompletedHour = monthCompletedHour;
        this.userType = userType;
    }
    protected String ID;
    protected String name;
    protected int age;
    protected double hourlyRate;
    protected double monthCompletedHour;
    protected String userType;

    public String getUserType() {
        return userType;
    }
    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    public double getMonthCompletedHour() {
        return monthCompletedHour;
    }

    public void setMonthCompletedHour(double monthCompletedHour) {
        this.monthCompletedHour = monthCompletedHour;
    }
}