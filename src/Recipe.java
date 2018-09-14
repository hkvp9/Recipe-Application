
public abstract class Recipe {

	String [] ingredients1  = {"eggs","flower","sugar","milk","Chocolate", "Vanilla"};
	String [] ingredients2 = {"Ice Cream", "Chocolate", "Cherries", "Whipped cream"};
//	protected Recipe [] ingredients = new Recipe [2];
	protected double prepTime;
	protected String dishName;
	
	Recipe(String[] ingredients, double prepTime, String dishName){
//		this.ingredients = ingredients;
		this.prepTime = prepTime;
		this.dishName = dishName;
	}
	
	public abstract void prepare();
	public abstract void taste();
	
	
	public void cleanUp(){
		System.out.println("Load the Dishwasher");
	}
	
	
	
}
