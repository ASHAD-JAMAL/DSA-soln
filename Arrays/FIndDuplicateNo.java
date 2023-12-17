package Arrays;

import java.util.Arrays;

public class FIndDuplicateNo {
        public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                return nums[i];
            }
        }
        return -1;
    }
// we solve this proble using set,Map and slow-fast approach all are easy  Que-No-287
}
