class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;int j=0;int k=0;int m=nums1.length;
        int n=nums2.length;
        int o=m+n;
        int[] nums3=new int[o];
        while(i<m&&j<n){
            if(nums1[i]>nums2[j]){
                nums3[k]=nums2[j];
                j++;k++;
            }
            else{
               nums3[k]=nums1[i];
               i++;k++;
            }
        }
        while(i<m){
            nums3[k]=nums1[i];
               i++;k++;
        }
        while(j<n){
            nums3[k]=nums2[j];
                j++;k++;
        }
        if(nums3.length%2==1){
            double ans=nums3[nums3.length/2];
            return ans;
        }
        
        return (nums3[o / 2] + nums3[o / 2 - 1]) / 2.0;
    }
}