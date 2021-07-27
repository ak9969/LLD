package com.akshat.LLD;
/*
This is a Custom Map created to insert values with their respected keys
 Function:
  Put  -
  This function is to store key value pair inside the hash map
  get  -
  function takes input key and returns value based to the given key
  remove -
  Function takes input key and delete the respective value inside the hashmap;
 */
public class CustomHasMap<K,V>{
    private final int capacity = 16; //Initial default capacity
    private Entry<K, V>[] table; //Array of Entry object
    public CustomHasMap(){
        table = new Entry[capacity];
    }
    /*
    This function is to insert key value pair inside the hashmap
    */
    public void put(K key,V value){
        int index = index(key);
        Entry entry = new Entry(key,value,null);
        if(table[index] == null){
            table[index] = entry;
        }
        else{
            Entry<K,V> prev = null;
            Entry<K,V> curr = table[index];
            while(curr!=null){
                if(curr.getKey().equals(key)){
                    curr.setValue(value);
                    break;
                }
                prev = curr;
                curr = curr.getNext();
            }
            if(prev!=null){
                prev.setNext(entry);
            }
        }

    }
    public V get(K key){
        int index = index(key);
        Entry<K,V> entry = table[index];
        while(entry!=null){
            if(entry.getKey().equals(key)){
                return entry.getValue();
            }
            entry = entry.getNext();
        }
        return null;
    }
    public void remove(K key){
        int index = index(key);
        Entry<K,V> prev = null;
        Entry<K,V> curr = table[index];
        while(curr!=null){
            if(curr.getKey().equals(key)){
                if(prev == null){
                    curr = curr.getNext();
                    table[index] = curr;
                    return;
                }
                else{
                    prev.setNext(curr.getNext());
                    return;
                }
            }
            prev = curr;
            curr = curr.getNext();
        }
    }
    private int index(K key){
        if(key == null){
            return 0;
        }
        return Math.abs(key.hashCode() % capacity);
    }
}
