package class0805_2.copy;

public abstract class PlayerStats {
	protected String player; //�����̸�
	protected String team;//����
	protected int score;//������
	
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
		sentence = "����: "+player+" ��: "+team+" ������: "+score;
		return  sentence;
	}
	
	public abstract void earnScore(int point); //����(����/proto/����)�θ� �ְ� ��ü({})����
	public void gainAssist() {
		System.out.println("�θ� ����");
	}
	
	
}
