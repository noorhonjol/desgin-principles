import Reports.ReportManger;
import Reports.RequireBudgetReport;
import Reports.StaffReport;
import models.Director;
import models.Manager;

public class Main {
    public static void main(String[] args) {

        Director d=new Director("ddd1","ahmad mohsen",10,25,100);
        Manager m=new Manager("M1","islam halabone",22,32,100);

        m.getDataFromDb();
        d.getDataFromDb();

        ReportManger reportManger=new ReportManger();
        ReportManger reportManger2=new ReportManger();

        reportManger.addReport(new RequireBudgetReport(d));
        reportManger.addReport(new StaffReport(d.getStaffsAndMangers()));

        reportManger2.addReport(new RequireBudgetReport(m));
        reportManger2.addReport(new StaffReport(m.getStaffs()));

        reportManger2.generateReports();
        reportManger.generateReports();

    }
}

