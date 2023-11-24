import Factory.ReportFactory;
import Reports.ReportManger;
import database.FakeDB;
import models.Director;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        //get all directors
        List<Director>directors= FakeDB.getInstance().query("get directors");
        ReportManger myReport=new ReportManger();
        for(Director director:directors){
            myReport.addReport(ReportFactory.createRequireBudget(director));
            myReport.addReport(ReportFactory.createStaffReport(director.getStaffsAndMangers()));
        }

        myReport.generateReports();
    }
}