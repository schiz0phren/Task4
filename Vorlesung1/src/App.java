
public class App {

	public static void main(String[] args) {
		
		System.out.println("helloWorld");

		Rectangle rectangle = new Rectangle(4, 2);

		Circle circle = new Circle(Integer.parseInt(args[0]));

		System.out.println("circle: " + circle.circ());
		System.out.println("rectangle " + rectangle.rect());
	}
}
