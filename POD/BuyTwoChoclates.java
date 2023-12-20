package POD;

import java.util.Arrays;

public class BuyTwoChoclates {
        public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int p1=prices[0];
        int p2=prices[1];
        if(p1>money){
            return money;
        }
        else if((p1+p2)>money){
            return money;
        }else{
            return money-(p1+p2);
        }
    }
}
//O(nlogn)