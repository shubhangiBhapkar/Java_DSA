import java.util.*;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of tickets:");
        int ticket = sc.nextInt();
        if (ticket < 5 || ticket > 40) {
            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
            return;
        }

        System.out.println("Do you want refreshment? (y/n):");
        String ref = sc.next();

        System.out.println("Do you have coupon code? (y/n):");
        String coupon = sc.next();

        System.out.println("Enter the circle (k/q):");
        String circle = sc.next();

        if (!circle.equalsIgnoreCase("k") && !circle.equalsIgnoreCase("q")) {
            System.out.println("Invalid Input");
            return;
        }

        double costPerTicket = circle.equalsIgnoreCase("k") ? 75 : 150;
        double totalCost = ticket * costPerTicket;

        if (coupon.equalsIgnoreCase("y")) {
            totalCost *= 0.98;  // 2% discount
        }

        if (ticket > 20) {
            totalCost *= 0.9;   // 10% discount
        }

        if (ref.equalsIgnoreCase("y")) {
            totalCost += 50 * ticket;
        }

        System.out.printf("Ticket cost: %.2f\n", totalCost);
    }
}
