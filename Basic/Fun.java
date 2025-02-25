import java.util.Scanner;

public class Fun {
    int factorial(int n) {
        int fact = 1; // Declare `fact` as a local variable
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    int bino_coe(int a, int b, int c) {
        return a / (b * c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n = sc.nextInt();
        System.out.println("Enter value of r:");
        int r = sc.nextInt();

        Fun f = new Fun();
        int x = f.factorial(n);
        int y = f.factorial(r);
        int z = f.factorial(n - r);

        int binomialCoefficient = f.bino_coe(x, y, z);
        System.out.println("Binomial coefficient is: " + binomialCoefficient);
    }
}
