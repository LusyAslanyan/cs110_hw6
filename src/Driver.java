import shapes.Square;
import shapes.Rectangle;
import utils.Math;

	public class Driver {

		public static void main(String[] args) {
			Square sqr = new Square(90);
			System.out.println(sqr.getArea());
			
			Rectangle rect = new Rectangle(60, 70);
			System.out.println(rect.getArea());
			
			System.out.println(Math.factorial((int)(15.6)));
			System.out.println(Math.factorialLoop((int)(15.6)));
		}

	}
