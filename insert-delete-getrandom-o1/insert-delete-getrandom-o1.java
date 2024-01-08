class RandomizedSet {
   Map<Integer,Integer> map = null;
   int[] arr = null;
   int index= 0;
   Random rand = null;
   int pos =0;
    public RandomizedSet() {
        map = new HashMap<>();
        arr = new int[100001];
        rand = new Random();
    }
    
    public boolean insert(int val) {
       if(map.containsKey(val)) return false;
       else 
            arr[index] = val;
            map.put(val,index);
            index++;
            return true;
    }
    
    public boolean remove(int val) {
       if(!map.containsKey(val)) return false;
       else 
             pos= map.remove(val);
            arr[pos] = arr[index-1];
            index--; 
             if(map.containsKey(arr[pos])) map.put(arr[pos], pos);
        return true;
    }
    
    public int getRandom() {
       return arr[rand.nextInt(index)]; 
    }
}

    
  
/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */