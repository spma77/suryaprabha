package oopsconcepts;

public class Circle extends Shape implements ShapeConstants {
	double radious;
	public Circle(){
		noOfSides = 0;
		radious =5;
		
	}

	@Override
	public double calculateArea() {
		area = pi*radious*radious;
		// TODO Auto-generated method stub
		return area;
	}

	@Override
	public double calculatePerimeter() {
		perimeter = 2*radious*radious;
		// TODO Auto-generated method stub
		return perimeter;
	}

	@Override
	public void setSides() {
		noOfSides = 0;
		// TODO Auto-generated method stub

	}

}
