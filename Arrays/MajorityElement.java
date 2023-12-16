package Arrays;

import java.util.HashMap;

public class MajorityElement {
        public int majorityElement(int[] nums) {
        int n=nums.length;
        int ans=-1;
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key)>n/2){
                ans=key;
            }
        }
        return ans;
    }
}
//Question No-169