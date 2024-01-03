package String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MostCommonWord819 {
        public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String,Integer> map =new HashMap<>();
        Set<String> set=new HashSet<>(Arrays.asList(banned));
        for(String str : paragraph.replaceAll("\\W+"," ").toLowerCase().split("\\s+")){
            if(!set.contains(str)){
                map.put(str,map.getOrDefault(str,0)+1);
            }
        }
        int max=Integer.MIN_VALUE;
        String result="";
        for(String str:map.keySet()){
            if(map.get(str)>max){
                max=map.get(str);
                result=str;
            }
        }
        return result;
    }
}
