package com.concurrentcollectiondemo;

import java.util.ArrayList;
import java.util.Iterator;

public class MyThread extends Thread{
	
	static ArrayList l= new ArrayList();
	
	public void run() {
		try {
			Thread.sleep(2000);
			l.add("D");
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
	
	
	public static void main(String[] args)throws InterruptedException {
		l.add("A");
		l.add("B");
		l.add("C");
		MyThread t= new MyThread();
		t.start();
		Iterator i=l.iterator();
		
		while(i.hasNext()) {
			String s=(String)i.next();
			System.out.println(s);
			Thread.sleep(3000);
			
		}
		
	}
	

}
