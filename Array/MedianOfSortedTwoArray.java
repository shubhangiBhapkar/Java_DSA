import java.util.Arrays;

public class MedianOfSortedTwoArray {
    public static double getMedian(int[] nums1,int[] nums2){
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1 + n2;
        int merge[] = new int[n];
        for (int i = 0; i < n1; i++) {
            merge[i] = nums1[i];
        }
        for (int i = 0; i < n2; i++) {
            merge[n1 + i] = nums2[i];
        }

        Arrays.sort(merge);
        if (n % 2 == 1) {
           
            return merge[n / 2];
        } else {
           
            return (merge[n / 2 - 1] + merge[n / 2]) / 2.0;
        }
        
    } 


    public static void main(String args[]){
        int nums1[]={1,2};
        int nums2[]={3,4};
        System.out.println(getMedian(nums1,nums2));
    }
}
