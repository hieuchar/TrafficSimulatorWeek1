package exercise1;

import java.awt.Color;

import greenfoot.Actor;
import greenfoot.GreenfootImage;

public class Intersection extends Actor {
	int greenCounter = 100;
	int yellowCounter = 100;
	int redCounter = 100;
	int lightCounter;
	public Intersection(){
		GreenfootImage intersection = new GreenfootImage(TrafficWorld.ROADWIDTH, TrafficWorld.ROADWIDTH);
		intersection.setColor(Color.BLACK);
		intersection.fill();
		setImage(intersection);
	}
	public enum State{
		GREEN,YELLOW,RED;
	}
	State EWState = State.GREEN;
	State NSState = State.RED;
	public void act(){
		switch(EWState){
			case GREEN:
				greenCounter--;
				if(greenCounter == 0){
					EWState = State.YELLOW;
					greenCounter = 100;
				}
				break;
			case YELLOW:
				yellowCounter--;
				if(yellowCounter == 0){
					EWState = State.RED;
					NSState = State.GREEN;
					yellowCounter = 100;
				}
				break;
			case RED:
				redCounter--;
				if(redCounter == 0){
					EWState = State.GREEN;
					redCounter = 100;
				}
		}
	}
	public State currentEWColor(){
		return EWState;
	}
}
