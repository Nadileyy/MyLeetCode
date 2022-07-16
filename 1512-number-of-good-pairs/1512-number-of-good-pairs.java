// class Solution {
//     public int numIdenticalPairs(int[] nums) {
//         int count  = 0;
//         for(int i=0; i<nums.length;i++){
//             final int j=nums.length-i-1; // j= 6-0-1 =5   6-1-1 =4
//                 if(nums[i]==nums[j]) // nums[0] == nums[5] 
//                     count++; 0
//             }
        
//         return count;
//     }
// }

class Solution {
    public int numIdenticalPairs(int[] nums) {
      int counter=0;
        for(int i=0;i<nums.length;i++){
            for (int j=1; j<nums.length;j++){
                if(nums[i]==nums[j] && (i<j))
                {
                    counter++;
                }
            }
        }
        return counter;
    }
}