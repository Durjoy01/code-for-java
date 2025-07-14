public abstract class Polygon {
	private int numSide;

	public Polygon() {
	}

	public Polygon(int numSide) {
		this.numSide = numSide;
	}

	public int getNumSide() {
		return numSide;
	}

	public void setNumSide(int numSide) {
		this.numSide = numSide;
	}

	public abstract double area(); // abstract method

	public double perimeter() { // concrete method
		return 0.0;
	}
}