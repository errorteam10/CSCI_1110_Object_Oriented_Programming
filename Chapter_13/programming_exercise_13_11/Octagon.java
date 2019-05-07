class Octagon 
	extends GeometricObject implements Cloneable, Comparable<Octagon> {
		
		protected static double 	sideA;
		
		public Octagon(double sideA, String color, Boolean filled) {
			
			// Define Triangle Attributes
			this.sideA = sideA;
			this.color = color;
			this.filled = filled;
		}
		
		public Octagon() {
			
			// Define Triangle Attributes
			this.sideA = 1;
			this.color = "White";
			this.filled = true;
		}
		
		// Set Side A Values
		public void setSideA(double sideA) {
			this.sideA = sideA;
		}
		
		// Read Side A value
		public double getSideA() {
			return this.sideA;
		}
					
		// Get Area
		@Override
		public double getArea() {
			return (2 + (4 / Math.sqrt(2)) * this.sideA * this.sideA);
		}
		
		// Get Perimeter
		@Override
		public double getPerimeter() {
			return this.sideA * 8;
		}
		
		@Override
		public Object clone() throws CloneNotSupportedException {
			return super.clone();
		}
		
		@Override 
		public int compareTo(Octagon o) {
			if(getArea() != o.getArea())
				return 1;
			else
				return 0;
		}
}