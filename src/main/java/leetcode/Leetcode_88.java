package leetcode;

/**
 * Created by zhaorunqian on 2020/8/30.
 */
public class Leetcode_88 {

    /**
     * https://leetcode-cn.com/problems/merge-sorted-array/submissions/
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int length = m + n;
        for(int i = length - 1; i >= 0; i--) {
            if(m <= 0) {
                nums1[i] = nums2[n-1];
                n--;
                continue;
            }

            if(n <= 0) {
                break;
            }

            if(nums1[m-1] >= nums2[n-1]) {
                nums1[i] = nums1[m-1];
                m--;
            } else {
                nums1[i] = nums2[n-1];
                n--;
            }
        }
    }

}
