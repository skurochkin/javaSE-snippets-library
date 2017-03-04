package D.MasteringOODesign.InterfaceSegregationPrinciple;

/**
 * Created by VKurochkin on 2/28/2017.
 */
public class Product {
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    private int productId;
    private String productName;
}
