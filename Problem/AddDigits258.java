package Problem;
public class AddDigits258 {
    public int addDigits(int num) {
        int sum=0;
        if(num==0){
            return 0;
        }
        while(num>0){
            sum+=num%10;
            num=num/10;
            if(num==0 && sum>9){
                num=sum;
                sum=0;
            }
        }
        return sum;
    }
}
