package classes;

public class Ant extends Creature {
	
	public Ant(String n) {
		super(n);
	}
	
	public String move(){
		System.out.println(this.getName()+" "+this.getClass().getSimpleName()+" is crawling around.");
		String s = this.getName()+" "+this.getClass().getSimpleName()+" is crawling around.";
		return s;
	}
}