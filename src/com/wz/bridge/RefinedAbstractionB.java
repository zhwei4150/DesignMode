package com.wz.bridge;

public class RefinedAbstractionB extends Abstraction {

	public RefinedAbstractionB(Implementor implementor) {
		super(implementor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeYouHappy() {
		// TODO Auto-generated method stub
		System.out.println("B类型的妹子");
		mImp.skill();
	}

}
