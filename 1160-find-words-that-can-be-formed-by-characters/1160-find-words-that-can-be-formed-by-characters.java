class Solution {
    public int countCharacters(String[] words, String chars) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : chars.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        int res =0;
        for(String word : words){
            char[] table = new char[26];
            int temp = word.length();
            for(char c : word.toCharArray()){
                table[c-'a']++;
            }
            for(int i = 0; i<26;i++){
                if(map.getOrDefault((char)(i+'a'), 0) < table[i]){
                    temp = 0;
                    break;
                }
            }
            res += temp;
        }
        
        return res;
    }
}