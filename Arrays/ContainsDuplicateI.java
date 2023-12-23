package Arrays;

import java.util.HashMap;

public class ContainsDuplicateI {
        public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int  num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int val:map.keySet()){
            if(map.get(val)>=2){
                return true;
            }
        }
        return false;
    }
}
