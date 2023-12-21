package Arrays;

public class SortAnArray912 {
        
    private void merge(int[] nums,int low, int mid, int high){
        int n = mid-low+1, m = high - mid;
        int[] left = new int[n];
        int[] right = new int[m];
        
        int i =0,j=0;
        for(i=0;i<n;i++)
            left[i] = nums[low+i];
        
        for(i=0;i<m;i++)
            right[i] = nums[i+mid+1];
        
        i=0;
        j=0;
        int k = low;
        while(i<n && j<m){
            if(left[i]<right[j])
                nums[k++] = left[i++];
            else
                nums[k++] = right[j++];
        }
        
        while(i<n)
            nums[k++] = left[i++];
        
        while(j<m)
            nums[k++] = right[j++];
        
    }
    
    private void sort(int[] nums, int low, int high ){
        if(low<high){
            int mid = low + ((high - low) / 2 );
            
            sort(nums,low,mid);
            sort(nums,mid+1,high);
            
            merge(nums, low, mid, high);
        }
    }
    
    public int[] sortArray(int[] nums) {
        sort(nums,0,nums.length-1);
        return nums;
    }
}
