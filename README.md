# february4_2025
The problems that I solved today

1.Given an array of positive integers nums, return the maximum possible sum of an ascending subarray in nums. A subarray is defined as a contiguous sequence of numbers in an array. A subarray [numsl, numsl+1, ..., numsr-1, numsr] is ascending if for all i where l <= i < r, numsi  < numsi+1. Note that a subarray of size 1 is ascending.

Code:
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
