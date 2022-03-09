package edu.iit.cs445.spring22.LightSource;

public class Lightbulb{
	private boolean lightSourceOn = false;

	public Lightbulb() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void on() {
		System.out.println("Lightbulb on");
		this.setLightSourceOn(true);
	}
	public void off() {
		System.out.println("Lightbulb off");
		this.setLightSourceOn(false);
	}
	public boolean getLightSourceOn() {
		return this.lightSourceOn;
	}
	public void setLightSourceOn(Boolean b) {
		lightSourceOn = b;
	}

}
