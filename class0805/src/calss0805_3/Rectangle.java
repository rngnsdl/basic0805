package calss0805_3;

public class Rectangle extends Shape {
	
	private int length;// 가로
	private int width; // 세로
	
	Rectangle(String name, int length, int width){
		super.name = name;
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}
	
	@Override
	public int getArea() {
		int area;
		area = length*width;
		return area;
	}
	
	public int getPerimeter() {
		int perimeter;
		perimeter=2*length*width;
		return perimeter;
	}
}
