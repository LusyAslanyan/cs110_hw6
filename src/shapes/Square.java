package shapes;

public class Square {
	private int length;
	
	public Square() {
		length = 0;
	}
	
	public Square(int l) {
		length = l;
	}
	
	public int getArea() {
		return length * length;
	}
}
