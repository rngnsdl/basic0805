package calss0805_3;

public class TaxPayerMain {

	public static void main(String[] args) {
		SalaryTaxPayer payer1 = new SalaryTaxPayer("¼±³²", 100, 300);
		System.out.println(payer1);
		System.out.println(payer1.computeTax());
		TaxPayer payer2 = new BusinessTaxPayer("¼±³à", 100, 12000000, 750000000);
		System.out.println(payer2);
		System.out.println(payer2.computeTax());
	}

}
