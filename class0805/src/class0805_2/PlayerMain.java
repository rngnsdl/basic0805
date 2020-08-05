package class0805_2;

public class PlayerMain {

	public static void main(String[] args) {
		
		//다형성 부모의 참조변수로 자식 객체를 가리킴
		PlayerStats p1 = new BaseballStats("김광현", "SK");
		PlayerStats p12 = new BasketballStats("골스", "커리");
		
		BaseballStats b1 =(BaseballStats)p1;

	}
}
