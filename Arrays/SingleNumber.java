package Arrays;

import java.util.HashMap;

public class SingleNumber {
        public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int val :map.keySet()){
            if(map.get(val)==1){
                return val;
            }
        }
        return -1;
    }
}

//Que no -136 we solve this using bitwice operator

    // public int singleNumber(int[] nums) {
    //     int ans=0;
    //     for(int i=0;i<nums.length;i++){
    //         ans=ans^nums[i];
    //     }
    //     return ans;
    // }
