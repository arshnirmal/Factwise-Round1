package Q6;

public class Q6 {
    public int robing(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        int s1 = robRange(nums, 0, n - 2);
        int s2 = robRange(nums, 1, n - 1);
        return Math.max(s1, s2);
    }

    private int robRange(int[] nums, int l, int r) {
        int a = 0, b = nums[l];
        for (int i = l + 1; i <= r; ++i) {
            int c = Math.max(nums[i] + a, b);
            a = b;
            b = c;
        }
        return b;
    }
    
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        Q6 q6 = new Q6();
        System.out.println(q6.robing(nums));
    }
}
