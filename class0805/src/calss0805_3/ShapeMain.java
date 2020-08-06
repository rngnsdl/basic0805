package calss0805_3;

public class ShapeMain {

	public static void main(String[] args) {
		
		Rectangle retangle = new Rectangle("내땅",5,3);
		
		int area;
		int perimeter;
		
		area = retangle.getArea();
		perimeter = retangle.getPerimeter();
		
		String toolsresult="";
		toolsresult = "이름은: "+retangle.getName()+"\t 가로는: "+retangle.getLength()+"\t세로는: "+retangle.getWidth();
		
		System.out.println(toolsresult);
		
		String result ="";
		result = "면적은: "+area+"\t둘레는: "+perimeter;
		System.out.println(result);
	}

}
