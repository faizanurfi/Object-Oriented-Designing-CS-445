package classes;

public class Tiger extends Creature {
	
	public Tiger(String n) {
		super(n);
	}
	
	public String move() {
		System.out.println(this.getName()+" "+this.getClass().getSimpleName()+" has just pounced.");
		String s = this.getName()+" "+this.getClass().getSimpleName()+" has just pounced.";
		return s;
	}
}