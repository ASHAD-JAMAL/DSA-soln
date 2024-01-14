package String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class DetermineIfTwoStringAreClose1657 {
        public boolean closeStrings(String word1, String word2) {
        HashMap<Character,Integer> map =new HashMap<>();
        HashMap<Character,Integer> map1 =new HashMap<>();
        for(char word:word1.toCharArray()){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        for(char word:word2.toCharArray()){
            map1.put(word,map1.getOrDefault(word,0)+1);
        }
        if(!map.keySet().equals(map1.keySet())){
            return false;
        }
        List<Integer> freq1= new ArrayList<>(map.values());
        List<Integer> freq2= new ArrayList<>(map1.values());
        Collections.sort(freq1);
        Collections.sort(freq2);
        return freq1.equals(freq2);
    }
}
