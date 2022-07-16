class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=Integer.MIN_VALUE;
        for(int row =0; row<accounts.length;row++){
            int sum=0; // calculate the wealth in each row
            for(int col=0; col<accounts[row].length; col++){
                sum+= accounts[row][col];
                if(sum>max){
                    max=sum;
                }
            }
        }
        return max;
    }
}