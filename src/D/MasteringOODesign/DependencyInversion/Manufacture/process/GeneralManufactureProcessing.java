package D.MasteringOODesign.DependencyInversion.Manufacture.process;

/**
 * Created by VKurochkin on 2/28/2017.
 */
public abstract class GeneralManufactureProcessing {

    private String processName;

    public GeneralManufactureProcessing(String name){
        processName = name;
    }

    protected abstract void assembleDevice();
    protected abstract void testDevice();
    protected abstract void packagingDevice();
    protected abstract void storeDevice();

    // template method
    public void launchProcess(){

        if(processName != null && !processName.isEmpty()) {
            assembleDevice();
            testDevice();
            packagingDevice();
            storeDevice();
        }else{
            System.out.println("no process name was specified");
        }
    }
}
