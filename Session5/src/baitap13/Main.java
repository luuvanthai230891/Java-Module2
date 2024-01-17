package baitap13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String str = "luuvanthai@gmail.com";

        System.out.println(Validate.isValidEmail(str));
    }

}
