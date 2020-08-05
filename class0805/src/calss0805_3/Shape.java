package calss0805_3;

public abstract class Shape {
	String name; // 이름

	public String getName() {
		return name;
	}
	
	public abstract int getArea(); //면적을 구하는 추상메서드
	public abstract int getPerimeter(); //둘레를 구하는 추상메서드
	
	
}
