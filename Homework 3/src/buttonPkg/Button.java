package buttonPkg;
import bulb.*;

public class Button implements Button_Interface {
	protected boolean bSwitch;
	
	LightBulb lb;
	
	public Button(){
		bSwitch = false;
		lb = new LightBulb();
	}
	
	public boolean switchOn(){
		bSwitch = true;
		System.out.println("Button switched to On");
		lb.on();
		return bSwitch;
	}

	public boolean switchOff(){
		bSwitch = false;
		System.out.println("Button switched to Off");
		lb.off();
		return bSwitch;
	}
	
	public boolean pushButton(){
		bSwitch  = !bSwitch;
		System.out.println("Is this light on?"+bSwitch);
		return bSwitch;
	}
}
