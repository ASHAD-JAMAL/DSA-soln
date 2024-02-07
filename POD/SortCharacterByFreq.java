package POD;

import java.util.HashMap;
import java.util.PriorityQueue;

public class SortCharacterByFreq {
        public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        PriorityQueue<Character> pq = new PriorityQueue<>((x,y)->map.get(y)-map.get(x));
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch : map.keySet()){
            pq.offer(ch);
        }
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            char ch = pq.poll();
            for(int i=0;i<map.get(ch);i++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
