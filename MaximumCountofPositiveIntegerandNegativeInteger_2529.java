public class MaximumCountofPositiveIntegerandNegativeInteger_2529 {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int count_neg = 0;
        int count_pos = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                count_neg += 1;
            } else if (nums[i] > 0) {
                count_pos += 1;
            }
        }
        if (count_pos > count_neg) {
            return count_pos;
        } else {
            return count_neg;
        }
    }
}
