package carPurchase;

public class Customer {

	private String name;
	private String address;
	private double cashInHand;

	public Customer(String name, String address, double cashInHand) {
		this.name = name;
		this.address = address;
		this.cashInHand = cashInHand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getCashInHand() {
		return cashInHand;
	}

	public void setCashInHand(double cashInHand) {
		this.cashInHand = cashInHand;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", cashInHand=" + cashInHand + "]";
	}

	public void purchaseCar(Employee employee, Car car, boolean finance) {

		employee.processTransaction(this, car, finance);
	}	

}
