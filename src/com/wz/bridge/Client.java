package com.wz.bridge;

public class Client {
	
	public static void main(String[] args) {
		Implementor impA=new ConcreteImplementorA();
		Implementor impB=new ConcreteImplementorB();
		
		Abstraction absA=new RefinedAbstractionA(impA);
		Abstraction absB=new RefinedAbstractionA(impB);
		absA.makeYouHappy();
		absB.makeYouHappy();
	}
}
