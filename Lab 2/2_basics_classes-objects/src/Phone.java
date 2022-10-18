public class Phone {
	public String brandName;
	public Integer ramMemorySize; // in MB
	
	public Phone() {
		brandName = "chinesse";
		ramMemorySize = 0;
	}
	
	public Phone(String brandName) {
		this.brandName = brandName;
	}

	public Phone(String brandName, Integer ramMemorySize) {
		this.brandName = brandName;
		this.ramMemorySize = ramMemorySize;
	}
	
	public void turnOn() {
		System.out.println(String.format("%s is booting up", brandName));
	}
	
	public void changeName(Phone phone) {
		phone = new Phone();
	}
}
