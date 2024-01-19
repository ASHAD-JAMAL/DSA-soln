package Arrays;

import java.util.ArrayList;

public class MergerSortedArray88 {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                arr.add(nums1[i]);
                i++;
            }else{
                arr.add(nums2[j]);
                j++;
            }
        }
        while(i<m){
            arr.add(nums1[i]);
            i++;
        }
        while(j<n){
            arr.add(nums2[j]);
            j++;
        }
        for(int k=0;k<m+n;k++){
            nums1[k]=arr.get(k);
        }
    }
}
