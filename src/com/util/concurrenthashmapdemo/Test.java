package com.util.concurrenthashmapdemo;

import java.util.concurrent.ConcurrentHashMap;

public class Test {
	public static void main(String[] args) {
		ConcurrentHashMap map= new ConcurrentHashMap();
		map.put(101,"A");
		map.put(102,"B");
		map.put(103,"C");
		map.putIfAbsent(101, "D");
		System.out.println(map);
		map.putIfAbsent(104, "A");
		System.out.println(map);
		map.remove(101,"D");
		System.out.println(map);
		map.remove(101,"A");
		System.out.println(map);
		map.replace(104, "A", "D");
		map.put("107",null);
		System.out.println(map);
	}

}
