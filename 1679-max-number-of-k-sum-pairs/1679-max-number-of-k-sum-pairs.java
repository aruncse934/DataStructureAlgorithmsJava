class Solution {
    public int maxOperations(int[] nums, int k) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            int res = k - n; 
            if(map.containsKey(res) && map.get(res) > 0){
                count++;
                map.put(res, map.get(res) - 1);
            }
            else{
                map.put(n, map.getOrDefault(n, 0)+1);
            }
        }
        return count;
        
    }
}