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

// 2nd approach 
class Solution {
    public int maxProductDifference(int[] nums) {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int num:nums){
            if(num>max1){
                max2=max1;
                max1=num;
            }
            else if(num>max2){
                max2=num;
            }
            if(num<min1){
                min2=min1;
                min1=num;
            }
            else if(num<min2){
                min2=num;
            }
        }
        return max1*max2-min1*min2;
    }
}