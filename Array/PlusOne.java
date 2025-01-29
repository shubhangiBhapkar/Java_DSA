import java.util.Arrays;

public class PlusOne {
    public static int[] plusOneDigit(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // No carry, return the result
            }
            digits[i] = 0; // Set current digit to 0 and carry over
        }
        
        // If we exit the loop, it means there was a carry from the most significant digit
        int[] result = new int[n + 1];
        result[0] = 1; // Set the first digit to 1, remaining will be 0 by default
        return result;
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        System.out.println(Arrays.toString(plusOneDigit(digits))); // Expected output: [1, 2, 4]
        // int [] digits1=plusOneDigit(digits);
        // for(int i=0;i<digits1.length;i++){
        //     System.out.print(digits1[i]+" ");
        // }

        // int[] digitsWithCarry = {9, 9, 9};
        // System.out.println(Arrays.toString(plusOneDigit(digitsWithCarry))); // Expected output: [1, 0, 0, 0]
    }
}
