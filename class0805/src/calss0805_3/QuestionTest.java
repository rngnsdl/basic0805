package calss0805_3;

import java.util.Scanner;

public class QuestionTest {

	public static void main(String[] args) {

		Question q1, q2;
		String input, input1;
		Scanner scanner = new Scanner(System.in);
		
		q1 = new Question("한국의 국화는?" , "무궁화");
		q1.setComplexity(3);
		q2 = new Question("한국에서 제일 높은 산은?" , "한라산");
		
		q2.setComplexity(7);
		System.out.println(q1.getQuestion());
		System.out.println("답을 입력하세요: ");
		input = scanner.next();
		if(q1.correct(input)==true) 
			System.out.println("맞았습니다.");
		else {
			System.out.println("틀렸습니다.");
			
			System.out.println("정답은: "+q1.getAnswer()+"\n");
		}
		
		System.out.println(q2.getQuestion());
		System.out.println("답을 입력하세요: ");
		input1 = scanner.next();
		if(q2.correct(input1)==true) 
			System.out.println("맞았습니다.");
		else {
			System.out.println("틀렸습니다.");
			System.out.println("정답은: "+q2.getAnswer()+"\n");
		}
		
		
	}

}
