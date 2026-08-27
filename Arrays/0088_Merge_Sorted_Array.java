class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        
    int f=m-1;
    int s=n-1;
    int k=nums1.length-1;
    while(f>=0&&s>=0){
        if(nums1[f]>nums2[s]){
            nums1[k]=nums1[f];
           
            f--;
        }
        else{
           nums1[k]=nums2[s];
           s--;
        }
         k--;
    }
    while(f>=0){
        nums1[k]=nums1[f];
           
            f--;
              k--;
    }
    while(s>=0){
         nums1[k]=nums2[s];
           s--;
             k--;
    }
    
    }
}