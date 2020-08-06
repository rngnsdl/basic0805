package calss0805_3;

public class BusinessTaxPayer extends TaxPayer {
	private int sales; //총 매출액
	private int expenses; //총비용
	
	public BusinessTaxPayer(String name, int number, int sales, int expenses) {
		super(name,number);
		setSales(sales);
		setExpenses(expenses);
	}

	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}

	public int getExpenses() {
		return expenses;
	}

	public void setExpenses(int expenses) {
		this.expenses = expenses;
	}
	
	String grandchild = super.toString(); /* super가 없을 경우에는 자동으로 this가 붙기 때문에 
													조상클래스가 아닌 자기자신 즉,BusinessTaxPayer의 toString()을 찾아가게된다.
													상속을 받았더라도, 상속받은 클래스에서 오버라이딩을 하였기 때문에,
													부모의 toString()을 사용하고 싶다면 super를 붙여야만 한다.*/
	
	@Override
	public String toString() {
		String sentence="";
		sentence+="총 매출액: "+sales+" 총 비용: "+expenses;
		return sentence;
	}
	
	public double computeTax() {
		double taxableAmount = sales - expenses;
		if(taxableAmount<=0) 
			return 0;
		else
			return taxableAmount * 0.2;
	}
	
	
	
}
