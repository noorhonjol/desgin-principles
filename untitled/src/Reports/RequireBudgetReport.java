package Reports;
import models.User;

public class RequireBudgetReport implements IReport {
    private final User user;
    public RequireBudgetReport(User user){
        this.user=user;
    }
    @Override
    public void generateReport() {
        double requireBudget=user.getHourlyRate()*user.getMonthCompletedHour();
        System.out.println("The Require Budget for "+user.getName()+" is "+requireBudget);
    }
}
