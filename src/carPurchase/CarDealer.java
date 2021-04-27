package carPurchase;

public class CarDealer {

	public static void main(String[] args) {
		Customer customer = new Customer("Toney Bailey ", " 32 Marston Avenue Dagenham RM10 7JX", 20000);
		Employee employee = new Employee("Conroy White", " 52 the Grove");		
		Car car = new Car("BMW", "X6", 20000);
		customer.purchaseCar(employee, car, false);			

	}

}
