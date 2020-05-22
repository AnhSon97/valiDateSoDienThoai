import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {

    private static final String REGEX = "[\\d]{2}-[\\d]*[0][\\d]{9}";

    public boolean validate (String regex){
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

class Test{
    private static Example example;

    public static void main(String[] args) {
    example = new Example();
    String test = "84-0234567890";
    boolean check = example.validate(test);
        System.out.println(check);

    }
}
