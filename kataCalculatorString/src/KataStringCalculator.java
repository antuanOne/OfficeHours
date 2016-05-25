/**
 * Created by Usuario on 24/05/2016.
 */
public class KataStringCalculator {

    public int add(String valuesToAdd) throws Exception {

        if (valuesToAdd.length() == 0) {
            return 0;
        }

        String[] numbersToAdd = valuesToAdd.split("[,\\s]");

        if (numbersToAdd.length > 1) {
            int sum = 0;
            for (String value : numbersToAdd) {
                int valueFromNumber = Integer.valueOf(value);
                if (valueFromNumber < 0) {
                    throw new Exception("Error: Negative number");
                }
                sum = sum + valueFromNumber;
            }
            return sum;
        } else {
            int valueParsed = Integer.valueOf(valuesToAdd);
            if (valueParsed < 0) {
                throw new Exception();
            }
            return Integer.valueOf(valueParsed);
        }

    }
}
