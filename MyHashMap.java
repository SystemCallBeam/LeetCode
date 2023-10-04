class MyHashMap {
    int MAX_SIZE = 1000000;
    int[] mykey = new int[MAX_SIZE];
    int[] myvalue = new int[MAX_SIZE];
    int size = 0; // start
    int idx = 0;

    public MyHashMap() {
        
    }
    
    public void put(int key, int value) {
        do {
            if (key == mykey[idx]) {
                myvalue[idx] = value;
            }
        } while (idx < MAX_SIZE && mykey[++idx] != 0);
        if (mykey[idx] == 0) {
            mykey[idx] = key;
            myvalue[idx] = value;
        }
        for (int i = 0; i < MAX_SIZE; i++) {
            if ()
        }
    }
    
    public int get(int key) {
        for (int i = 0; i < MAX_SIZE; i++) {
            if (key == mykey[i]) {
                return myvalue[i];
            } else if (mykey[i] == 0) {
                return -1;
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */