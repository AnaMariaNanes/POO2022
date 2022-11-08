package laptops;

public class LaptopCreator {

	public static void main(String[] args) {

		Laptop gamingLaptop = new GamingLaptop();
		BusinessLaptop businessLaptop = new BusinessLaptop();

		gamingLaptop.bootUp();
		//businessLaptop.bootUp();
		((BusinessLaptop) gamingLaptop).test();
	}

}
