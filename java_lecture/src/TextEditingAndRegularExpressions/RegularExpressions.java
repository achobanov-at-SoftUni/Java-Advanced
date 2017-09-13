package TextEditingAndRegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

    public static void main(String[] args) {

        String regex = "(\\+\\d{1,3})[-| ](((\\d{3})[-]){2}(\\d{3}))";
        Pattern patter = Pattern.compile(regex);
        Matcher matcher = patter.matcher(
               "+359-233-123-434\n" +
               "+-234-454-862\n" +
               "+35677-324-656-455\n" +
               "+12-445-777-198\n" +
               "+1 345-918-691"
        );

        while (matcher.find()) {

            String score = String.format(matcher.group(2), "%4s").replace(' ', '0').replace("-", ""); // Easier to split with Java then trying to remove '-' in regex
            System.out.printf("%-6s %4s\n", matcher.group(1), score);
        }
    }
}
