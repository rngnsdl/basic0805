package calss0805_3;

public class BusinessTaxPayer extends TaxPayer {
	private int sales; //�� �����
	private int expenses; //�Ѻ��
	
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
	
	String grandchild = super.toString(); /* super�� ���� ��쿡�� �ڵ����� this�� �ٱ� ������ 
													����Ŭ������ �ƴ� �ڱ��ڽ� ��,BusinessTaxPayer�� toString()�� ã�ư��Եȴ�.
													����� �޾Ҵ���, ��ӹ��� Ŭ�������� �������̵��� �Ͽ��� ������,
													�θ��� toString()�� ����ϰ� �ʹٸ� super�� �ٿ��߸� �Ѵ�.*/
	
	@Override
	public String toString() {
		String sentence="";
		sentence+="�� �����: "+sales+" �� ���: "+expenses;
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
