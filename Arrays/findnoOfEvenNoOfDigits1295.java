package Arrays;

public class findnoOfEvenNoOfDigits1295 {
    public int findNumbers(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int d=nums[i];
            if(even(d)){
                ans++;
            }
        }
        return ans;
    }
    public static boolean even(int d){
        int numOfDigits=digits(d);
        if(numOfDigits%2==0){
            return true;
        }else{
            return false;
        }
    }
    public static int digits(int num){
        int count=0;
        if(num<0){
            num=num*-1;
        }
        else if(num==0){
            return 1;
        }
        while(num>0){
            num=num/10;
            count++;
        }
        return count;
    }
}
