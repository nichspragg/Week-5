
public class App {

	public static void main(String[] args) {
		Logger ast = new AsteriskLogger();
		Logger spa = new SpacedLogger();
		
		ast.Log("Hola");
		ast.error("Adios");
		
		spa.Log("Bonjour");
		spa.error("Revoir");
	}
}