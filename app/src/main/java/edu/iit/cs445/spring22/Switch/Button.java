package edu.iit.cs445.spring22.Switch;

import edu.iit.cs445.spring22.LightSource.*;

public class Button extends Switches{

	public Button() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Button(Lightbulb l) {
		super(l);
	}

	public void switchOn() {
		System.out.println("Button switched ON");
		super.switchOn();
	}
	public void switchOff() {
		System.out.println("Button switched OFF");
		super.switchOff();
	}

}
