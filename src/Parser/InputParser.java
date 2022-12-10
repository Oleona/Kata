package Parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputParser {

    public static ParsingResult parse(String input) throws Exception {
        final String inputFormat = "^((10)|[1-9])\\s[-+/*]\\s((10)|[1-9])|((X|IX|IV|V?I{0,3})?\\s[-+/*]\\s(X|IX|IV|V?I{0,3}))?$";
        Matcher matcher = Pattern.compile(inputFormat).matcher(input);
        if (!matcher.matches()) {
            throw new Exception("format of the mathematical operation does not match the task");
        }

        String[] splittedInputString = input.split("\\s");
        return new ParsingResult(splittedInputString[0], splittedInputString[1], splittedInputString[2]);
    }
}
