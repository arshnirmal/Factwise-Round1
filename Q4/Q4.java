package Q4;

import java.util.Arrays;

public class Q4 {
    public int getIndex(int[] nums, int target) {
        int ans = Arrays.binarySearch(nums,target);
        if(ans < 0){
            return Math.abs(ans) -1;
        }
        else{
            return ans;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 7;
        Q4 q4 = new Q4();
        System.out.println(q4.getIndex(nums,target));
    }
}
