class Solution {
    public char repeatedCharacter(String s) {
        Set<Character>  set = new HashSet<>();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(int i = 0; i<s.length(); i++){
            if(!set.add(s.charAt(i)))
                map.put(s.charAt(i), i);
            else
                map.remove(s.charAt(i));
        }
        return map.isEmpty() ? ' ' : map.entrySet().iterator().next().getKey();
    }
    
}