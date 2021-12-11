package com.util.concurrenthashmapdemo;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class FixedConcurrentModification  extends Thread{
	static ConcurrentHashMap map = new ConcurrentHashMap();
	
	public void run() {
		try {
			Thread.sleep(2000);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		map.put(104,"D");
	}
	
	public static void main(String[] args) throws InterruptedException{
		
		map.put(101,"A");
		map.put(102,"B");
		map.put(103,"C");
		
		FixedConcurrentModification t= new FixedConcurrentModification();
		t.start();
		Set s=map.keySet();
		
		Iterator i=s.iterator();
		
		while(i.hasNext()) {
			Integer l1=(Integer)i.next();
			
			System.out.println("key is "+ l1+"  and value is "+map.get(l1));
			Thread.sleep(3000);
			
		}
		
		System.out.println(map);
		
	}

}

