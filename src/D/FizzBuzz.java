package D;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by slavkurochkin on 9/20/16.
 */
public class FizzBuzz {

    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 100;


    private static String[] generate(int firstArg, int secondArg) {
        List<String> items = new ArrayList<String>();

        for (int i = MIN_VALUE; i <= MAX_VALUE; i++) {

            boolean multipleOfFirstArg = ((i % firstArg) == 0);
            boolean multipleOfSecondArg = ((i % secondArg) == 0);

            if (multipleOfFirstArg && multipleOfSecondArg) {
                items.add("FizzBuzz");
            }
            else if (multipleOfFirstArg) {
                items.add("Fizz");
            }
            else if (multipleOfSecondArg ) {
                items.add("Buzz");
            }
            else {
                items.add(String.valueOf(i));
            }
        }

        return items.toArray(new String[0]);
    }

    public static String getResultAsString(int firstArg, int secondArg) {
        String[] result = generate(firstArg, secondArg);
        String output = "";
        if (result.length > 0) {
            output = Arrays.toString(result);
            // Strip out the brackets from the result
            output = output.substring(1, output.length() - 1);
        }
        return output;
    }

    public static final void main(String[] args) {
        System.out.println(getResultAsString(5,3));
    }
}