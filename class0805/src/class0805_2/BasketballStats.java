package class0805_2;

public class BasketballStats extends PlayerStats{
	private int assist;//�����
	private int rebounds;//���ٿ�� ����
	
	BasketballStats(String player, String team){
		super(player, team);
		assist=0;
		rebounds = 0;
	}
	
	@Override
	public void earnScore(int point) {
		super.score += point;
	}
	
	public void gainAssist() {
		assist++;
	}
	
	public void gainRebounds() {
		rebounds++;
	}
	
	@Override
	public String toString() {
		String result=super.toString();
		result += "\n���Դϴ�-> �����: "+assist;
		result += " ���ٿ�� ����: "+rebounds+"\n";
		return result;
	}
}
