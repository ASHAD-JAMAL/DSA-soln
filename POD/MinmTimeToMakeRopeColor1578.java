package POD;

public class MinmTimeToMakeRopeColor1578 {
    public int minCost(String colors, int[] neededTime) {
        int max=0;
        int ans=0;
        for(int i=0;i<neededTime.length;i++){
            if(i>0 && colors.charAt(i)==colors.charAt(i-1))
            {
                ans+=Math.min(max,neededTime[i]);
                max=Math.max(max,neededTime[i]);
            }else{
                max=neededTime[i];
            }
        }
        return ans;
    }
}
