public class thirdMaxNo {

    public static int thirdMax(int[] nums) {
        Long first = null;
        Long second = null;
        Long third = null;

        for (int num : nums) {
            long n = num;

            // Skip duplicates
            if ((first != null && n == first) ||
                (second != null && n == second) ||
                (third != null && n == third)) {
                continue;
            }

            if (first == null || n > first) {
                third = second;
                second = first;
                first = n;
            } 
            else if (second == null || n > second) {
                third = second;
                second = n;
            } 
            else if (third == null || n > third) {
                third = n;
            }
        }

        // If third maximum exists, return it, otherwise return first
        return (third == null) ? first.intValue() : third.intValue();
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1};
        System.out.println(thirdMax(nums));   // Output: 1
    }
}
