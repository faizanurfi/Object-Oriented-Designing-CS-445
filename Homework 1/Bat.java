public class Bat extends Creature implements Flyer {
	public Bat(String n){
		super(n);
	}
	
	public void eat(Thing aThing){
		if(aThing.getClass().getSimpleName() != "Creature"){
			System.out.println(this.getName()+" "+this.getClass()+" won't eat a "+aThing);
		}
		
		else if(aThing.getClass().getSimpleName() == "Creature"){
			food = aThing;
			System.out.println(this.getName()+" has eaten "+aThing);
		}
	}
	
	public void fly(){
		System.out.println(this.getName()+" "+this.getClass()+" is swooping through the class.");
	}
	
	public void move(){
		this.fly();
	}
}