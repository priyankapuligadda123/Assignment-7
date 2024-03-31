import java.util.Scanner;

public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of days the book is late: ");
        int lateDays = scanner.nextInt();
        
        double fine = 0;
        
        if (lateDays >= 1 && lateDays <= 7) {
            fine = lateDays * 0.5;
        } else if (lateDays >= 8 && lateDays <= 14) {
            fine = lateDays * 1;
        } else if (lateDays > 14 && lateDays <= 21) {
            fine = lateDays * 5;
        } else if (lateDays > 21) {
            System.out.println("Your membership is canceled due to late return for more than 21 days.");
            System.exit(0);
        } else {
            System.out.println("No fine.");
            System.exit(0);
        }
        
        System.out.println("Fine for returning the book " + lateDays + " days late: Rs. " + fine);
        
        scanner.close();
