package bulb;

public class LightBulb {
	protected boolean isOn;
	
	public LightBulb(){
		isOn = false;
	}
	
	public boolean on(){
		isOn = true;
		System.out.println("Lightbulb on");
		return isOn;
	}
	
	public boolean off(){
		isOn = false;
		System.out.println("Lightbulb off");
		return isOn;
	}
}