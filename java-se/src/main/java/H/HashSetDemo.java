package H;

import java.util.LinkedHashSet;

/**
 * Created by VKurochkin on 9/20/2016.
 */
public class HashSetDemo {
    public static void main(String args[]) {
        // create a hash set
        LinkedHashSet hs = new LinkedHashSet();

        // add elements to the hash set
        hs.add("B");
        hs.add("A");
        hs.add("D");
        hs.add("E");
        hs.add("C");
        hs.add("F");
        hs.add("F");
        System.out.println(hs);
    }
}