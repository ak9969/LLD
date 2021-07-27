package com.akshat.LLD;

public class Entry<K,V> {
    private final K key;  //Key to map the data
    private V value;      // Values to be stored
    private Entry<K,V> next; // Next pointer
    public Entry(K key,V value,Entry<K,V> next){
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public Entry<K, V> getNext() {
        return next;
    }

    public void setNext(Entry<K, V> next) {
        this.next = next;
    }
}
