package Arrays;

import java.util.HashSet;

public class MinimumCommonValue2540 {
        public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> set =new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            if(!set.contains(nums1[i])){
                set.add(nums1[i]);
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                return nums2[i];
            }
        }
        return -1;
    }
}
