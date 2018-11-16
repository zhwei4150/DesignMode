package com.wz.bridge;

public abstract class Abstraction {
	
	protected Implementor mImp;
	
	public Abstraction(Implementor implementor){
		this.mImp=implementor;
	}
	public abstract void makeYouHappy();
}
