import java.util.Arrays;

public class CountSort {
    public static int[] Sort(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int num : arr) {
            largest = Math.max(largest, num);
        }

        int[] count = new int[largest + 1];
        for (int num : arr) {
            count[num]++;
        }

        // Sorting using count array
        int j = 0;
        for (int i = 0; i <= largest; i++) {  // Fix: should go up to 'largest'
            while (count[i] > 0) {  // Fix: Add curly braces
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {5, 3, 4, 2, 1};
        System.out.println(Arrays.toString(Sort(arr))); // Output: [1, 2, 3, 4, 5]
    }
}
