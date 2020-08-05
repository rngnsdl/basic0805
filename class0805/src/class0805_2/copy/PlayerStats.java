package class0805_2.copy;

public abstract class PlayerStats {
	protected String player; //선수이름
	protected String team;//팀명
	protected int score;//득점수
	
	PlayerStats(String player, String team){
		this.player = player;
		this.team = team;
		score = 0;
	}

	public String getPlayer() {
		return player;
	}

	public String getTeam() {
		return team;
	}

	public int getScore() {
		return score;
	}
	
	@Override
	public String toString() {
		String sentence="";
		sentence = "선수: "+player+" 팀: "+team+" 득점수: "+score;
		return  sentence;
	}
	
	public abstract void earnScore(int point); //정의(선언/proto/원형)부만 있고 몸체({})없음
	public void gainAssist() {
		System.out.println("부모 도움");
	}
	
	
}
