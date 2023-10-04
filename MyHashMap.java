class MyHashMap {
    int MAX_SIZE = 1000000;
    int[] key = new int[MAX_SIZE];
    int[] value = new int[MAX_SIZE];
    int size = 0; // start
    int idx = 0;

    public MyHashMap() {
        
    }
    
    public void put(int key, int value) {
        do {
            if (key == this.key[]) {
                this.value[idx] = value;
            }
        } while (idx < MAX_SIZE && this.key[++idx] != 0);
        if (this.key[idx] == 0) {
            this.key[idx] = key;
            this.value[idx] = value;
        }
        for (int i = 0; i < MAX_SIZE; i++) {
            
        }
    }
    
    public int get(int key) {
        for (int i = 0; i < MAX_SIZE; i++) {
            if (key == this.key[i]) {
                return value[i];
            } else if (this.key[i] == 0) {
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