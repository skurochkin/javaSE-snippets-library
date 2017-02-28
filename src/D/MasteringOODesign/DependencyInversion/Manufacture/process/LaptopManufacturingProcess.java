package D.MasteringOODesign.DependencyInversion.Manufacture.process;

/**
 * Created by VKurochkin on 2/28/2017.
 */
public class LaptopManufacturingProcess extends GeneralManufactureProcessing {
    public LaptopManufacturingProcess(String name) {
        super(name);
    }

    @Override
    protected void assembleDevice() {
        System.out.println("assemble laptop");
    }

    @Override
    protected void testDevice() {
        System.out.println("test laptop");
    }

    @Override
    protected void packagingDevice() {
        System.out.println("packaging laptop");
    }

    @Override
    protected void storeDevice() {
        System.out.println("store laptop");
    }
}
