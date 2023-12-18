package POD;

import java.util.Arrays;
// brute force Que.No-1913
public class MaxProDiffBw2Pairs {
        public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int max1=nums[n-1];
        int max2=nums[n-2];
        int min1=nums[0];
        int min2=nums[1];
        int pro=((max1*max2)-(min1*min2));
        return pro;
    }
}
