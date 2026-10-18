class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] pair = new int[2];
        java.util.HashMap<Integer,Integer> map = new java.util.HashMap();  
        for (int i = 0; i< nums.length ; i++){
            if(map.containsKey(target-nums[i])){
                pair[1]=i; pair[0]= map.get(target-nums[i]);
            }
            map.put(nums[i], i);
                
        }
        return pair;     
    }
}
