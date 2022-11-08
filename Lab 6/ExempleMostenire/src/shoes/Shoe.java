package shoes;

public class Shoe {
	public String brandName;
	
	public Shoe() {
		System.out.println("construct Shoe");
	}
	
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	public String getBrandName() {
		return this.brandName;
	}
	
	public void test() {
		System.out.println("Shoe implementantion");
	}
}
