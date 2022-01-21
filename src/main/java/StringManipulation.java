import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me some random input!");
        String userInput = sc.nextLine();
        if(StringUtils.isNumeric(userInput)) {
            System.out.printf("%s is numeric!%n", userInput);
        } else {
            System.out.printf("%s is not numeric!%n", userInput);
        }
        String flipsCase = StringUtils.swapCase(userInput);
        System.out.printf("If you swap the case of %s you get %s!%n", userInput, flipsCase);
        String reversesString = StringUtils.reverse(userInput);
        System.out.printf("If you reverse the case of %s you get %s!%n", userInput, reversesString);
        }
    }