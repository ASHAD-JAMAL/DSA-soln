package POD;

import java.util.HashMap;

public class RedestributeCharacterMakingAllStringsEqual1897 {
        public boolean makeEqual(String[] words) {
        int n=words.length;
        HashMap<Character,Integer> map =new HashMap<>();
        for(String word : words){
            for(char ch : word.toCharArray()){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
        }
        for(int freq:map.values()){
            if(freq%n!=0){
                return false;
            }
        }
        return true;
    }
}
