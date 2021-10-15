
public class App {

	public static void main(String[] args) {
		TestDemo testDemo = new TestDemo();
		
		try {
			System.out.println(testDemo.addPositive(20, -40));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		System.out.println(testDemo.randomNumberSquared());
	}
}
