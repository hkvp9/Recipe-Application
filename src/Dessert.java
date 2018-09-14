

public class Dessert extends Recipe {
	
	public String name; 
	int bakeTime;
	int levelofSweetness;
	String creamColor;
	int marshmallow = 4;
	
	public Dessert(String[] ingredients, double prepTime, String dishName) {
		super(ingredients, prepTime, dishName);
	}
	
	public void batter( ){
	
		System.out.println("mixing");
	}
	
	public void bake(){
		System.out.println("baking");
	}
	public void decorate(){
		
	}
	public void decorate(String creamColor){
		
	}
	
	public  int decorate(String creamColor, int marshmallow){
		return marshmallow;
	}
	
	public String decorate(String[] creamColors){
		return "Decorating ";
		
	}
	static int decorate(int chocolateChips)	{
		return 6;
		
	}
	
	
	
	//@Override 
	public  void prepare(){
		batter();
		bake();
		decorate();
		System.out.println("is prepared");
	}
	//@Override
	public  void taste(){
		if(levelofSweetness > 4 ){
			System.out.println("YUM");
		}
		else{
			System.out.println("Yuck");
		}
	}


//	@Override
//	public String toString() {
//		return "Dessert [name=" + name + ", bakeTime=" + bakeTime
//				+ ", levelofSweetness=" + levelofSweetness + ", ingredients="
//				+ (ingredients) + ", prepTime=" + prepTime
//				+ ", dishName=" + dishName + ", getClass()=" + getClass()
//				+ ", hashCode()=" + hashCode() + ", toString()="
//				+ super.toString() + "]";
//	}

	//needed constructors from superclass Recipe

}
	
