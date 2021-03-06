// https://leetcode.com/problems/squares-of-a-sorted-array/

// Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

 

// Example 1:

// Input: nums = [-4,-1,0,3,10]
// Output: [0,1,9,16,100]
// Explanation: After squaring, the array becomes [16,1,0,9,100].
// After sorting, it becomes [0,1,9,16,100].
public class LC977 {
    //     public int[] sortedSquares(int[] nums) {
//         for(int i=0;i<nums.length;i++){
//             nums[i]=nums[i]*nums[i];
//         }
//          Arrays.sort(nums); 
//         return nums;
        
//     }
public int[] sortedSquares(int[] nums) {
    int [] ans=new int[nums.length];
    int i=0;
    int j=nums.length-1;
    for(int k=nums.length-1;k>=0;k--){
        if(Math.abs(nums[i])>nums[j]){
            ans[k]=nums[i]*nums[i];
            i++;

        }else{
            ans[k]=nums[j]*nums[j];
            j--;
        }
    }
  
  
    return ans;
   
}
    
}
