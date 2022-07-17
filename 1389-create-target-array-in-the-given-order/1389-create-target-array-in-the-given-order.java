class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int [] target = new int [nums.length];
         ArrayList<Integer> arraylist = new ArrayList<Integer>();
        
        for(int i=0; i<index.length;i++){
            arraylist.add(index[i],nums[i]);
        }
        //converting arraylist to array
       for(int i = 0;i<arraylist.size();i++){
            target[i] = (Integer)arraylist.get(i);
        }
        return target;
}
}