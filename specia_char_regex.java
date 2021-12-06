import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class gt {
        public static void main(String args[]) {
            String inputString = "she*is@preety";
            Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
            Matcher matcher = pattern.matcher(inputString);
            boolean isStringContainsSpecialCharacter = matcher.find();
            if(isStringContainsSpecialCharacter)
                System.out.println(inputString+ " contains special character");
            else
                System.out.println(inputString+ " does NOT contain special character");
        }
    }


