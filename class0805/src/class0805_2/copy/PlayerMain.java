package class0805_2.copy;

public class PlayerMain {

	public static void main(String[] args) {
		
		BaseballStats baseball = new BaseballStats("ȫ�浿", "ȣ����");
		
		BasketballStats basketball = new BasketballStats("�տ���", "����");
		
		baseball.getHits();
		baseball.earnScore(1);
		baseball.getHits();
		baseball.commitError();
		
		basketball.earnScore(2);
		basketball.gainRebounds();
		basketball.gainAssist();
		basketball.earnScore(3);
		basketball.gainAssist();
		basketball.gainRebounds();
		System.out.println(baseball);
		System.out.println(basketball);
	}

}
