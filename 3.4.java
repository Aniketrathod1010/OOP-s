import java.util.Scanner;

class MessageFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter last name: ");
        String lastName = sc.nextLine();

        String fullName = firstName.substring(0, 1).toUpperCase()
                + firstName.substring(1).toLowerCase()
                + " "
                + lastName.substring(0, 1).toUpperCase()
                + lastName.substring(1).toLowerCase();

        System.out.println("Full Name: " + fullName);
    }
}
