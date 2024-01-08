package Arrays;

import java.util.HashMap;

public class countCommonWordWithOneOccurance2085 {
        public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> map =new HashMap<>();
        HashMap<String,Integer> map2 =new HashMap<>();
        for(String word:words1){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        for(String word:words2){
            map2.put(word,map2.getOrDefault(word,0)+1);
        }
        int count=0;
        for(String word : words1){
            if(map.get(word)==1 && map2.getOrDefault(word,0)==1){
                count++;
            }
        }
        return count;
    }
}
