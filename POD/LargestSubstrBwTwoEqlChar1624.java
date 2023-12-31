package POD;

public class LargestSubstrBwTwoEqlChar1624 {
    public int maxLengthBetweenEqualCharacters(String s) {
        int maxD=-1;
        for(int i=0;i<s.length();i++){
            char first=s.charAt(i);
            for(int j=s.length()-1;j>i;j--){
               if(first==s.charAt(j)){
                    int dis=j-i-1;
                    maxD=Math.max(maxD,dis);
               }
            }
        }
        return maxD;
    }
}
