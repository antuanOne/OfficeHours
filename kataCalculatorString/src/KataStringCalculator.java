/**
 * Created by Usuario on 24/05/2016.
 */
public class KataStringCalculator {

    public int add(String valuesToAdd) {

        if (valuesToAdd.length() == 0) {
            return 0;
        }

        String[] numbersToAdd = valuesToAdd.split("[,\\s]");

        if (numbersToAdd.length > 1) {
            int sum = 0;
            for (String value : numbersToAdd) {
                sum = sum + Integer.valueOf(value);
            }
            return sum;
        } else {
            return Integer.valueOf(valuesToAdd);
        }

    }
}
