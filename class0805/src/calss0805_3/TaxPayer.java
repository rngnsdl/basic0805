package calss0805_3;

public abstract class TaxPayer {
	protected String name; //이름
	protected int number; //번호
	
	TaxPayer(String name, int number){
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}
	
	@Override
	public String toString() {
		String result="";
		result += "이름: "+name+" 번호: "+number;
		return result;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public abstract double computeTax();
	
}
