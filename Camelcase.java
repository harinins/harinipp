import java.util.Scanner;
 
public class CamelCase {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        String result = "";
        char firstChar = input.charAt(0);
        result = result + Character.toUpperCase(firstChar);
        for (int i = 1; i < input.length(); i++) {
            char current = input.charAt(i);
            char previous = input.charAt(i - 1);
            if (previous == ' ') {
                result = result + Character.toUpperCase(current);
            } else {
                result = result + current;
            }
        }
        System.out.println(result);
    }
}
