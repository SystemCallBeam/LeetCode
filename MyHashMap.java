class MyHashMap {
    int MAX_SIZE = 1000000;
    int[] mykey = new int[MAX_SIZE];
    int[] myvalue = new int[MAX_SIZE];
    int size = 0; // start

    public MyHashMap() {
        
    }
    
    public void put(int key, int value) {
        for (int i = 0; i < MAX_SIZE; i++) {
            if (mykey[i] == key) {
                mykey[i] = key;
                myvalue[i] = value;
                break;
            } else if (mykey[i] == 0) {
                mykey[i] = key;
                myvalue[i] = value;
                size++;
                break;
            }
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
        for (int i = 0; i < MAX_SIZE; i++) {
            if (key == mykey[i]) {
                size--;
                mykey[i] = mykey[size];
                myvalue[i] = myvalue[size];
                mykey[size] = 0;
                myvalue[size] = 0;
                break;
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */