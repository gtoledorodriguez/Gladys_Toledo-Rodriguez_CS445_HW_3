package edu.iit.cs445.spring22.Switch;

import edu.iit.cs445.spring22.LightSource.*;

public class Switches {
	Lightbulb ls;
	private boolean isSwitchOn = false;
	public Switches() {
	}

	public Switches(Lightbulb ls) {
		this.ls = ls;
	}
	
	public void switchOn() {
		setIsSwitchOn(true);
		if (ls != null){
			ls.on();
		}
	}
	public void switchOff() {
		setIsSwitchOn(false);
		if (ls != null){
			ls.off();
		}
	}
	public void pushButton() {
		if (ls != null){
			if(getIsSwitchOn()) {
				ls.on();
			}else {
				ls.off();
			}
		}
	}
	
	public boolean getIsSwitchOn() {
		return isSwitchOn;
	}
	public void setIsSwitchOn(Boolean b) {
		isSwitchOn = b;
	}

}
