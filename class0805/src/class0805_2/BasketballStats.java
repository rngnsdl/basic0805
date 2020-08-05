package class0805_2;

public class BasketballStats extends PlayerStats{
	private int assist;//도움수
	private int rebounds;//리바운드 개수
	
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
		result += "\n농구입니다-> 도움수: "+assist;
		result += " 리바운드 개수: "+rebounds+"\n";
		return result;
	}
}
