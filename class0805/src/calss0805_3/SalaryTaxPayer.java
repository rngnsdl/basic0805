package calss0805_3;

public class SalaryTaxPayer extends TaxPayer {
	private int salary; //월급
	
	SalaryTaxPayer(String name, int number, int salary){
		super(name,number);
		setSalary(salary);
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		String combine = super.toString()+"월급: "+salary;
		return combine;
	}
	
	@Override
	public double computeTax() {
		double cost;
		cost = salary * 12;
		
		if(cost<2000000)		 cost *= 0.5;
		else if(cost<4000000)	return cost *= 0.1;
		else if(cost<6000000)	return cost *= 0.15;
		else if(cost<8000000)	return cost *= 0.3;
		return cost;
	}
	
}
