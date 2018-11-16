package com.wz.bridge;

public class RefinedAbstractionA extends Abstraction{

	public RefinedAbstractionA(Implementor implementor) {
		super(implementor);
	}

	@Override
	public void makeYouHappy() {
		// TODO Auto-generated method stub
		System.out.println("A类型的妹子");
		mImp.skill();
	}

}
