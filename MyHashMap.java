class MyHashMap {
    int MAX_SIZE = 1000000;
    int[] key = new int[MAX_SIZE];
    int[] value = new int[MAX_SIZE];
    int i = 0; // start

    public MyHashMap() {
        
    }
    
    public void put(int key, int value) {
        do {
            if (key == this.key[i]) {
                this.value[i] = value;
            }
        } while (i < MAX_SIZE && this.key[++i] != 0);
        if (this.key[i] == 0) {
            this.key[i] = key;
            this.value[i] = value;
        }
    }
    
    public int get(int key) {
        
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