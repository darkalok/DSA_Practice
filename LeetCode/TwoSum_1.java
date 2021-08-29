
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // This loop will consider first
        for (int i = 0; i < nums.length; i++) {
            // This loop helps to provide one value ahead from previous value
            for (int j = i + 1; j < nums.length; j++) {
                // We are comparing the jth value with target - ith value.
                // If they are same we will return our indices in the array.
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        // If unable to get return empty array
        return new int[]{};

    }
}
