package leetcode;

/**
 * todo
 * Created by zhaorunqian on 2020/8/23.
 */
public class Leetcode_33 {

    /**
     * https://leetcode-cn.com/problems/search-in-rotated-sorted-array/
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        return doSearch(nums, target, 0, nums.length - 1);
    }

    private int doSearch(int[] nums, int target, int begin, int end) {
        if (begin > end) {
            return -1;
        }

        int middle = (begin + end) / 2;
        if (target == nums[middle]) {
            return middle;
        }

        if (nums[middle] > target) {
            if (nums[begin] > target) {
                return doSearch(nums, target, middle + 1, end);
            } else {
                return doSearch(nums, target, begin, middle - 1);
            }
        } else {
            if (nums[begin] > target) {
                return doSearch(nums, target, begin, middle - 1);
            } else {
                return doSearch(nums, target, middle + 1, end);
            }
        }
    }

    public static void main(String[] args) {
        new Leetcode_33().search(new int[]{3,1} , 1);
    }
}