package Arrays;

import java.util.HashMap;

public class SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        int n=nums.length;
        int arr[]=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num :nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int i=0;
        for(int key : map.keySet()){
            if(map.get(key)==1){
                arr[i++]=key;
                if(i==2){
                    break;
                }
            }
        }
        return arr;
    }
}
