package com.wz.decorater;

public class ComponentDecorator extends Component{

	private Component component;
	public ComponentDecorator(Component component) {
		// TODO Auto-generated constructor stub
		this.component=component;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		component.display();
	}

}
