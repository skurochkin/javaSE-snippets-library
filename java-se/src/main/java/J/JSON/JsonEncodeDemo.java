package J.JSON;

import org.json.simple.JSONObject;

import java.io.IOException;
import java.io.StringWriter;

/**
 * Created by VKurochkin on 10/5/2016.
 */
public class JsonEncodeDemo {

    public static void main(String[] args){

        JSONObject obj = new JSONObject();

        obj.put("name","foo");
        obj.put("num",new Integer(100));
        obj.put("balance",new Double(1000.21));
        obj.put("is_vip",new Boolean(true));

        StringWriter out = new StringWriter();
        try {
            obj.writeJSONString(out);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String jsonText = out.toString();
        System.out.print(jsonText);
    }
}

