import java.util.Scanner;
//first attempt only pulls up a 404 screen
public class Main {
//this code isnt coding like previous codes have coded

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // create a Scanner in to read from the console
        int month = 0;
        System.out.print("Enter your birth month (1-12): ");

        if (in.hasNextInt()) {
            // OK safe to read in an integer
            month = in.nextInt();
            in.nextLine(); // clear the buffer

            if (month >= 1 && month <= 12) {
                System.out.println("Your birth month is: " + month);
            } else {
                System.out.println("You entered an incorrect month value: " + month);
            }
        } else {
            String invalidInput = in.next(); // read the invalid input
            System.out.println("You entered an incorrect month value: " + invalidInput);
        }

        in.close();
    }
}
