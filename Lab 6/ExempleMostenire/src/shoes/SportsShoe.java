package shoes;

public class SportsShoe extends Shoe {
	private Double soleFlexibilityIndex;
	
	public String brandName;

	public SportsShoe() {
		System.out.println("construct SportsShoe");
	}
	
	@Override
	public void test() {
		System.out.println("SportsShoe implementantion");
	}
	
	public void test(String testParameter) {
		// just to demonstrate overloading
	}
}
