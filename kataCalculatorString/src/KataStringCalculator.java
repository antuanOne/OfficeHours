/**
 * Created by Usuario on 24/05/2016.
 */
public class KataStringCalculator {

    public int add(String valuesToAdd) throws Exception {

        if (valuesToAdd.length() == 0) {
            return 0;
        }

        String[] numbersToAdd;

        if (valuesToAdd.startsWith("//")) {
            String[] delimitersAndValues = valuesToAdd.split("\n");
            String delimiter = delimitersAndValues[0].replace("//", "");
            numbersToAdd = delimitersAndValues[1].split(delimiter);

        } else {// without customer delimiter
            numbersToAdd = valuesToAdd.split("[,\\s]");
        }


        if (numbersToAdd.length > 1) {
            int sum = 0;
            for (String value : numbersToAdd) {
                int valueFromNumber = Integer.valueOf(value);
                if (valueFromNumber < 0) {
                    throw new Exception("Error: Negative number");
                } else if (valueFromNumber > 1000) {
                    continue;
                }
                sum = sum + valueFromNumber;
            }
            return sum;
        } else {
            int valueParsed = Integer.valueOf(valuesToAdd);
            if (valueParsed < 0) {
                throw new Exception();
            } else if (valueParsed > 1000) {
                return 0;
            }
            return Integer.valueOf(valueParsed);
        }

    }
}
