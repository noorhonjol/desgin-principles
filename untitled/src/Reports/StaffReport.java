package Reports;

import models.User;

import java.util.List;

public class StaffReport implements IReport{
    List<User>users;
    public StaffReport(List<User> users){
        this.users=users;
    }
    @Override
    public void generateReport() {
        for (User user:users){
            if("staff".equals(user.getUserType())){
                System.out.println(user.getID()+" "+user.getName());
            }
        }
    }
}
