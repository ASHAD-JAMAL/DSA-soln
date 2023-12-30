package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortPeople2418 {
        public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> map=new HashMap<>();
        for(int i=0;i<names.length;i++){
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        String[] ans=new String[heights.length];
        int index=0;
        for(int i=heights.length-1;i>=0;i--){
            ans[index]=map.get(heights[i]);
            index++;
        }
        return ans;
    }
}
