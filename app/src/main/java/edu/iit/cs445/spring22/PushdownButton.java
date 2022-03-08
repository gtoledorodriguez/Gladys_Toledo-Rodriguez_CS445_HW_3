package edu.iit.cs445.spring22;

public class PushdownButton extends Switches{

	public PushdownButton() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public PushdownButton(Lightbulb l) {
		super(l);
	}

	public void pushButton() {
		
		if (!super.getIsSwitchOn()) {	
			System.out.println("Button switched ON");
			super.setIsSwitchOn(true);
			
		}else {
			System.out.println("Button switched OFF");
			super.setIsSwitchOn(false);	
		}
		super.pushButton();
	}
	

}
