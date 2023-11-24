package Reports;
import java.util.HashSet;
public class ReportManger {
    private final HashSet<IReport> reports;

    public ReportManger() {
        reports=new HashSet<>();
    }
    public void addReport(IReport report){
        reports.add(report);
    }
    public void generateReports() {
        for (IReport report:reports) {
            report.generateReport();
        }
    }
}