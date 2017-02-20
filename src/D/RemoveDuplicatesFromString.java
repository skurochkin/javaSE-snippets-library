package D;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by VKurochkin on 9/20/2016.
 */
public class RemoveDuplicatesFromString {

    public static void main(String[] args) {
        String string = "aabbccdefatafaz";

        char[] chars = string.toCharArray();
        Set<Character> charSet = new LinkedHashSet<Character>();
        for (char c : chars) {
            charSet.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for (Character character : charSet) {
            sb.append(character);
        }
        System.out.println(sb.toString());
    }
}
