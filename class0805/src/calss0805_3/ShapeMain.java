package calss0805_3;

public class ShapeMain {

	public static void main(String[] args) {
		
		Rectangle retangle = new Rectangle("����",5,3);
		
		int area;
		int perimeter;
		
		area = retangle.getArea();
		perimeter = retangle.getPerimeter();
		
		String toolsresult="";
		toolsresult = "�̸���: "+retangle.getName()+"\t ���δ�: "+retangle.getLength()+"\t���δ�: "+retangle.getWidth();
		
		System.out.println(toolsresult);
		
		String result ="";
		result = "������: "+area+"\t�ѷ���: "+perimeter;
		System.out.println(result);
	}

}
