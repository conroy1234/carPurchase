package animal;


public class Lambters {

	public static void main(String[] args) {
		 Calculator calculator = (n) -> {
				int result = 1;
				for (int i = 1; i <= n; i++) {
					result += i * result;
				}
				return result;
			};
		
		Calculator calculate = (n) -> {
			int result = 1;
			for (int i = 1; i <= n; i++) {
				result += i * result;
			}
			return result;
		};
		System.out.println("***" + calculate.calculate(10));
	}

	
	
}

interface Calculator {
	public int calculate(int n);
}