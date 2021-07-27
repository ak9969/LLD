package com.akshat.LLD;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CustomHasMap<Integer, String> map = new CustomHasMap<Integer, String>();
        map.put(1,"Nothing");
        map.put(2,"Not");
        map.put(3,"Nng");
        System.out.println(map.get(3));
        map.remove(1);
        System.out.println(map.get(1));



    }
}
