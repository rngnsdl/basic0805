package calss0805_3;

import java.util.Scanner;

public class QuestionTest {

	public static void main(String[] args) {

		Question q1, q2;
		String input, input1;
		Scanner scanner = new Scanner(System.in);
		
		q1 = new Question("�ѱ��� ��ȭ��?" , "����ȭ");
		q1.setComplexity(3);
		q2 = new Question("�ѱ����� ���� ���� ����?" , "�Ѷ��");
		
		q2.setComplexity(7);
		System.out.println(q1.getQuestion());
		System.out.println("���� �Է��ϼ���: ");
		input = scanner.next();
		if(q1.correct(input)==true) 
			System.out.println("�¾ҽ��ϴ�.");
		else {
			System.out.println("Ʋ�Ƚ��ϴ�.");
			
			System.out.println("������: "+q1.getAnswer()+"\n");
		}
		
		System.out.println(q2.getQuestion());
		System.out.println("���� �Է��ϼ���: ");
		input1 = scanner.next();
		if(q2.correct(input1)==true) 
			System.out.println("�¾ҽ��ϴ�.");
		else {
			System.out.println("Ʋ�Ƚ��ϴ�.");
			System.out.println("������: "+q2.getAnswer()+"\n");
		}
		
		
	}

}
