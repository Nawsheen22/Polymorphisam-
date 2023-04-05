
public class Cat1 extends Cat {
	
	String breed;
	

	@Override
	void print() {
		
		
		System.out.println("My meaw is so adorable.");
		System.out.println("I can not stop loving him");
		System.out.println("He gives me so much peace");
		System.out.println("He is adopted");
		
		
		}
	
@Override
	void print(String n, String g) {
		
		this.name =n;
		this.age=g;
		
		System.out.println("The name of my cat is:"+n);
		System.out.println("He is :"+g);
	    System.out.println("You need to know more about him!");
		
		
	}
	
	
   void print(String b) {
	   
	   this.breed=b;
	   
	   System.out.println("He is:"+b);
	   
	   
	   
	   
	   
   }



	
	

}
