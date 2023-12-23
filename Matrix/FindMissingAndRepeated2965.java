package Matrix;

import java.util.HashSet;
import java.util.Set;

public class FindMissingAndRepeated2965 {
        public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        Set<Integer> set=new HashSet<>();
        int ans[]=new int[2];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(set.contains(grid[i][j])){
                    ans[0]=grid[i][j];
                }
                set.add(grid[i][j]);
            }
        }
        n=n*n;
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                ans[1]=i;
                break;
            }
        }
        return ans;
    }
}
