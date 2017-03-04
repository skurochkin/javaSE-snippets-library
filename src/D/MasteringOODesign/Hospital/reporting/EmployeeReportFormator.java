package D.MasteringOODesign.Hospital.reporting;

import D.MasteringOODesign.Hospital.domain.Employee;

/**
 * Created by VKurochkin on 2/21/2017.
 */
public class EmployeeReportFormator extends ReportFormator {


    public EmployeeReportFormator(Employee employee, FormatType formatType) {
        super(employee, formatType);
    }

    public String getFormateedEmployee(){
        return getFormattedValue();
    }
}
