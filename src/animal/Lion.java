package animal;

import java.util.Scanner;

public class Lion {
	
	public static void main(String[] args) {
		eatFood(()->System.out.println("the food is nice"));
		
		eatFood(()->{
			System.out.println("please enter your age");
			Scanner in = new Scanner(System.in);
			int age = in.nextInt();
			System.out.println("please enter your name");
			String name= in.next();
			System.out.println(age+" "+name);
		});
	}

	public static void eatFood(Animal animal) {
		animal.eat();
	}


}
