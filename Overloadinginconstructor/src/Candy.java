
public class Candy {
	
	String name;
	String origin;
	String type;
	int weight;
	String color;
	
	
	
	Candy(){
		
		System.out.println("Best Candy in the world!");
		
	}
	
	Candy(String name, String origin,String colour){
		
		this.name=name;
		this.origin=origin;
		this.color=colour;
		
		System.out.println("The name :"+name);
		System.out.println("Produced:"+origin);
		System.out.println("The colour:"+color);
		
		
	}
	
	Candy (String type, int weight){
		
		this.type=type;
		this.weight=weight;
		
		System.out.println("Type :"+type);
		System.out.println("Quantity:"+weight);
		
		
	}
	
	
	
	
}
