import java.util.regex.Pattern;

public class AntiXSS {

    //region Anti xss
    public static String antiXSS(String input, boolean disableHtmlEncoding, String allowRegex) {
        try {
            if (!Pattern.matches(allowRegex, input)) {
                return "Dangerous Input";
            }
            input = disableHtmlEncoding ? input : HtmlUtility.encode(input);
            return input;
        } catch (Exception ex) {
            return "Error";
        }
    }

    public static String antiXSS(String input, boolean disableHtmlEncoding) {
        return antiXSS(input, disableHtmlEncoding, "^[a-zA-Z0-9]*");
    }

    public static String antiXSS(String input) {
        return antiXSS(input, false, "^[a-zA-Z0-9]*");
    }
    //endregion
}
