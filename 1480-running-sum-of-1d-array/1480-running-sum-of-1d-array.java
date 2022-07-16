// class Solution {
//     public int[] runningSum(int[] nums) {
//         int [] runningSumA = new int [nums.length];
//         int sum =0;
//         for(int i=0; i<nums.length;i++){
//             sum+=nums[i]; //1 1+2 3+3
//             runningSumA[i]=sum; // 1 3 6
//         }
            
//         return runningSumA;
//     }
// }

class Solution {
    public int[] runningSum(int[] nums) {
      for(int i=1;i<nums.length;i++){
          nums[i]=nums[i-1]+nums[i];
      }
        return nums;
    }
}