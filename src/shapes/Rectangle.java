package shapes;

public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle() {
		width = 0;
		height = 0;
	}
	
	public Rectangle(int w, int h) {
		width = w;
		height = h;
	}
	
	public int getArea() {
		return width * height;
	}
}
