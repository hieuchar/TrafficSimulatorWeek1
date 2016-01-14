package exercise1;

import exercise1.Intersection.State;
import greenfoot.Actor;
import greenfoot.GreenfootImage;

public class TrafficLight extends Actor {
	private GreenfootImage image;
	private Intersection inter;
	private State color;
	public TrafficLight(Intersection inter){
		this.inter = inter;
	}
	public void act(){
		color = inter.currentEWColor();
		switch(color){
			case GREEN:
				image = new GreenfootImage("images/trafficLightGreen.png");
				this.setImage(image);
				break;
			case YELLOW:
				image = new GreenfootImage("images/trafficLightYellow.png");
				this.setImage(image);
				break;
			case RED:
				image = new GreenfootImage("images/trafficLightRed.png");
				this.setImage(image);
				break;
				
		}
	}

}
