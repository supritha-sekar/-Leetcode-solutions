class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int s = 0;
        int[] nums = {-1, 0};
        int e = numbers.length - 1;

        while (s < e) {
            int sum = numbers[s] + numbers[e];

            if (sum == target) {
                nums[0] = s + 1;
                nums[1] = e + 1;
                return nums;
            } else if (sum > target) {
                e--;
            } else {
                s++;
            }
        }

        return nums;
    }
}