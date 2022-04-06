class Solution {
    public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> m = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
       int sum = target - nums[i];
       if (m.containsKey(sum)) {
         return new int[] { m.get(sum), i };
        }
     m.put(nums[i], i);
}
throw new IllegalArgumentException("No two sum solution");
    } 
    }
        
    
