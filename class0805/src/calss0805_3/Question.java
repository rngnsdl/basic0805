package calss0805_3;

public class Question implements Complexity {
	private String question; //문제
	private String answer;//답
	private int complexityLevel;//난이도
	
	Question(String newQuestion, String result){
		question = newQuestion;
		answer = result;
		complexityLevel = 1;
	}
	
	@Override
	public void setComplexity(int complexity) {//문제의 난이도를 주어진 값으로 변경
		complexityLevel = complexity;
	}
	
	@Override
	public int getComplexity() {//문제의 난이도를 반환
		return complexityLevel;
	}

	public String getQuestion() {
		return question;
	}

	public String getAnswer() {
		return answer;
	}

	public int getComplexityLevel() {
		return complexityLevel;
	}
	
	public boolean correct(String reply) { //클래스는 동등비교(==)를 주소(참조변수)가 같은지 확인하기 때문에 equals메서드를 사용한다.
		return answer.equals(reply);
	}
	
}
