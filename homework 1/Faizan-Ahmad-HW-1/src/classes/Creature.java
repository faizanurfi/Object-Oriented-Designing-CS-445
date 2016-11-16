package classes;

public abstract class Creature extends Thing {

	public Thing food = new Thing ("Nothing");
	
	public Creature(String n){
		super(n);
	}
		
	public String eat(Thing aThing)  {
		food = aThing;
		System.out.println(this.getName()+" is eating a "+aThing);
		String s = this.getName()+" is eating a "+aThing;
		return s;
	}
	
	public String whatDidYouEat(){
		String s = "";
		if(this.food.getName().equals("Nothing")){
			System.out.println(this.getName()+" "+this.getClass().getSimpleName()+" has had nothing to eat.");
			s = this.getName()+" "+this.getClass().getSimpleName()+" has had nothing to eat.";
		}
		else {
			System.out.println(this.getName()+" "+this.getClass().getSimpleName()+" has eaten a "+this.food.getName());
			s = this.getName()+" "+this.getClass().getSimpleName()+" has eaten a "+this.food.getName();
		}
		return s;
	}
	
	public abstract String move();
}