class MyHashMap {
    int MAX_SIZE = 1000000;
    int[] myvalue = new int[MAX_SIZE];

    public MyHashMap() {
        for (int i = 0; i < MAX_SIZE; i++) {
            myvalue[i] = -1;
        }
    }
    
    public void put(int key, int value) {
        myvalue[key] = value;
    }
    
    public int get(int key) {
        return myvalue[key];
    }
    
    public void remove(int key) {
        myvalue[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */