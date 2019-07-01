package atividade4;

public class MovablePoint implements Movable{
	protected int x;
	protected int y;
	protected int xSpeed;
	protected int ySpeed;
	
	public MovablePoint(int x, int y, int xSpeed, int ySpeed){
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	
	public void moveUp() {
		y+=1;
	}

	public void moveDown() {
		y-=1;
	}

	public void moveLeft() {
		x-=1;
	}

	public void moveRight() {
		x+=1;
	}
	
	public String toString() {
		return "Movable point ( " +this.x +"," + this.y + " )"
				+ " Speed x: " + this.xSpeed + " Speed y: " + this.ySpeed;
	}
}
