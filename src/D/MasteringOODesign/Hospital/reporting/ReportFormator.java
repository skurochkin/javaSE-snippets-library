package D.MasteringOODesign.Hospital.reporting;

/**
 * Created by VKurochkin on 2/21/2017.
 */
public class ReportFormator {

    String formattedOutput;

    public ReportFormator(Object object, FormatType formatType){
         switch (formatType){
             case XML:
                 convertObjectToXML(object);
                 break;
             case CSV:
                 convertObjectToCSV(object);
                 break;
         }
    }

    private String convertObjectToXML(Object object){
        return "XML: <title>" + object.toString() + "</title>";
    }

    private String convertObjectToCSV(Object object){
        return "CSV: <title>" + object.toString() + "</title>";
    }

    protected String getFormattedValue(){
         return formattedOutput;
    }
}
