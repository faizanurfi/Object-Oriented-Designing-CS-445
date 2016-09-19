public class Ant extends Creature {
	
	public Ant(String n) {
		super(n);
	}
	
	public void move(){
		System.out.println(this.getName()+" "+this.getClass()+" is crawling around.");
	}
}