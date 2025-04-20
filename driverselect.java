import java.util.Scanner;

public class driverselect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marital status (married/unmarried): ");
        String maritalStatus = scanner.next().toLowerCase();

        System.out.print("Enter gender (male/female): ");
        String gender = scanner.next().toLowerCase();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        boolean isEligible = false;

        if (maritalStatus.equals("married")) {
            isEligible = true;
        } else if (maritalStatus.equals("unmarried")) {
            if (gender.equals("male") && age > 30) {
                isEligible = true;
            } else if (gender.equals("female") && age > 25) {
                isEligible = true;
            }
        }
        if (isEligible) {
            System.out.println("The driver is eligible for insurance.");
        } else {
            System.out.println("The driver is NOT eligible for insurance.");
        }
    }
}
