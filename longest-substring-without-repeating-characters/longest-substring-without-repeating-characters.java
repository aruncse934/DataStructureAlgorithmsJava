class Solution {
    public int lengthOfLongestSubstring(String s) {
       int n = s.length(); int left = 0; int right =0;
       Set<Character> set = new HashSet<>();
        int max= 0;
        while(right <n){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                max = Math.max(max, right-left+1);
                right++;
            }else{
                set.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}
  