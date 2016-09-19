public class Fly extends Creature implements Flyer {
	
	public Fly(String n){
		super(n);
	}
	
	public void eat(Thing aThing){
		
		if(aThing.getClass().getSimpleName() == "Creature"){
			System.out.println(this.getName()+" "+this.getClass()+" won't eat a "+aThing+".");
		}
		
		else {
		food = aThing;
		System.out.println(this.getName()+" has eaten "+aThing);		}
	}
	
	public void move(){
		this.fly();
	}
	
	public void fly() {
		System.out.println(this.getName()+" "+this.getClass()+" is buzzing around in flight.");
	}
}