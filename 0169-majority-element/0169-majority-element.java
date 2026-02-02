//Divide and conquer
class Solution {
    public int majorityElement(int[] nums) {
        return findMajority(nums, 0, nums.length - 1);
    }
    private int findMajority(int[] nums, int left, int right) {
        if (left == right) {
        return nums[left];
        }

        int mid = left + (right - left) / 2;
        int leftMajor = findMajority(nums, left, mid);
        int rightMajor = findMajority(nums, mid + 1, right);
        if (leftMajor == rightMajor) {
            return leftMajor;
        }
        int leftCount = count(nums, left, right, leftMajor);
        int rightCount = count(nums, left, right, rightMajor);
        return leftCount > rightCount ? leftMajor : rightMajor;
    }
    private int count(int[] nums, int left, int right, int target) {
        int c = 0;
        for (int i = left; i <= right; i++) {
            if (nums[i] == target) {
                c++;
            }
        }
        return c;
    }
}