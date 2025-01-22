import java.util.Arrays;
public class Median_of_Two_Sorted_Arrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
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
        int median=0;
        if(n%2==1){
            return n/2;
        }else{
            return (n/2-1)+(n/2)/2;
        }
    }

    public static void main(String[] arg) {
        int nums1[] = { 1, 3 };
        int nums2[] = { 2 };
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
