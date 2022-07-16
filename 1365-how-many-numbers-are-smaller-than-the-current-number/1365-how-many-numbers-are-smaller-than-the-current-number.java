// class Solution {
//     public int[] smallerNumbersThanCurrent(int[] nums) {
        
//         int [] newArray = new int [nums.length];
//         for(int i=0;i<nums.length;i++){
//             int counter=0;
//             for(int j=0;j<nums.length;j++){ 
//                 if(nums[i]>nums[j]){ //1>2 x
//                     counter++; 
//                 }
//             }
//             newArray[i] = counter;
//         }
//         return newArray;
//     }
// }
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int [] result = new int [nums.length];
        for (int i=0; i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){

                if(nums[i]>nums[j]){
                    count++;
                }
                result[i]=count;
            }
        }
        return result;
        
    }
}