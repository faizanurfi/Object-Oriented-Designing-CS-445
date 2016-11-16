package classes;

public class Bat extends Creature implements Flyer {
	
	public Bat(String n){
		super(n);
	}
	
	public String eat(Thing aThing){
		String s = "";
		if(!(aThing.getClass().getSuperclass().getSimpleName().equals("Creature"))){
			System.out.println(this.getName()+" "+this.getClass().getSimpleName()+" won't eat a "+aThing.getName());
			s = this.getName()+" "+this.getClass().getSimpleName()+" won't eat a "+aThing.getName();
		}
		else if(aThing.getClass().getSuperclass().getSimpleName().equals("Creature")){
			food = aThing;
			System.out.println(this.getName()+" is eating a "+aThing.getName());
			s = this.getName()+" is eating a "+aThing.getName();
		}
		return s;
	}
	
	public String fly(){
		System.out.println(this.getName()+" "+this.getClass().getSimpleName()+" is swooping through the class.");
		String s = this.getName()+" "+this.getClass().getSimpleName()+" is swooping through the class.";
		return s;
	}
	
	public String move(){
		return this.fly();
	}
}