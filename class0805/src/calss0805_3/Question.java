package calss0805_3;

public class Question implements Complexity {
	private String question; //����
	private String answer;//��
	private int complexityLevel;//���̵�
	
	Question(String newQuestion, String result){
		question = newQuestion;
		answer = result;
		complexityLevel = 1;
	}
	
	@Override
	public void setComplexity(int complexity) {//������ ���̵��� �־��� ������ ����
		complexityLevel = complexity;
	}
	
	@Override
	public int getComplexity() {//������ ���̵��� ��ȯ
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
	
	public boolean correct(String reply) { //Ŭ������ �����(==)�� �ּ�(��������)�� ������ Ȯ���ϱ� ������ equals�޼��带 ����Ѵ�.
		return answer.equals(reply);
	}
	
}
