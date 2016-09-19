public class Tiger extends Creature {
	
	public Tiger(String n){
		super(n);
	}
	
	public void move(){
		System.out.println(this.getName()+" "+this.getClass()+" has just pounced.");
	}
}