// come up with own set of attributes & methods
public class Starter extends Recipe {

	String typeofStarter;
	char size;
	
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Preparing the starter");
	}
	@Override
	public void taste() {
		System.out.println("tasting the starter");
		// TODO Auto-generated method stub
	}
	public Starter(String[] ingredients, double prepTime, String dishName) {
		super(ingredients, prepTime, dishName);
		// TODO Auto-generated constructor stub
	}
	
	

	
	
}
