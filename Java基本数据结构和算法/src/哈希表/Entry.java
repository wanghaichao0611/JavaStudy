package 哈希表;

public class Entry<K,V> {
    private K key;//键
    private V value;//值
    private int hash;//hash值
    private Entry<K,V> next;//指向Entry，单链表结构
    public Entry(K key,V value,int hash,Entry<K,V> next){
        this.key=key;
        this.value=value;
        this.hash=hash;
        this.next=next;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public int getHash() {
        return hash;
    }

    public void setHash(int hash) {
        this.hash = hash;
    }

    public Entry<K, V> getNext() {
        return next;
    }

    public void setNext(Entry<K, V> next) {
        this.next = next;
    }
}
