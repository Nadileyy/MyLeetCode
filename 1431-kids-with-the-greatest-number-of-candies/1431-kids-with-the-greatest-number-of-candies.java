class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // find the max Candi first
        int maxCandi=-1;
        for(int i=0; i<candies.length;i++){
            maxCandi = Math.max(candies[i], maxCandi);
        }
        // max is found
        // let's check if the calculations will be greatest or not 
        List <Boolean> array = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            array.add(candies[i]+extraCandies>=maxCandi);
        }
        return array;
    }
}