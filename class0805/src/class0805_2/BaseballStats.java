package class0805_2;

public class BaseballStats extends PlayerStats{
	
	private int hits;//안타수
	private int errors;//에러수
	
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
		result += "\n야구입니다-> 안타수: "+hits+" 에러수: "+errors+"\n";
		return result;
	}
	
}
