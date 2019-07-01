package atividade4;

	
	public class MovableRectangle implements Movable {

	    private MovablePoint upperleftCorner;
	    private MovablePoint lowerleftcorner;

	    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
	    	upperleftCorner	= new MovablePoint(x1, y1, xSpeed, ySpeed);
	        lowerleftcorner = new MovablePoint(x2, y2, xSpeed, ySpeed);
	    }

	    public void moveUp() {
	        if ( ! equalsSpeed()) {
	            return;
	        }
	        upperleftCorner.y -= upperleftCorner.ySpeed;
	        lowerleftcorner.y -= lowerleftcorner.ySpeed;
	    }

	    public void moveDown() {
	        if ( ! equalsSpeed()) {
	            return;
	        }
	        upperleftCorner.y += upperleftCorner.ySpeed;
	        lowerleftcorner.y += lowerleftcorner.ySpeed;
	    }

	    public void moveLeft() {
	        if ( ! equalsSpeed()) {
	            return;
	        }
	        upperleftCorner.x -= upperleftCorner.xSpeed;
	        lowerleftcorner.x -= lowerleftcorner.xSpeed;
	    }

	    public void moveRight() {
	        if ( ! equalsSpeed()) {
	            return;
	        }
	        upperleftCorner.x += upperleftCorner.xSpeed;
	        lowerleftcorner.x += lowerleftcorner.xSpeed;
	    }

	    private boolean equalsSpeed() {
	        return (upperleftCorner.xSpeed == lowerleftcorner.xSpeed) && (upperleftCorner.ySpeed == lowerleftcorner.ySpeed);
	    }
    
	    public String toString() {
	        return ("MovableRectangle with Upper left corner "+  upperleftCorner.toString() +", bottomRight:" + lowerleftcorner.toString());
	    }
	}
	