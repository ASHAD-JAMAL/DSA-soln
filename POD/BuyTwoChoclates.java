package POD;

import java.util.Arrays;
//O(nlogn)
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


//O(n)Approach
// public class BuyTwoChoclates {
//     public int buyChoco(int[] prices, int money) {
//         int min1=Integer.MAX_VALUE;
//         int min2=Integer.MAX_VALUE;
//         for(int price :prices){
//             if(price<min1){
//                 min2=min1;
//                 min1=price;
//             }else if(price<min2){
//                 min2=price;
//             }
//         }
//         if((min1+min2)>money || min1>money){
//             return money;
//         }
//         return money-(min1+min2);
//     }
// }