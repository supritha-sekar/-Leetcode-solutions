class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pre=1;
        int post=1;
        int[] result=new int[nums.length];
        for(int i=0;i<result.length;i++){
            result[i]=1;
        }
        for(int i=0;i<result.length;i++){
            result[i]*=pre;
            pre*=nums[i];
        }
        for(int i=result.length-1;i>=0;i--){
            result[i]*=post;
            post*=nums[i];
        }
        return result;
        
    }
}