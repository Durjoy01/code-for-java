public class Triangle extends Polygon {
	private double sideA;
	private double sideB;
	private double sideC;

	public Triangle() {
	}

	public Triangle(int numSide, double sideA, double sideB, double sideC) {
		super(numSide);
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	public double getSideA() {
		return sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}

	@Override
	public double area() {
		double s = (sideA + sideB + sideC) / 2.0;
		double area = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
		return area;
	}

	@Override
	public double perimeter() {
		return sideA + sideB + sideC;
	}

}