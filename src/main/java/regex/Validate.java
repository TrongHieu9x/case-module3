package regex;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    public Validate() {
    }

    public boolean validateNameProduct(String keyword, String regex) {
        keyword = keyword.toLowerCase(Locale.ROOT);
        String NAME_REGEX = ".*" + keyword + ".*";
        Pattern pattern = Pattern.compile(NAME_REGEX);
        CharSequence input;
        Matcher matcher = pattern.matcher(regex.toLowerCase(Locale.ROOT));
        return matcher.matches();
    }
}
