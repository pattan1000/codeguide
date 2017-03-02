import java.awt.Point;

public class Rectangle {
    public int width = 0;
    public int height = 0;
    public Point origin;
    
    public static void main (String[] args){
    	//TODO please declare the object of class rectangle.
    	
    }

    // four constructors
    public Rectangle() {
        origin = new Point(0, 0);
    }
    public Rectangle(Point p) {
        origin = p;
    }
    public Rectangle(int w, int h) {
        origin = new Point(0, 0);
        width = w;
        height = h;
    }
    public Rectangle(Point p, int w, int h) {
        origin = p;
        width = w;
        height = h;
    }

    // a method for moving the rectangle
    public void move(int x, int y) {
        origin.x = x;
        origin.y = y;
    }

    // a method for computing the area of the rectangle
    //TODO Please. complete the method
    public int getArea() {
        
    }
}

