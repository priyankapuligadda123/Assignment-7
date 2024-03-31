import java.util.Scanner;

public class VowelCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase(); // Convert input to lowercase for case-insensitivity
        
        int vowelCount = 0;
        boolean isVowelPresent = false;
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                isVowelPresent = true;
                vowelCount++;
            }
        }
        
        if (isVowelPresent) {
            System.out.println("Vowels are present in the string.");
            System.out.println("Total number of vowels present: " + vowelCount);
        } else {
            System.out.println("No vowels are present in the string.");
        }
        
        scanner.close();
    }
}
