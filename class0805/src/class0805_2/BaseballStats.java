package class0805_2;

public class BaseballStats extends PlayerStats{
	
	private int hits;//��Ÿ��
	private int errors;//������
	
	BaseballStats(String player, String team){
			super(player,team);
		hits = 0;
		errors = 0;
	}
	
	public void earnScore(int add) {
		score = score+score*2;
	}
	public void commitError() {
		errors++;
	}

	public int getHits() {
		return hits;
	}

	public int getErrors() {
		return errors;
	}
	
	@Override
	public String toString() {
		String result=super.toString();
		result += "\n�߱��Դϴ�-> ��Ÿ��: "+hits+" ������: "+errors+"\n";
		return result;
	}
	
}
