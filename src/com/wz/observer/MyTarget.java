package com.wz.observer;

import java.util.Observable;

public class MyTarget extends Observable{
	private String name;
	
	public String getName(){
		return this.name;
	}
	
	public void wantUpdate(String name){
		this.name=name;
		System.out.println("要发生更新了");
		setChanged();
		notifyObservers(this);
	}
}
