import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();
        
        System.out.print("Enter the year the employee joined: ");
        int joinYear = scanner.nextInt();
        
        int yearsOfService = currentYear - joinYear;
        
        int bonusAmount = 0;
        
        if (yearsOfService > 5) {
            bonusAmount = 5000;
        } else if (yearsOfService >= 3 && yearsOfService <= 5) {
            bonusAmount = 3000;
        } else {
            System.out.println("No bonus awarded.");
        }
        
        if (bonusAmount > 0) {
            System.out.println("Congratulations! You've been awarded a bonus of Rs. " + bonusAmount + "/-");
        }
        
        scanner.close();
    }
}
        
        scanner.close();
    }
}
