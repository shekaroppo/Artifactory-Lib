package shekar.com.mylibrary;

/**
 * Created by Shekar on 7/31/16.
 */
public class AwesomeConvertor {

    public static String toAwesome(String nonAwesomeString) {
        return nonAwesomeString.replaceAll("\\w+", "Awesome!" + nonAwesomeString);
    }
}
