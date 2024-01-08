class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String str = new String(c);
            map.computeIfAbsent(str, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());        
    }
}

       