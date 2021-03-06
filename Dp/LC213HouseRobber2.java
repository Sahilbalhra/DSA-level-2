// https://leetcode.com/problems/house-robber-ii/
// You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed. All houses at this place are arranged in a circle. That means the first house is the neighbor of the last one. Meanwhile, adjacent houses have a security system connected, and it will automatically contact the police if two adjacent houses were broken into on the same night.

// Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.

 

// Example 1:

// Input: nums = [2,3,2]
// Output: 3
// Explanation: You cannot rob house 1 (money = 2) and then rob house 3 (money = 2), because they are adjacent houses.
// Example 2:

// Input: nums = [1,2,3,1]
// Output: 4
// Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
// Total amount you can rob = 1 + 3 = 4.
// Example 3:

// Input: nums = [1,2,3]
// Output: 3

public class LC213HouseRobber2 {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        return Math.max(robs(nums,0,n-1),robs(nums,1,n));
    }
    
    public int robs(int []nums,int start,int end){
        int max=0;
        int prevOne=0;
        int prevTwo=0;
        
        for(int i=start;i<end;i++){
            max=Math.max(nums[i]+prevTwo,prevOne);
            prevTwo=prevOne;
            prevOne=max;
        }
        return max;
    }
}
