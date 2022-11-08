package laptops;

public class Laptop {
	private String brandName = "ASUS";

	public Laptop() {
	}
	
	protected void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getBrandName() {
		return this.brandName;
	}
	
	public void bootUp() {
		System.out.println("booting up like a normal laptop");
	}
}
