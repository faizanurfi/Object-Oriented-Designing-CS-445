public abstract class Creature extends Thing {
	protected Thing food = new Thing ("Nothing");
	
	public Creature(String n){
		super(n);
	}
		
	public void eat(Thing aThing)  {
		food = aThing;
		System.out.println(this.getName()+" has eaten "+aThing);
	}
	
	public void whatDidYouEat(){
		if(this.food.equals("")){
			System.out.println(this.getName()+" "+this.getClass()+" has had nothing to eat.");
		}
		else {
			System.out.println(this.getName()+" "+this.getClass()+" has eaten a "+this.food);
		}
	}
	
	public abstract void move();
}