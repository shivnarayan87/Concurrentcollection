package com.util.copyonwritearraylist;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class MyArrayList extends Thread {
	static CopyOnWriteArrayList cowal= new CopyOnWriteArrayList();
	
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		cowal.add("D");
	}
	
	public static void main(String[] args) throws InterruptedException{
		
		cowal.add("A");
		cowal.add("B");
		cowal.add("C");
		
		MyArrayList list= new MyArrayList();
		list.start();
		
		Iterator i=cowal.iterator();
		
		while(i.hasNext()) {
			String value =(String)i.next();
			System.out.print(value+"  ");
			Thread.sleep(3000);
			
		}
		System.out.println(cowal);
		
		
	}

}
