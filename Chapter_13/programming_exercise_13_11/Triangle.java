public class Triangle 
	extends GeometricObject {
		
		protected static double 	sideA;
		protected static double 	sideB;
		protected static double 	sideC;
		
		public Triangle(double sideA, double sideB, double sideC, String color, Boolean filled) {
			
			// Define Triangle Attributes
			this.sideA = sideA;
			this.sideB = sideB;
			this.sideC = sideC;
			this.color = color;
			this.filled = filled;
		}
		
		public Triangle() {
			
			// Define Triangle Attributes
			this.sideA = sideA;
			this.sideB = sideB;
			this.sideC = sideC;
			this.color = color;
			this.filled = filled;
		}
		
		// Set Side A Values
		public void setSideA(double sideA) {
			this.sideA = sideA;
		}
		
		// Set Side B Values
		public void setSideB(double sideB) {
			this.sideB = sideB;
		}
		
		// Set Side C Values
		public void setSideC(double sideC) {
			this.sideC = sideC;
		}
		// Read Side A value
		public double getSideA() {
			return this.sideA;
		}
			
		// Read Side B Value
		public double getSideB() {
			return this.sideB;
		}
			
		// Read Side C Value
		public double getSideC() {
			return this.sideC;
		}
		
		// Get Area
		@Override
		public double getArea() {
			double s = (this.sideA + this.sideB + this.sideC) / 2;
			return Math.sqrt(s * ((s - this.sideA) * (s - sideB) * (s - sideC)));
		}
		
		// Get Perimeter
		@Override
		public double getPerimeter() {
			return this.sideA + this.sideB + this.sideC;
		}
}