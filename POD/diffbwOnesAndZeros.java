package POD;

public class diffbwOnesAndZeros {
    public int[][] onesMinusZeros(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[] oneRowi=new int[n];
        int[] zerosRowi=new int[n];
        int[] oneColj=new int[m];
        int[] zerosColj=new int[m];
        int[][] diff =new int[n][m];
        for(int i=0;i<n;i++){
            int a=0;
            int b=0;
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    a++;
                }else{
                    b++;
                }
            }
            oneRowi[i]=a;
            zerosRowi[i]=b;
        }
        for(int j=0;j<m;j++){
            int a=0;
            int b=0;
            for(int i=0;i<n;i++){
                if(grid[i][j]==1){
                    a++;
                }else{
                    b++;
                }
            }
            oneColj[j]=a;
            zerosColj[j]=b;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int ans=oneRowi[i]+oneColj[j]-zerosRowi[i]-zerosColj[j];
                diff[i][j]=ans;
            }
        }
        return diff;
    }
}
