package exercise1;

import java.util.Random;

import greenfoot.Actor;
import greenfoot.GreenfootImage;

public class Car extends Actor {
	private GreenfootImage image;
	private Orientation dir;
	public Car(Orientation dir){
		Random rand = new Random();
		this.dir = dir;
		int x = rand.nextInt(4);
		switch(x){
		case 0:
			image = new GreenfootImage("images/topCarBlue.png");
			this.setImage(image);
			break;
		case 1:
			image = new GreenfootImage("images/topCarRed.png");
			this.setImage(image);
			break;
		case 2:
			image = new GreenfootImage("images/topCarPurple.png");
			this.setImage(image);
			break;
		case 3:
			image = new GreenfootImage("images/topCarYellow.png");
			this.setImage(image);
			break;
		}
	}
	@Override
	public void act(){
		this.move(1);
		if(this.isAtEdge()){
			if(dir.equals(Orientation.NORTH) || dir.equals(Orientation.SOUTH)){
				if(this.getY() == 0){
					this.setLocation(this.getX(), TrafficWorld.HEIGHT);
				}
				else {
					this.setLocation(this.getX(), 0);
				}
			}
			
			else if(dir.equals(Orientation.EAST) || dir.equals(Orientation.WEST)){
				if (this.getX() == 0){
					this.setLocation(1000, this.getY());
				}
				else {
					this.setLocation(0, this.getY());
				}
			}
		}
	}
	public Orientation getOrientation(){
		return dir;
	}
	public int getWidth(){
		return image.getWidth();
	}
	
}
