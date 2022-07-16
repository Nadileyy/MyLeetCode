class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] result = new int[nums.length];
        for(int i=0 ;i<n;i++){
            result[2*i]=nums[i]; // even index takes x elements
            result[2*i + 1] = nums [n+i]; // odd index takes y element
        }
        return result;
    }
}