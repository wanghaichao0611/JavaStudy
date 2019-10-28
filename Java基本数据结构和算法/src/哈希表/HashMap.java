package 哈希表;

public class HashMap<K,V> {
    private Entry<K,V>[] table;
    private int capacity=16;
    private int size;
    public HashMap(){
        table=new Entry[capacity];
    }
    //初始化HashMap大小
    public HashMap(int capacity){
        if (capacity<0){
            throw new IllegalArgumentException();
        }
        else {
            table=new Entry[capacity];
            size=0;
            this.capacity=capacity;
        }
    }
    //获得HashMap大小
    public int size(){
        return size;
    }
    //判断是否为空
    public boolean isEmpty(){
        return size==0?true:false;
    }
    //根据Key计算出hash值，hash算法原则：尽量不发生碰撞冲突
    private int hashCode(K key){
        double avg=key.hashCode()*(Math.pow(5,0.5)-1)/2;//hash策略为平凡取中法
        double numeric=avg-Math.floor(avg);
        return (int)Math.floor(numeric*capacity);
    }
    //以key value存入
    public void put(K key,V value){
        if (key==null){
            throw new IllegalArgumentException();
        }
        int hash=hashCode(key);
        Entry<K,V> kvEntry=new Entry<K,V>(key,value,hash,null);
        Entry<K,V> entry=table[hash];
        while (entry!=null){
            //如果存在修改
            if (entry.getKey().equals(key)){
                entry.setValue(value);
                return;
            }
            entry=entry.getNext();
        }
        //如果不存在，直接存入hash位置
        kvEntry.setNext(table[hash]);
        table[hash]=kvEntry;
        size++;
    }
    //根据key获得value
    public V get(K key){
        if (key == null) {
            return null;
        }
        int hash=hashCode(key);
        Entry<K,V> entry=table[hash];//获得hash位置元素
        while (entry!=null){
            //根据key获得value
            if (entry.getKey().equals(key)){
                return entry.getValue();
            }
            entry=entry.getNext();
        }
        return null;
    }
}
