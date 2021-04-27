package carPurchase;

public class Employee {

	private String name;
	private String grade;

	public Employee(String name, String grade) {
		this.name = name;
		this.grade = grade;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void processTransaction(Customer customer, Car car, boolean finance) {
		if (finance) {
			double loanAmount = car.getPrice() - customer.getCashInHand();
			credatCheck(customer, loanAmount);
		} else if (customer.getCashInHand() >= car.getPrice()) {
			processCashPayment(customer,car);
		} else {
			purchaseDecline(customer);
		}

	}

	private void purchaseDecline(Customer customer) {
		System.out.println("we are sorry :" + customer + " your credit check has failed");

	}

	private void processCashPayment(Customer customer, Car car) {
		System.out.println("processing purchase for " + customer + " who has purchase car " + car + " with cash");

	}

	private void credatCheck(Customer customer, double loanAmount) {
		System.out.println("carrying out credit check...");
		System.out.println("processing purchase for " + customer + " loan amount " + loanAmount);
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", grade=" + grade + "]";
	}

}
