class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> res = new ArrayList<>();
        int leastIndSum = Integer.MAX_VALUE;
        for(int i = 0; i <list1.length;i++ ){
            map.put(list1[i], i);
        }
        for(int j =0; j <list2.length;j++){
            if(map.containsKey(list2[j])){
                int indSum = j+ map.get(list2[j]);
                if(indSum < leastIndSum){
                    res.clear();
                    res.add(list2[j]);
                    leastIndSum = indSum;
                }
                else if(indSum == leastIndSum){
                    res.add(list2[j]);
                }
            }
        }
        return res.toArray(new String[0]);
    }
}
