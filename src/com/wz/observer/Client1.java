package com.wz.observer;

public class Client1 {
	public static void main(String[] args) {
		MyObserver ob=new MyObserver();
		MyTarget mt=new MyTarget();
		mt.addObserver(ob);
		mt.wantUpdate("wz");
	}
}
