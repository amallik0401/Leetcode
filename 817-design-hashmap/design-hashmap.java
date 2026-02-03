class MyHashMap {

    int []a;
    public MyHashMap() {
        a = new int[1000001];
        Arrays.fill(a , Integer.MAX_VALUE);
    }
    
    public void put(int key, int value) {
        a[key] = value;
    }
    
    public int get(int key) {
        if(a[key]!=Integer.MAX_VALUE)
            return a[key];
        else
            return -1;
    }
    
    public void remove(int key) {
        a[key] = Integer.MAX_VALUE;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */