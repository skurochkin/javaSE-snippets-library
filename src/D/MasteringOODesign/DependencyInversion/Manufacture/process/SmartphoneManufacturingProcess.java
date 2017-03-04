package D.MasteringOODesign.DependencyInversion.Manufacture.process;

/**
 * Created by VKurochkin on 2/28/2017.
 */
public class SmartphoneManufacturingProcess extends GeneralManufactureProcessing {
    public SmartphoneManufacturingProcess(String name) {
        super(name);
    }

    @Override
    protected void assembleDevice() {
        System.out.println("assembled smartphone");
    }

    @Override
    protected void testDevice() {
        System.out.println("tested smartphone");
    }

    @Override
    protected void packagingDevice() {
        System.out.println("package smartphone");
    }

    @Override
    protected void storeDevice() {
        System.out.println("store smartphone");
    }
}
