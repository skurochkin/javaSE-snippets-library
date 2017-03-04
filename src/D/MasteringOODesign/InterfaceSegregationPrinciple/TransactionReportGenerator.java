package D.MasteringOODesign.InterfaceSegregationPrinciple;

/**
 * Created by VKurochkin on 2/28/2017.
 */
public class TransactionReportGenerator {

    private Reporting transactionObject;

    public void generateReport(){
        System.out.println(transactionObject.getName() + transactionObject.productBreakDown() + transactionObject.getDate());
    }
}
