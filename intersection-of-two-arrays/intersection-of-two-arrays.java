class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for(int i : nums1){
            set1.add(i);
        }
        Set<Integer> set2 = new HashSet<>();
        for(int j : nums2){
            if(set1.contains(j)){
              set2.add(j);
            }
        }
       // set1.retainAll(set2);
        int[] res = new int[set2.size()];
        int idx =0;
        for(int s : set2) res[idx++] = s;
        return res;
        
    }
}