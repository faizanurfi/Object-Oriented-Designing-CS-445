package classes;

public class Thing {
	private String name = "";
	
	public Thing(String n){
		this.name  = n;
	}
	
	public String getName(){
		return name;
	}
	
	public String toString() {
		String s = "";
		if(this.getClass().getSimpleName().equals("Thing")) {
			s = this.getName();
		}
		else {
			s = this.getName()+" "+this.getClass().getSimpleName();
		}
		return s;
	}
}