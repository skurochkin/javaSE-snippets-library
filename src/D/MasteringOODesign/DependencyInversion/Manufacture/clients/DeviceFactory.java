package D.MasteringOODesign.DependencyInversion.Manufacture.clients;

import D.MasteringOODesign.DependencyInversion.Manufacture.process.GeneralManufactureProcessing;
import D.MasteringOODesign.DependencyInversion.Manufacture.process.SmartphoneManufacturingProcess;

/**
 * Created by VKurochkin on 2/28/2017.
 */
public class DeviceFactory {
    public static void main(String[] args){
        GeneralManufactureProcessing manufacturer = new SmartphoneManufacturingProcess("Iphone process");
        manufacturer.launchProcess();
    }
}
