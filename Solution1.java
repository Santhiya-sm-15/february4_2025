class Solution {
    public int maxAscendingSum(int[] nums) {
        int max=0,n=nums.length,i,sum=nums[0];
        for(i=1;i<n;i++)
        {
            if(nums[i-1]<nums[i])
                sum+=nums[i];
            else
            {
                max=Math.max(max,sum);
                sum=nums[i];
            }
        }
        max=Math.max(max,sum);
        return max;
    }
}