// Design a data structure that works like a LRU Cache. Here cap denotes the capacity of the cache and Q denotes the number of queries. Query can be of two types:
// PUT x y: sets the value of the key x with value y
// GET x: gets the value of key x if present else returns -1.
// The LRUCache class has two methods get() and put() which are defined as follows.
// get(key): returns the value of the key if it already exists in the cache otherwise returns -1.
// put(key, value): if the key is already present, update its value. If not present, add the key-value pair to the cache. If the cache reaches its capacity it should remove the least recently used item before inserting the new item.
// In the constructor of the class the capacity of the cache should be initialized.

class LRUCache {
private int cap;
private Map<Integer, Integer> cacheMap;
private LinkedList<Integer> lruList;
    LRUCache(int cap) {
        this.cap = cap;
        this.cacheMap = new HashMap<>();
        this.lruList = new LinkedList<>();
    }

    public  int get(int key) {
        if( !cacheMap.containsKey(key)){
            return -1;
        }
        lruList.remove(Integer.valueOf(key));
        lruList.addFirst(key);
        return cacheMap.get(key);
    }
    public  void put(int key, int value) {
        if(cacheMap.containsKey(key)){
            cacheMap.put(key, value);
            lruList.remove(Integer.valueOf(key));
            lruList.addFirst(key);
        }else{
            if(cacheMap.size() >= cap){
                int leastusedkey = lruList.removeLast();
                cacheMap.remove(leastusedkey);
            
            }
            cacheMap.put(key, value);
            lruList.addFirst(key);
        }
    }
}
