package com.wz.observer;

public class Player implements Observer{

	private String name;
	
	public Player(String name){
		this.name=name;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
	}

	@Override
	public void help() {
		System.out.println("hold on!"+this.name+"save to you!");
	}

	@Override
	public void beAttacked(AllyControlCenter acc) {
		// TODO Auto-generated method stub
		System.out.println(this.name + "被攻击！");  
        acc.notifyObserver(name);
		
	}

}
