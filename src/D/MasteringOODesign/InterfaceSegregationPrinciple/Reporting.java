package D.MasteringOODesign.InterfaceSegregationPrinciple;

import java.util.Date;

/**
 * Created by VKurochkin on 2/28/2017.
 */
public interface Reporting {
    String getName();

    Date getDate();

    String productBreakDown();
}
