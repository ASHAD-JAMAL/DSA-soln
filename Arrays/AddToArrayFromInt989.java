package Arrays;

import java.util.ArrayList;
import java.util.List;

public class AddToArrayFromInt989 {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int carry = k;
        for (int i = num.length - 1; i >= 0 || carry > 0; i--) {
            if (i >= 0) {
                carry += num[i];
            }
            list.add(0, carry % 10);
            carry /= 10;
        }
        return list;
    }
}
