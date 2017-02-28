package D.MasteringOODesign.InterfaceSegregationPrinciple;

/**
 * Created by VKurochkin on 2/28/2017.
 */
public class AccountsReceivable {

    private Accounting transactionObject;

    public AccountsReceivable(Accounting aTransaction){
        transactionObject = aTransaction;
    }

    public void postPayment(){
        transactionObject.chargeCustomer();
    }

    public void sendInvoice(){
        transactionObject.prepareInvoice();
    }
}
