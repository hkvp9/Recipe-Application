import java.util.Set;

public class Prep  {

	public static void main(String[] args) {
		
		String [] ingredients1  = {"eggs","flower","sugar","milk","Chocolate", "Vanilla"};
		String [] ingredients2 = {"Ice Cream", "Chocolate", "Cherries", "Whipped cream"};
		
		Dessert d = new Dessert (ingredients1,  30, "Lava cake" );
		d.bakeTime= 30;
		d.dishName = "Lava Cake";
		d.levelofSweetness = 3;
		System.out.println(d.dishName);
		System.out.println(d);
		
		
		
//		//Triangle t = new Triangle(  );
//		t.height = 16;
//		t.base = 23;
//		t.calculateArea();
//		
		
		
	}
	
}
