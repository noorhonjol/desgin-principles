package Factory;
import Reports.RequireBudgetReport;
import Reports.StaffReport;
import models.User;
import java.util.List;

public class ReportFactory {

    public static StaffReport createStaffReport(List<User>staffList){
        return new StaffReport(staffList);
    }
    public static RequireBudgetReport createRequireBudget(User user){
        return new RequireBudgetReport(user);
    }

}
