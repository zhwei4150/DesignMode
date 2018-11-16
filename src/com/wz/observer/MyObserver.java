package com.wz.observer;

import java.util.Observable;
import java.util.Observer;

public class MyObserver implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		MyTarget mt=(MyTarget)o;
		System.out.println("我要更新了"+mt.getName());
	}

}
