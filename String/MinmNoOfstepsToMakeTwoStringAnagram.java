package String;

import java.util.HashMap;
import java.util.Map;

public class MinmNoOfstepsToMakeTwoStringAnagram {
        public int minSteps(String s, String t) {
        int count=0;
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> map1 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++){
            map1.put(t.charAt(i),map1.getOrDefault(t.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            char key =entry.getKey();
            if(map1.containsKey(key)){
                if(entry.getValue().equals(map1.get(key))){
                    count+=entry.getValue();
                }else{
                    count+=Math.min(entry.getValue(),map1.get(key));
                }
            }
        }
        return s.length()-count;
    }
}
