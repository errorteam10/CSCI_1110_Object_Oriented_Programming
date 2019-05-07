public class Rectangle extends GeometricObject implements Colorable {
	private double width;
	private double height;

	public Rectangle() {
		this.width = 1;
		this.height = 1;
		this.color = "white";
		this.filled = true;
	}

	public Rectangle(double width, double height, String color, boolean filled) {
		this.width = width;
		this.height = height;
		this.color = color;
		this.filled = filled;
	}

	/** Return width */
	public double getWidth() {
		return width;
	}

	/** Set a new width */
	public void setWidth(double width) {
		this.width = width;
	}

	/** Return height */
	public double getHeight() {
		return height;
	}

	/** Set a new height */
	public void setHeight(double height) {
		this.height = height;
	}

	@Override /** Return area */
	public double getArea() {
		return width * height;
	}

	@Override /** Return perimeter */
	public double getPerimeter() {
		return 2 * (width + height);
	}
	
	@Override
	public void howToColor() {
		System.out.print("\n \n Color all four sides");
	}
}